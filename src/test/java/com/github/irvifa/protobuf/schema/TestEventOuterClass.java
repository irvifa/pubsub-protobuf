// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test-event.proto

package com.github.irvifa.protobuf.schema;

public final class TestEventOuterClass {
  private TestEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TestEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TestEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string event_name = 1 [default = "test.event"];</code>
     * @return Whether the eventName field is set.
     */
    boolean hasEventName();
    /**
     * <code>optional string event_name = 1 [default = "test.event"];</code>
     * @return The eventName.
     */
    java.lang.String getEventName();
    /**
     * <code>optional string event_name = 1 [default = "test.event"];</code>
     * @return The bytes for eventName.
     */
    com.google.protobuf.ByteString
        getEventNameBytes();

    /**
     * <code>optional string name = 2;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>optional string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string email = 3;</code>
     * @return Whether the email field is set.
     */
    boolean hasEmail();
    /**
     * <code>optional string email = 3;</code>
     * @return The email.
     */
    java.lang.String getEmail();
    /**
     * <code>optional string email = 3;</code>
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString
        getEmailBytes();
  }
  /**
   * Protobuf type {@code TestEvent}
   */
  public  static final class TestEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TestEvent)
      TestEventOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TestEvent.newBuilder() to construct.
    private TestEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TestEvent() {
      eventName_ = "test.event";
      name_ = "";
      email_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TestEvent();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TestEvent(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              eventName_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              name_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              email_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.irvifa.protobuf.schema.TestEventOuterClass.internal_static_TestEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.irvifa.protobuf.schema.TestEventOuterClass.internal_static_TestEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent.class, com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent.Builder.class);
    }

    private int bitField0_;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object eventName_;
    /**
     * <code>optional string event_name = 1 [default = "test.event"];</code>
     * @return Whether the eventName field is set.
     */
    public boolean hasEventName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string event_name = 1 [default = "test.event"];</code>
     * @return The eventName.
     */
    public java.lang.String getEventName() {
      java.lang.Object ref = eventName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          eventName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string event_name = 1 [default = "test.event"];</code>
     * @return The bytes for eventName.
     */
    public com.google.protobuf.ByteString
        getEventNameBytes() {
      java.lang.Object ref = eventName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>optional string name = 2;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EMAIL_FIELD_NUMBER = 3;
    private volatile java.lang.Object email_;
    /**
     * <code>optional string email = 3;</code>
     * @return Whether the email field is set.
     */
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string email = 3;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          email_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string email = 3;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eventName_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, email_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eventName_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, email_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent)) {
        return super.equals(obj);
      }
      com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent other = (com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent) obj;

      if (hasEventName() != other.hasEventName()) return false;
      if (hasEventName()) {
        if (!getEventName()
            .equals(other.getEventName())) return false;
      }
      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasEmail() != other.hasEmail()) return false;
      if (hasEmail()) {
        if (!getEmail()
            .equals(other.getEmail())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasEventName()) {
        hash = (37 * hash) + EVENT_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getEventName().hashCode();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasEmail()) {
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TestEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TestEvent)
        com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.irvifa.protobuf.schema.TestEventOuterClass.internal_static_TestEvent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.irvifa.protobuf.schema.TestEventOuterClass.internal_static_TestEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent.class, com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent.Builder.class);
      }

      // Construct using com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        eventName_ = "test.event";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        email_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.github.irvifa.protobuf.schema.TestEventOuterClass.internal_static_TestEvent_descriptor;
      }

      @java.lang.Override
      public com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent getDefaultInstanceForType() {
        return com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent.getDefaultInstance();
      }

      @java.lang.Override
      public com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent build() {
        com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent buildPartial() {
        com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent result = new com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.eventName_ = eventName_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.email_ = email_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent) {
          return mergeFrom((com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent other) {
        if (other == com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent.getDefaultInstance()) return this;
        if (other.hasEventName()) {
          bitField0_ |= 0x00000001;
          eventName_ = other.eventName_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasEmail()) {
          bitField0_ |= 0x00000004;
          email_ = other.email_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object eventName_ = "test.event";
      /**
       * <code>optional string event_name = 1 [default = "test.event"];</code>
       * @return Whether the eventName field is set.
       */
      public boolean hasEventName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string event_name = 1 [default = "test.event"];</code>
       * @return The eventName.
       */
      public java.lang.String getEventName() {
        java.lang.Object ref = eventName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            eventName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string event_name = 1 [default = "test.event"];</code>
       * @return The bytes for eventName.
       */
      public com.google.protobuf.ByteString
          getEventNameBytes() {
        java.lang.Object ref = eventName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          eventName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string event_name = 1 [default = "test.event"];</code>
       * @param value The eventName to set.
       * @return This builder for chaining.
       */
      public Builder setEventName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        eventName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string event_name = 1 [default = "test.event"];</code>
       * @return This builder for chaining.
       */
      public Builder clearEventName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        eventName_ = getDefaultInstance().getEventName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string event_name = 1 [default = "test.event"];</code>
       * @param value The bytes for eventName to set.
       * @return This builder for chaining.
       */
      public Builder setEventNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        eventName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 2;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string name = 2;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>optional string email = 3;</code>
       * @return Whether the email field is set.
       */
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string email = 3;</code>
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            email_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmail() {
        bitField0_ = (bitField0_ & ~0x00000004);
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TestEvent)
    }

    // @@protoc_insertion_point(class_scope:TestEvent)
    private static final com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent();
    }

    public static com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TestEvent>
        PARSER = new com.google.protobuf.AbstractParser<TestEvent>() {
      @java.lang.Override
      public TestEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TestEvent(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TestEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TestEvent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.github.irvifa.protobuf.schema.TestEventOuterClass.TestEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TestEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TestEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020test-event.proto\"H\n\tTestEvent\022\036\n\nevent" +
      "_name\030\001 \001(\t:\ntest.event\022\014\n\004name\030\002 \001(\t\022\r\n" +
      "\005email\030\003 \001(\tB#\n!com.github.irvifa.protob" +
      "uf.schema"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TestEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TestEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TestEvent_descriptor,
        new java.lang.String[] { "EventName", "Name", "Email", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}