package com.github.irvifa.pubsubprotobuf;

import com.google.protobuf.Message;
import java.util.concurrent.Future;

public interface ProtobufPublisher<T extends Message> {
  Future<Void> publish(T event);
}
