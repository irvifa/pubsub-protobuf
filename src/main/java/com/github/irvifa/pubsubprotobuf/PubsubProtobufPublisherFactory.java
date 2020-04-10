package com.github.irvifa.pubsubprotobuf;

import com.github.cakraww.commons.gcp.pubsub.PublisherFactory;
import com.github.cakraww.commons.gcp.pubsub.PublisherFactoryImpl;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PubsubProtobufPublisherFactory {
  private static final Logger LOGGER = LoggerFactory.getLogger(PubsubProtobufPublisher.class);
  final List<PubsubProtobufPublisher> protobufPublishers =
      Collections.synchronizedList(new ArrayList<PubsubProtobufPublisher>());
  private final PublisherFactory publisherFactory;

  private PubsubProtobufPublisherFactory(Builder builder) throws IOException {
    // Because we don't have ideal way to store config
    String privateKeyBase64;
    if (builder.privateKeyBase64 != null) {
      privateKeyBase64 = builder.privateKeyBase64;
    } else {
      throw new IllegalArgumentException("Please provide private key to PubsubPublisher");
    }

    this.publisherFactory = new PublisherFactoryImpl.Builder(builder.projectId)
        .setPrivateKeyBase64(privateKeyBase64)
        .build();
  }

  PubsubProtobufPublisherFactory(PublisherFactory publisherFactory) {
    this.publisherFactory = publisherFactory;
  }

  public static Builder newBuilder(String projectId, String privateKeyBase64) {
    return new Builder(projectId, privateKeyBase64);
  }

  public <T extends Message> ProtobufPublisher<T> createProtobufPublisher(T defaultInstance) throws IOException {
    String eventName = getEventName(defaultInstance);
    Publisher publisher = this.publisherFactory.createPublisher(eventName);
    PubsubProtobufPublisher<T> protoPublisher = new PubsubProtobufPublisher<>(publisher, eventName);
    protobufPublishers.add(protoPublisher);
    return protoPublisher;
  }

  private String getEventName(Message event) {
    Descriptors.FieldDescriptor eventNameFD = event.getDescriptorForType().findFieldByName(Constants.EVENT_NAME_FIELD);
    String eventName = (String) event.getField(eventNameFD);
    return eventName;
  }

  public void shutdown() {
    this.publisherFactory.shutdown();
  }

  public static final class Builder {
      String projectId;
      String privateKeyBase64;

    Builder(String projectId, String privateKeyBase64) {
      this.projectId = projectId;
      this.privateKeyBase64 = privateKeyBase64;
    }

    public PubsubProtobufPublisherFactory build() throws IOException {
      return new PubsubProtobufPublisherFactory(this);
    }
  }
}
