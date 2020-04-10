package com.github.irvifa.pubsubprotobuf;

import com.github.irvifa.protobuf.schema.TestEventOuterClass;
import com.google.api.core.ApiFutures;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.pubsub.v1.PubsubMessage;
import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PubsubProtobufPublisherTest {

  @Mock
  Publisher pubsubPublisherMock;

  private PubsubProtobufPublisher<TestEventOuterClass.TestEvent> protoPublisher;

  @Before
  public void setUp() {
    protoPublisher = new PubsubProtobufPublisher<>(
        pubsubPublisherMock,
        "test.event");
  }

  @Test
  public void testConvertToPayload() throws InvalidProtocolBufferException {
    TestEventOuterClass.TestEvent testEvent = TestEventOuterClass.TestEvent.newBuilder()
        .build();
    ByteString converted = protoPublisher.convertToPayload(testEvent);
    assertThat(TestEventOuterClass.TestEvent.parseFrom(converted), equalTo(testEvent));
  }

  @Test
  public void testTrack() throws ExecutionException, InterruptedException {
    TestEventOuterClass.TestEvent testEvent = TestEventOuterClass.TestEvent.newBuilder()
        .setEmail("yahu@yahu.com")
        .setName("yahu")
        .build();

    PubsubProtobufPublisher<TestEventOuterClass.TestEvent> protoPublisherSpy = spy(protoPublisher);
    when(protoPublisherSpy.getCurrentTimeMillis()).thenReturn(1234L);

    when(pubsubPublisherMock.publish(any(PubsubMessage.class)))
        .thenReturn(ApiFutures.immediateFuture("99"));

    Future<Void> track = protoPublisherSpy.publish(testEvent);

    ArgumentCaptor<PubsubMessage> pubsubMessageCaptor = ArgumentCaptor
        .forClass(PubsubMessage.class);
    verify(pubsubPublisherMock, times(1)).publish(pubsubMessageCaptor.capture());
    assertThat(pubsubMessageCaptor.getValue().getData(), equalTo(testEvent.toByteString()));
    assertThat(track.get(), is(IsNull.nullValue()));
  }
}
