package com.example.grpc.error;

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
    comments = "Source: ErrorServices.proto")
public final class ErrorServiceGrpc {

  private ErrorServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.error.ErrorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getNotImplementedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "notImplemented",
      requestType = com.example.grpc.error.EchoRequest.class,
      responseType = com.example.grpc.error.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getNotImplementedMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse> getNotImplementedMethod;
    if ((getNotImplementedMethod = ErrorServiceGrpc.getNotImplementedMethod) == null) {
      synchronized (ErrorServiceGrpc.class) {
        if ((getNotImplementedMethod = ErrorServiceGrpc.getNotImplementedMethod) == null) {
          ErrorServiceGrpc.getNotImplementedMethod = getNotImplementedMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.error.ErrorService", "notImplemented"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ErrorServiceMethodDescriptorSupplier("notImplemented"))
                  .build();
          }
        }
     }
     return getNotImplementedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getCustomUnwrapExceptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "customUnwrapException",
      requestType = com.example.grpc.error.EchoRequest.class,
      responseType = com.example.grpc.error.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getCustomUnwrapExceptionMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse> getCustomUnwrapExceptionMethod;
    if ((getCustomUnwrapExceptionMethod = ErrorServiceGrpc.getCustomUnwrapExceptionMethod) == null) {
      synchronized (ErrorServiceGrpc.class) {
        if ((getCustomUnwrapExceptionMethod = ErrorServiceGrpc.getCustomUnwrapExceptionMethod) == null) {
          ErrorServiceGrpc.getCustomUnwrapExceptionMethod = getCustomUnwrapExceptionMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.error.ErrorService", "customUnwrapException"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ErrorServiceMethodDescriptorSupplier("customUnwrapException"))
                  .build();
          }
        }
     }
     return getCustomUnwrapExceptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getCustomExceptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "customException",
      requestType = com.example.grpc.error.EchoRequest.class,
      responseType = com.example.grpc.error.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getCustomExceptionMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse> getCustomExceptionMethod;
    if ((getCustomExceptionMethod = ErrorServiceGrpc.getCustomExceptionMethod) == null) {
      synchronized (ErrorServiceGrpc.class) {
        if ((getCustomExceptionMethod = ErrorServiceGrpc.getCustomExceptionMethod) == null) {
          ErrorServiceGrpc.getCustomExceptionMethod = getCustomExceptionMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.error.ErrorService", "customException"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ErrorServiceMethodDescriptorSupplier("customException"))
                  .build();
          }
        }
     }
     return getCustomExceptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getUncaughtExceptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uncaughtExceptions",
      requestType = com.example.grpc.error.EchoRequest.class,
      responseType = com.example.grpc.error.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getUncaughtExceptionsMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse> getUncaughtExceptionsMethod;
    if ((getUncaughtExceptionsMethod = ErrorServiceGrpc.getUncaughtExceptionsMethod) == null) {
      synchronized (ErrorServiceGrpc.class) {
        if ((getUncaughtExceptionsMethod = ErrorServiceGrpc.getUncaughtExceptionsMethod) == null) {
          ErrorServiceGrpc.getUncaughtExceptionsMethod = getUncaughtExceptionsMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.error.ErrorService", "uncaughtExceptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ErrorServiceMethodDescriptorSupplier("uncaughtExceptions"))
                  .build();
          }
        }
     }
     return getUncaughtExceptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getDeadlineExceededMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deadlineExceeded",
      requestType = com.example.grpc.error.EchoRequest.class,
      responseType = com.example.grpc.error.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getDeadlineExceededMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse> getDeadlineExceededMethod;
    if ((getDeadlineExceededMethod = ErrorServiceGrpc.getDeadlineExceededMethod) == null) {
      synchronized (ErrorServiceGrpc.class) {
        if ((getDeadlineExceededMethod = ErrorServiceGrpc.getDeadlineExceededMethod) == null) {
          ErrorServiceGrpc.getDeadlineExceededMethod = getDeadlineExceededMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.error.ErrorService", "deadlineExceeded"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ErrorServiceMethodDescriptorSupplier("deadlineExceeded"))
                  .build();
          }
        }
     }
     return getDeadlineExceededMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getAutomaticallyWrappedExceptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "automaticallyWrappedException",
      requestType = com.example.grpc.error.EchoRequest.class,
      responseType = com.example.grpc.error.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest,
      com.example.grpc.error.EchoResponse> getAutomaticallyWrappedExceptionMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse> getAutomaticallyWrappedExceptionMethod;
    if ((getAutomaticallyWrappedExceptionMethod = ErrorServiceGrpc.getAutomaticallyWrappedExceptionMethod) == null) {
      synchronized (ErrorServiceGrpc.class) {
        if ((getAutomaticallyWrappedExceptionMethod = ErrorServiceGrpc.getAutomaticallyWrappedExceptionMethod) == null) {
          ErrorServiceGrpc.getAutomaticallyWrappedExceptionMethod = getAutomaticallyWrappedExceptionMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.error.EchoRequest, com.example.grpc.error.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.error.ErrorService", "automaticallyWrappedException"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.error.EchoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ErrorServiceMethodDescriptorSupplier("automaticallyWrappedException"))
                  .build();
          }
        }
     }
     return getAutomaticallyWrappedExceptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ErrorServiceStub newStub(io.grpc.Channel channel) {
    return new ErrorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ErrorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ErrorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ErrorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ErrorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ErrorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void notImplemented(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotImplementedMethod(), responseObserver);
    }

    /**
     */
    public void customUnwrapException(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCustomUnwrapExceptionMethod(), responseObserver);
    }

    /**
     */
    public void customException(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCustomExceptionMethod(), responseObserver);
    }

    /**
     */
    public void uncaughtExceptions(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUncaughtExceptionsMethod(), responseObserver);
    }

    /**
     */
    public void deadlineExceeded(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeadlineExceededMethod(), responseObserver);
    }

    /**
     */
    public void automaticallyWrappedException(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAutomaticallyWrappedExceptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNotImplementedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.error.EchoRequest,
                com.example.grpc.error.EchoResponse>(
                  this, METHODID_NOT_IMPLEMENTED)))
          .addMethod(
            getCustomUnwrapExceptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.error.EchoRequest,
                com.example.grpc.error.EchoResponse>(
                  this, METHODID_CUSTOM_UNWRAP_EXCEPTION)))
          .addMethod(
            getCustomExceptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.error.EchoRequest,
                com.example.grpc.error.EchoResponse>(
                  this, METHODID_CUSTOM_EXCEPTION)))
          .addMethod(
            getUncaughtExceptionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.error.EchoRequest,
                com.example.grpc.error.EchoResponse>(
                  this, METHODID_UNCAUGHT_EXCEPTIONS)))
          .addMethod(
            getDeadlineExceededMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.error.EchoRequest,
                com.example.grpc.error.EchoResponse>(
                  this, METHODID_DEADLINE_EXCEEDED)))
          .addMethod(
            getAutomaticallyWrappedExceptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.error.EchoRequest,
                com.example.grpc.error.EchoResponse>(
                  this, METHODID_AUTOMATICALLY_WRAPPED_EXCEPTION)))
          .build();
    }
  }

  /**
   */
  public static final class ErrorServiceStub extends io.grpc.stub.AbstractStub<ErrorServiceStub> {
    private ErrorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ErrorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ErrorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ErrorServiceStub(channel, callOptions);
    }

    /**
     */
    public void notImplemented(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotImplementedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void customUnwrapException(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCustomUnwrapExceptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void customException(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCustomExceptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uncaughtExceptions(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUncaughtExceptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deadlineExceeded(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeadlineExceededMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void automaticallyWrappedException(com.example.grpc.error.EchoRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAutomaticallyWrappedExceptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ErrorServiceBlockingStub extends io.grpc.stub.AbstractStub<ErrorServiceBlockingStub> {
    private ErrorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ErrorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ErrorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ErrorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.error.EchoResponse notImplemented(com.example.grpc.error.EchoRequest request) {
      return blockingUnaryCall(
          getChannel(), getNotImplementedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.error.EchoResponse customUnwrapException(com.example.grpc.error.EchoRequest request) {
      return blockingUnaryCall(
          getChannel(), getCustomUnwrapExceptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.error.EchoResponse customException(com.example.grpc.error.EchoRequest request) {
      return blockingUnaryCall(
          getChannel(), getCustomExceptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.error.EchoResponse uncaughtExceptions(com.example.grpc.error.EchoRequest request) {
      return blockingUnaryCall(
          getChannel(), getUncaughtExceptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.error.EchoResponse deadlineExceeded(com.example.grpc.error.EchoRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeadlineExceededMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.error.EchoResponse automaticallyWrappedException(com.example.grpc.error.EchoRequest request) {
      return blockingUnaryCall(
          getChannel(), getAutomaticallyWrappedExceptionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ErrorServiceFutureStub extends io.grpc.stub.AbstractStub<ErrorServiceFutureStub> {
    private ErrorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ErrorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ErrorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ErrorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.error.EchoResponse> notImplemented(
        com.example.grpc.error.EchoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNotImplementedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.error.EchoResponse> customUnwrapException(
        com.example.grpc.error.EchoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCustomUnwrapExceptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.error.EchoResponse> customException(
        com.example.grpc.error.EchoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCustomExceptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.error.EchoResponse> uncaughtExceptions(
        com.example.grpc.error.EchoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUncaughtExceptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.error.EchoResponse> deadlineExceeded(
        com.example.grpc.error.EchoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeadlineExceededMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.error.EchoResponse> automaticallyWrappedException(
        com.example.grpc.error.EchoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAutomaticallyWrappedExceptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOT_IMPLEMENTED = 0;
  private static final int METHODID_CUSTOM_UNWRAP_EXCEPTION = 1;
  private static final int METHODID_CUSTOM_EXCEPTION = 2;
  private static final int METHODID_UNCAUGHT_EXCEPTIONS = 3;
  private static final int METHODID_DEADLINE_EXCEEDED = 4;
  private static final int METHODID_AUTOMATICALLY_WRAPPED_EXCEPTION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ErrorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ErrorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOT_IMPLEMENTED:
          serviceImpl.notImplemented((com.example.grpc.error.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse>) responseObserver);
          break;
        case METHODID_CUSTOM_UNWRAP_EXCEPTION:
          serviceImpl.customUnwrapException((com.example.grpc.error.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse>) responseObserver);
          break;
        case METHODID_CUSTOM_EXCEPTION:
          serviceImpl.customException((com.example.grpc.error.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse>) responseObserver);
          break;
        case METHODID_UNCAUGHT_EXCEPTIONS:
          serviceImpl.uncaughtExceptions((com.example.grpc.error.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse>) responseObserver);
          break;
        case METHODID_DEADLINE_EXCEEDED:
          serviceImpl.deadlineExceeded((com.example.grpc.error.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse>) responseObserver);
          break;
        case METHODID_AUTOMATICALLY_WRAPPED_EXCEPTION:
          serviceImpl.automaticallyWrappedException((com.example.grpc.error.EchoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.error.EchoResponse>) responseObserver);
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

  private static abstract class ErrorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ErrorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.error.ErrorServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ErrorService");
    }
  }

  private static final class ErrorServiceFileDescriptorSupplier
      extends ErrorServiceBaseDescriptorSupplier {
    ErrorServiceFileDescriptorSupplier() {}
  }

  private static final class ErrorServiceMethodDescriptorSupplier
      extends ErrorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ErrorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ErrorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ErrorServiceFileDescriptorSupplier())
              .addMethod(getNotImplementedMethod())
              .addMethod(getCustomUnwrapExceptionMethod())
              .addMethod(getCustomExceptionMethod())
              .addMethod(getUncaughtExceptionsMethod())
              .addMethod(getDeadlineExceededMethod())
              .addMethod(getAutomaticallyWrappedExceptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
