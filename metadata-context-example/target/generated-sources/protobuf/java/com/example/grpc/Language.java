// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExampleServices.proto

package com.example.grpc;

/**
 * Protobuf enum {@code com.example.grpc.Language}
 */
public enum Language
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EN = 0;</code>
   */
  EN(0),
  /**
   * <code>ZH = 1;</code>
   */
  ZH(1),
  /**
   * <code>ES = 3;</code>
   */
  ES(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EN = 0;</code>
   */
  public static final int EN_VALUE = 0;
  /**
   * <code>ZH = 1;</code>
   */
  public static final int ZH_VALUE = 1;
  /**
   * <code>ES = 3;</code>
   */
  public static final int ES_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Language valueOf(int value) {
    return forNumber(value);
  }

  public static Language forNumber(int value) {
    switch (value) {
      case 0: return EN;
      case 1: return ZH;
      case 3: return ES;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Language>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Language> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Language>() {
          public Language findValueByNumber(int number) {
            return Language.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.example.grpc.ExampleServices.getDescriptor().getEnumTypes().get(1);
  }

  private static final Language[] VALUES = values();

  public static Language valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Language(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.example.grpc.Language)
}

