package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: ExampleServices.proto")
public final class TranslationServiceGrpc {

  private TranslationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.TranslationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.TranslationRequest,
      com.example.grpc.TranslationResponse> getTranslateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "translate",
      requestType = com.example.grpc.TranslationRequest.class,
      responseType = com.example.grpc.TranslationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.TranslationRequest,
      com.example.grpc.TranslationResponse> getTranslateMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.TranslationRequest, com.example.grpc.TranslationResponse> getTranslateMethod;
    if ((getTranslateMethod = TranslationServiceGrpc.getTranslateMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getTranslateMethod = TranslationServiceGrpc.getTranslateMethod) == null) {
          TranslationServiceGrpc.getTranslateMethod = getTranslateMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.TranslationRequest, com.example.grpc.TranslationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.TranslationService", "translate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.TranslationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.TranslationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TranslationServiceMethodDescriptorSupplier("translate"))
                  .build();
          }
        }
     }
     return getTranslateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TranslationServiceStub newStub(io.grpc.Channel channel) {
    return new TranslationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TranslationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TranslationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TranslationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TranslationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TranslationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void translate(com.example.grpc.TranslationRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.TranslationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTranslateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTranslateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.TranslationRequest,
                com.example.grpc.TranslationResponse>(
                  this, METHODID_TRANSLATE)))
          .build();
    }
  }

  /**
   */
  public static final class TranslationServiceStub extends io.grpc.stub.AbstractStub<TranslationServiceStub> {
    private TranslationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TranslationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TranslationServiceStub(channel, callOptions);
    }

    /**
     */
    public void translate(com.example.grpc.TranslationRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.TranslationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTranslateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TranslationServiceBlockingStub extends io.grpc.stub.AbstractStub<TranslationServiceBlockingStub> {
    private TranslationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TranslationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TranslationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.TranslationResponse translate(com.example.grpc.TranslationRequest request) {
      return blockingUnaryCall(
          getChannel(), getTranslateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TranslationServiceFutureStub extends io.grpc.stub.AbstractStub<TranslationServiceFutureStub> {
    private TranslationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TranslationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TranslationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.TranslationResponse> translate(
        com.example.grpc.TranslationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTranslateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSLATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TranslationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TranslationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSLATE:
          serviceImpl.translate((com.example.grpc.TranslationRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.TranslationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TranslationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TranslationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.ExampleServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TranslationService");
    }
  }

  private static final class TranslationServiceFileDescriptorSupplier
      extends TranslationServiceBaseDescriptorSupplier {
    TranslationServiceFileDescriptorSupplier() {}
  }

  private static final class TranslationServiceMethodDescriptorSupplier
      extends TranslationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TranslationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TranslationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TranslationServiceFileDescriptorSupplier())
              .addMethod(getTranslateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
