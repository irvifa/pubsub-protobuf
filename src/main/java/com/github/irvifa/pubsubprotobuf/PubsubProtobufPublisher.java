package com.github.irvifa.pubsubprotobuf;

import static com.google.pubsub.v1.PubsubMessage.*;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutureCallback;
import com.google.api.core.ApiFutures;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.common.util.concurrent.Futures;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.pubsub.v1.PubsubMessage;
import java.util.concurrent.Future;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PubsubProtobufPublisher<T extends Message> implements ProtobufPublisher<T> {
  private static final Logger logger = LoggerFactory.getLogger(PubsubProtobufPublisher.class);

  final Publisher publisher;
  private final String eventName;

  PubsubProtobufPublisher(Publisher publisher, String eventName) {
    this.publisher = publisher;
    this.eventName = eventName;
  }

  @Override
  public Future<Void> publish(T event) {
    long publishTimeMillis = getCurrentTimeMillis();
    try {
      ApiFuture<String> idFuture = publishData(event);
      onPublishCallBack(eventName, idFuture, publishTimeMillis);

      Future<Void> dummyResult = Futures.immediateFuture(null);
      return dummyResult;
    } catch (InvalidProtocolBufferException e) {
      // This exception happens if there are unknown Any types in the message.
      // Since we don't use any Any (proto3 feature) hopefully we can safely assume this won't happen.
      IllegalStateException wrappedException = new IllegalStateException(e);
      logger.error("Schema should not have field with Any type.", wrappedException);
      return Futures.immediateFailedFuture(wrappedException);
    }
  }

  long getCurrentTimeMillis() {
    return System.currentTimeMillis();
  }

  private ApiFuture<String> publishData(T event)
      throws InvalidProtocolBufferException {
    ByteString payload = convertToPayload(event);

    PubsubMessage message = newBuilder()
        .setData(payload)
        .build();
    ApiFuture<String> idFuture = publisher.publish(message);
    return idFuture;
  }

  ByteString convertToPayload(Message event) throws InvalidProtocolBufferException {
    return event.toByteString();
  }

  private void onPublishCallBack(final String eventName, ApiFuture<String> idFuture, final long publishTimeMillis) {
    ApiFutures.addCallback(idFuture, new ApiFutureCallback<String>() {
      @Override
      public void onSuccess(@Nullable String result) {
        // On success handle.
      }

      @Override
      public void onFailure(Throwable t) {
        logger.error("Failed to publish event: " + eventName + " error: " + t.getMessage(), t);
      }
    });
  }
}
