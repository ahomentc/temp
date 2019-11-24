package com.example.demo;

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
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: Greeting.proto")
public final class MyServiceGrpc {

  private MyServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.MyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.GreetingRequest,
      com.example.demo.GreetingResponse> getGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greeting",
      requestType = com.example.demo.GreetingRequest.class,
      responseType = com.example.demo.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.GreetingRequest,
      com.example.demo.GreetingResponse> getGreetingMethod() {
    io.grpc.MethodDescriptor<com.example.demo.GreetingRequest, com.example.demo.GreetingResponse> getGreetingMethod;
    if ((getGreetingMethod = MyServiceGrpc.getGreetingMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getGreetingMethod = MyServiceGrpc.getGreetingMethod) == null) {
          MyServiceGrpc.getGreetingMethod = getGreetingMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.GreetingRequest, com.example.demo.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.MyService", "greeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.GreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.GreetingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("greeting"))
                  .build();
          }
        }
     }
     return getGreetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.WhoRequest,
      com.example.demo.WhoResponse> getWhoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "who",
      requestType = com.example.demo.WhoRequest.class,
      responseType = com.example.demo.WhoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.demo.WhoRequest,
      com.example.demo.WhoResponse> getWhoMethod() {
    io.grpc.MethodDescriptor<com.example.demo.WhoRequest, com.example.demo.WhoResponse> getWhoMethod;
    if ((getWhoMethod = MyServiceGrpc.getWhoMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getWhoMethod = MyServiceGrpc.getWhoMethod) == null) {
          MyServiceGrpc.getWhoMethod = getWhoMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.WhoRequest, com.example.demo.WhoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.MyService", "who"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.WhoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.WhoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("who"))
                  .build();
          }
        }
     }
     return getWhoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyServiceStub newStub(io.grpc.Channel channel) {
    return new MyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greeting(com.example.demo.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.GreetingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetingMethod(), responseObserver);
    }

    /**
     */
    public void who(com.example.demo.WhoRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.WhoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWhoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.GreetingRequest,
                com.example.demo.GreetingResponse>(
                  this, METHODID_GREETING)))
          .addMethod(
            getWhoMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.demo.WhoRequest,
                com.example.demo.WhoResponse>(
                  this, METHODID_WHO)))
          .build();
    }
  }

  /**
   */
  public static final class MyServiceStub extends io.grpc.stub.AbstractStub<MyServiceStub> {
    private MyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyServiceStub(channel, callOptions);
    }

    /**
     */
    public void greeting(com.example.demo.GreetingRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.GreetingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void who(com.example.demo.WhoRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.WhoResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWhoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MyServiceBlockingStub extends io.grpc.stub.AbstractStub<MyServiceBlockingStub> {
    private MyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.GreetingResponse greeting(com.example.demo.GreetingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.demo.WhoResponse> who(
        com.example.demo.WhoRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWhoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MyServiceFutureStub extends io.grpc.stub.AbstractStub<MyServiceFutureStub> {
    private MyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.GreetingResponse> greeting(
        com.example.demo.GreetingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING = 0;
  private static final int METHODID_WHO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING:
          serviceImpl.greeting((com.example.demo.GreetingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.GreetingResponse>) responseObserver);
          break;
        case METHODID_WHO:
          serviceImpl.who((com.example.demo.WhoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.WhoResponse>) responseObserver);
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

  private static abstract class MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.Greeting.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyService");
    }
  }

  private static final class MyServiceFileDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier {
    MyServiceFileDescriptorSupplier() {}
  }

  private static final class MyServiceMethodDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyServiceFileDescriptorSupplier())
              .addMethod(getGreetingMethod())
              .addMethod(getWhoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
