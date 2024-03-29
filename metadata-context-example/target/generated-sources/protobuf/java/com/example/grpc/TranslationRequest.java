// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExampleServices.proto

package com.example.grpc;

/**
 * Protobuf type {@code com.example.grpc.TranslationRequest}
 */
public  final class TranslationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.TranslationRequest)
    TranslationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TranslationRequest.newBuilder() to construct.
  private TranslationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TranslationRequest() {
    message_ = "";
    from_ = 0;
    to_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TranslationRequest(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            from_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            to_ = rawValue;
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
    return com.example.grpc.ExampleServices.internal_static_com_example_grpc_TranslationRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.ExampleServices.internal_static_com_example_grpc_TranslationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.TranslationRequest.class, com.example.grpc.TranslationRequest.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 1;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROM_FIELD_NUMBER = 2;
  private int from_;
  /**
   * <code>.com.example.grpc.Language from = 2;</code>
   */
  public int getFromValue() {
    return from_;
  }
  /**
   * <code>.com.example.grpc.Language from = 2;</code>
   */
  public com.example.grpc.Language getFrom() {
    com.example.grpc.Language result = com.example.grpc.Language.valueOf(from_);
    return result == null ? com.example.grpc.Language.UNRECOGNIZED : result;
  }

  public static final int TO_FIELD_NUMBER = 3;
  private int to_;
  /**
   * <code>.com.example.grpc.Language to = 3;</code>
   */
  public int getToValue() {
    return to_;
  }
  /**
   * <code>.com.example.grpc.Language to = 3;</code>
   */
  public com.example.grpc.Language getTo() {
    com.example.grpc.Language result = com.example.grpc.Language.valueOf(to_);
    return result == null ? com.example.grpc.Language.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (from_ != com.example.grpc.Language.EN.getNumber()) {
      output.writeEnum(2, from_);
    }
    if (to_ != com.example.grpc.Language.EN.getNumber()) {
      output.writeEnum(3, to_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (from_ != com.example.grpc.Language.EN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, from_);
    }
    if (to_ != com.example.grpc.Language.EN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, to_);
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
    if (!(obj instanceof com.example.grpc.TranslationRequest)) {
      return super.equals(obj);
    }
    com.example.grpc.TranslationRequest other = (com.example.grpc.TranslationRequest) obj;

    boolean result = true;
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && from_ == other.from_;
    result = result && to_ == other.to_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + from_;
    hash = (37 * hash) + TO_FIELD_NUMBER;
    hash = (53 * hash) + to_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.TranslationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.TranslationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.TranslationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.TranslationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.TranslationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.TranslationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.TranslationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.TranslationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.TranslationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.TranslationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.TranslationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.TranslationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.TranslationRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.example.grpc.TranslationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.TranslationRequest)
      com.example.grpc.TranslationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.ExampleServices.internal_static_com_example_grpc_TranslationRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.ExampleServices.internal_static_com_example_grpc_TranslationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.TranslationRequest.class, com.example.grpc.TranslationRequest.Builder.class);
    }

    // Construct using com.example.grpc.TranslationRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      message_ = "";

      from_ = 0;

      to_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.ExampleServices.internal_static_com_example_grpc_TranslationRequest_descriptor;
    }

    public com.example.grpc.TranslationRequest getDefaultInstanceForType() {
      return com.example.grpc.TranslationRequest.getDefaultInstance();
    }

    public com.example.grpc.TranslationRequest build() {
      com.example.grpc.TranslationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.TranslationRequest buildPartial() {
      com.example.grpc.TranslationRequest result = new com.example.grpc.TranslationRequest(this);
      result.message_ = message_;
      result.from_ = from_;
      result.to_ = to_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.TranslationRequest) {
        return mergeFrom((com.example.grpc.TranslationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.TranslationRequest other) {
      if (other == com.example.grpc.TranslationRequest.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.from_ != 0) {
        setFromValue(other.getFromValue());
      }
      if (other.to_ != 0) {
        setToValue(other.getToValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.grpc.TranslationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.TranslationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private int from_ = 0;
    /**
     * <code>.com.example.grpc.Language from = 2;</code>
     */
    public int getFromValue() {
      return from_;
    }
    /**
     * <code>.com.example.grpc.Language from = 2;</code>
     */
    public Builder setFromValue(int value) {
      from_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.example.grpc.Language from = 2;</code>
     */
    public com.example.grpc.Language getFrom() {
      com.example.grpc.Language result = com.example.grpc.Language.valueOf(from_);
      return result == null ? com.example.grpc.Language.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.example.grpc.Language from = 2;</code>
     */
    public Builder setFrom(com.example.grpc.Language value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      from_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.example.grpc.Language from = 2;</code>
     */
    public Builder clearFrom() {
      
      from_ = 0;
      onChanged();
      return this;
    }

    private int to_ = 0;
    /**
     * <code>.com.example.grpc.Language to = 3;</code>
     */
    public int getToValue() {
      return to_;
    }
    /**
     * <code>.com.example.grpc.Language to = 3;</code>
     */
    public Builder setToValue(int value) {
      to_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.example.grpc.Language to = 3;</code>
     */
    public com.example.grpc.Language getTo() {
      com.example.grpc.Language result = com.example.grpc.Language.valueOf(to_);
      return result == null ? com.example.grpc.Language.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.example.grpc.Language to = 3;</code>
     */
    public Builder setTo(com.example.grpc.Language value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      to_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.example.grpc.Language to = 3;</code>
     */
    public Builder clearTo() {
      
      to_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.TranslationRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.TranslationRequest)
  private static final com.example.grpc.TranslationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.TranslationRequest();
  }

  public static com.example.grpc.TranslationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TranslationRequest>
      PARSER = new com.google.protobuf.AbstractParser<TranslationRequest>() {
    public TranslationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TranslationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TranslationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TranslationRequest> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.TranslationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

