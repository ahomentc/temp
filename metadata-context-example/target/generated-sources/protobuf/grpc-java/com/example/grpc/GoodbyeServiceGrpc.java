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
public final class GoodbyeServiceGrpc {

  private GoodbyeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.GoodbyeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GoodbyeRequest,
      com.example.grpc.GoodbyeResponse> getGoodbyeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "goodbye",
      requestType = com.example.grpc.GoodbyeRequest.class,
      responseType = com.example.grpc.GoodbyeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.GoodbyeRequest,
      com.example.grpc.GoodbyeResponse> getGoodbyeMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GoodbyeRequest, com.example.grpc.GoodbyeResponse> getGoodbyeMethod;
    if ((getGoodbyeMethod = GoodbyeServiceGrpc.getGoodbyeMethod) == null) {
      synchronized (GoodbyeServiceGrpc.class) {
        if ((getGoodbyeMethod = GoodbyeServiceGrpc.getGoodbyeMethod) == null) {
          GoodbyeServiceGrpc.getGoodbyeMethod = getGoodbyeMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.GoodbyeRequest, com.example.grpc.GoodbyeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.GoodbyeService", "goodbye"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GoodbyeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GoodbyeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GoodbyeServiceMethodDescriptorSupplier("goodbye"))
                  .build();
          }
        }
     }
     return getGoodbyeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GoodbyeServiceStub newStub(io.grpc.Channel channel) {
    return new GoodbyeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GoodbyeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GoodbyeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GoodbyeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GoodbyeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GoodbyeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void goodbye(com.example.grpc.GoodbyeRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GoodbyeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGoodbyeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGoodbyeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GoodbyeRequest,
                com.example.grpc.GoodbyeResponse>(
                  this, METHODID_GOODBYE)))
          .build();
    }
  }

  /**
   */
  public static final class GoodbyeServiceStub extends io.grpc.stub.AbstractStub<GoodbyeServiceStub> {
    private GoodbyeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoodbyeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoodbyeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoodbyeServiceStub(channel, callOptions);
    }

    /**
     */
    public void goodbye(com.example.grpc.GoodbyeRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GoodbyeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGoodbyeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GoodbyeServiceBlockingStub extends io.grpc.stub.AbstractStub<GoodbyeServiceBlockingStub> {
    private GoodbyeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoodbyeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoodbyeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoodbyeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.GoodbyeResponse goodbye(com.example.grpc.GoodbyeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGoodbyeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GoodbyeServiceFutureStub extends io.grpc.stub.AbstractStub<GoodbyeServiceFutureStub> {
    private GoodbyeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoodbyeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoodbyeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoodbyeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GoodbyeResponse> goodbye(
        com.example.grpc.GoodbyeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGoodbyeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GOODBYE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GoodbyeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GoodbyeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GOODBYE:
          serviceImpl.goodbye((com.example.grpc.GoodbyeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GoodbyeResponse>) responseObserver);
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

  private static abstract class GoodbyeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GoodbyeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.ExampleServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GoodbyeService");
    }
  }

  private static final class GoodbyeServiceFileDescriptorSupplier
      extends GoodbyeServiceBaseDescriptorSupplier {
    GoodbyeServiceFileDescriptorSupplier() {}
  }

  private static final class GoodbyeServiceMethodDescriptorSupplier
      extends GoodbyeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GoodbyeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GoodbyeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoodbyeServiceFileDescriptorSupplier())
              .addMethod(getGoodbyeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
