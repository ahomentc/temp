// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErrorServices.proto

package com.example.grpc.error;

public final class ErrorServices {
  private ErrorServices() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_error_EchoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_error_EchoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_error_EchoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_error_EchoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ErrorServices.proto\022\026com.example.grpc." +
      "error\"\036\n\013EchoRequest\022\017\n\007message\030\001 \001(\t\"\037\n" +
      "\014EchoResponse\022\017\n\007message\030\001 \001(\t2\331\004\n\014Error" +
      "Service\022[\n\016notImplemented\022#.com.example." +
      "grpc.error.EchoRequest\032$.com.example.grp" +
      "c.error.EchoResponse\022b\n\025customUnwrapExce" +
      "ption\022#.com.example.grpc.error.EchoReque" +
      "st\032$.com.example.grpc.error.EchoResponse" +
      "\022\\\n\017customException\022#.com.example.grpc.e" +
      "rror.EchoRequest\032$.com.example.grpc.erro" +
      "r.EchoResponse\022_\n\022uncaughtExceptions\022#.c" +
      "om.example.grpc.error.EchoRequest\032$.com." +
      "example.grpc.error.EchoResponse\022]\n\020deadl" +
      "ineExceeded\022#.com.example.grpc.error.Ech" +
      "oRequest\032$.com.example.grpc.error.EchoRe" +
      "sponse\022j\n\035automaticallyWrappedException\022" +
      "#.com.example.grpc.error.EchoRequest\032$.c" +
      "om.example.grpc.error.EchoResponseB\002P\001b\006" +
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpc_error_EchoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_error_EchoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_error_EchoRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_example_grpc_error_EchoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_error_EchoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_error_EchoResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
