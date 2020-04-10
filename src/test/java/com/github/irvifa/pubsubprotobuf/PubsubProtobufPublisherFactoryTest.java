package com.github.irvifa.pubsubprotobuf;

import com.github.cakraww.commons.gcp.pubsub.PublisherFactory;
import com.github.irvifa.protobuf.schema.TestEventOuterClass;
import java.io.IOException;
import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class PubsubProtobufPublisherFactoryTest {
  @Mock
  PublisherFactory publisherFactoryMock;

  private PubsubProtobufPublisherFactory underTest;

  @Before
  public void setUp() throws IOException {
    underTest = new PubsubProtobufPublisherFactory(publisherFactoryMock);
  }

  @Test
  public void testCreateProtoPublisher_success() throws Exception {
    ProtobufPublisher<TestEventOuterClass.TestEvent> protoPublisher = underTest.createProtobufPublisher(
        TestEventOuterClass.TestEvent.getDefaultInstance());
    verify(publisherFactoryMock, times(1)).createPublisher("test.event");
    assertThat(underTest.protobufPublishers.size(), equalTo(1));
    assertThat(protoPublisher, is(IsNull.notNullValue()));
  }
}
