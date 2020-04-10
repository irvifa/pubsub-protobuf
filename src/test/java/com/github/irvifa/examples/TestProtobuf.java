package com.github.irvifa.examples;

import com.github.irvifa.protobuf.schema.TestEventOuterClass;
import com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent;
import com.github.irvifa.pubsubprotobuf.ProtobufPublisher;
import com.github.irvifa.pubsubprotobuf.PubsubProtobufPublisherFactory;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.Message;
import java.io.IOException;
import java.util.concurrent.Future;
import org.junit.Ignore;
import org.junit.Test;

public class TestProtobuf {
  @Test
  @Ignore
  public void testDefaultUsage() throws IOException, InterruptedException {
    String privateKey = System.getenv("PRIVATE_KEY");
    if (privateKey == null) {
      throw new IllegalArgumentException("set PRIVATE_KEY env variable");
    }
    String projectId = "sample-project";
    PubsubProtobufPublisherFactory protoPublisherPubsubFactory =
        PubsubProtobufPublisherFactory.newBuilder(projectId, privateKey).build();

    ProtobufPublisher<TestEvent> testEventPublisher =
        protoPublisherPubsubFactory.createProtobufPublisher(TestEventOuterClass.TestEvent.getDefaultInstance());

    TestEventOuterClass.TestEvent testEvent = TestEventOuterClass.TestEvent.newBuilder()
        .setEmail("email1@ahud")
        .build();
    Message msg = testEvent;
    Future<Void> trackFuture = testEventPublisher.publish(testEvent);
    Futures.addCallback((ListenableFuture<Void>) trackFuture, new FutureCallback<Void>() {
      @Override
      public void onFailure(Throwable t) {
        System.out.println("FAILURE");
      }

      @Override
      public void onSuccess(Void result) {
        System.out.println("SUCCESS");
      }
    });

    protoPublisherPubsubFactory.shutdown();
  }
}
