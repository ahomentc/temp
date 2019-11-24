package com.example.guestbook;

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
    comments = "Source: GuestbookService.proto")
public final class GuestbookServiceGrpc {

  private GuestbookServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.guestbook.GuestbookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.guestbook.AllRequest,
      com.example.guestbook.GuestbookEntry> getAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "all",
      requestType = com.example.guestbook.AllRequest.class,
      responseType = com.example.guestbook.GuestbookEntry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.guestbook.AllRequest,
      com.example.guestbook.GuestbookEntry> getAllMethod() {
    io.grpc.MethodDescriptor<com.example.guestbook.AllRequest, com.example.guestbook.GuestbookEntry> getAllMethod;
    if ((getAllMethod = GuestbookServiceGrpc.getAllMethod) == null) {
      synchronized (GuestbookServiceGrpc.class) {
        if ((getAllMethod = GuestbookServiceGrpc.getAllMethod) == null) {
          GuestbookServiceGrpc.getAllMethod = getAllMethod = 
              io.grpc.MethodDescriptor.<com.example.guestbook.AllRequest, com.example.guestbook.GuestbookEntry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.guestbook.GuestbookService", "all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.guestbook.AllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.guestbook.GuestbookEntry.getDefaultInstance()))
                  .setSchemaDescriptor(new GuestbookServiceMethodDescriptorSupplier("all"))
                  .build();
          }
        }
     }
     return getAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.guestbook.FindOneRequest,
      com.example.guestbook.GuestbookEntry> getFindOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findOne",
      requestType = com.example.guestbook.FindOneRequest.class,
      responseType = com.example.guestbook.GuestbookEntry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.guestbook.FindOneRequest,
      com.example.guestbook.GuestbookEntry> getFindOneMethod() {
    io.grpc.MethodDescriptor<com.example.guestbook.FindOneRequest, com.example.guestbook.GuestbookEntry> getFindOneMethod;
    if ((getFindOneMethod = GuestbookServiceGrpc.getFindOneMethod) == null) {
      synchronized (GuestbookServiceGrpc.class) {
        if ((getFindOneMethod = GuestbookServiceGrpc.getFindOneMethod) == null) {
          GuestbookServiceGrpc.getFindOneMethod = getFindOneMethod = 
              io.grpc.MethodDescriptor.<com.example.guestbook.FindOneRequest, com.example.guestbook.GuestbookEntry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.guestbook.GuestbookService", "findOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.guestbook.FindOneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.guestbook.GuestbookEntry.getDefaultInstance()))
                  .setSchemaDescriptor(new GuestbookServiceMethodDescriptorSupplier("findOne"))
                  .build();
          }
        }
     }
     return getFindOneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.guestbook.DeleteRequest,
      com.example.guestbook.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.example.guestbook.DeleteRequest.class,
      responseType = com.example.guestbook.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.guestbook.DeleteRequest,
      com.example.guestbook.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.example.guestbook.DeleteRequest, com.example.guestbook.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = GuestbookServiceGrpc.getDeleteMethod) == null) {
      synchronized (GuestbookServiceGrpc.class) {
        if ((getDeleteMethod = GuestbookServiceGrpc.getDeleteMethod) == null) {
          GuestbookServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<com.example.guestbook.DeleteRequest, com.example.guestbook.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.guestbook.GuestbookService", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.guestbook.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.guestbook.DeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GuestbookServiceMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.guestbook.AddRequest,
      com.example.guestbook.AddResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = com.example.guestbook.AddRequest.class,
      responseType = com.example.guestbook.AddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.guestbook.AddRequest,
      com.example.guestbook.AddResponse> getAddMethod() {
    io.grpc.MethodDescriptor<com.example.guestbook.AddRequest, com.example.guestbook.AddResponse> getAddMethod;
    if ((getAddMethod = GuestbookServiceGrpc.getAddMethod) == null) {
      synchronized (GuestbookServiceGrpc.class) {
        if ((getAddMethod = GuestbookServiceGrpc.getAddMethod) == null) {
          GuestbookServiceGrpc.getAddMethod = getAddMethod = 
              io.grpc.MethodDescriptor.<com.example.guestbook.AddRequest, com.example.guestbook.AddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.guestbook.GuestbookService", "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.guestbook.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.guestbook.AddResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GuestbookServiceMethodDescriptorSupplier("add"))
                  .build();
          }
        }
     }
     return getAddMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GuestbookServiceStub newStub(io.grpc.Channel channel) {
    return new GuestbookServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GuestbookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GuestbookServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GuestbookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GuestbookServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GuestbookServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void all(com.example.guestbook.AllRequest request,
        io.grpc.stub.StreamObserver<com.example.guestbook.GuestbookEntry> responseObserver) {
      asyncUnimplementedUnaryCall(getAllMethod(), responseObserver);
    }

    /**
     */
    public void findOne(com.example.guestbook.FindOneRequest request,
        io.grpc.stub.StreamObserver<com.example.guestbook.GuestbookEntry> responseObserver) {
      asyncUnimplementedUnaryCall(getFindOneMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.example.guestbook.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.guestbook.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void add(com.example.guestbook.AddRequest request,
        io.grpc.stub.StreamObserver<com.example.guestbook.AddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.guestbook.AllRequest,
                com.example.guestbook.GuestbookEntry>(
                  this, METHODID_ALL)))
          .addMethod(
            getFindOneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.guestbook.FindOneRequest,
                com.example.guestbook.GuestbookEntry>(
                  this, METHODID_FIND_ONE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.guestbook.DeleteRequest,
                com.example.guestbook.DeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.guestbook.AddRequest,
                com.example.guestbook.AddResponse>(
                  this, METHODID_ADD)))
          .build();
    }
  }

  /**
   */
  public static final class GuestbookServiceStub extends io.grpc.stub.AbstractStub<GuestbookServiceStub> {
    private GuestbookServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GuestbookServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GuestbookServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GuestbookServiceStub(channel, callOptions);
    }

    /**
     */
    public void all(com.example.guestbook.AllRequest request,
        io.grpc.stub.StreamObserver<com.example.guestbook.GuestbookEntry> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findOne(com.example.guestbook.FindOneRequest request,
        io.grpc.stub.StreamObserver<com.example.guestbook.GuestbookEntry> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindOneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.example.guestbook.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.guestbook.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(com.example.guestbook.AddRequest request,
        io.grpc.stub.StreamObserver<com.example.guestbook.AddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GuestbookServiceBlockingStub extends io.grpc.stub.AbstractStub<GuestbookServiceBlockingStub> {
    private GuestbookServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GuestbookServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GuestbookServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GuestbookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.example.guestbook.GuestbookEntry> all(
        com.example.guestbook.AllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.guestbook.GuestbookEntry findOne(com.example.guestbook.FindOneRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindOneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.guestbook.DeleteResponse delete(com.example.guestbook.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.guestbook.AddResponse add(com.example.guestbook.AddRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GuestbookServiceFutureStub extends io.grpc.stub.AbstractStub<GuestbookServiceFutureStub> {
    private GuestbookServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GuestbookServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GuestbookServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GuestbookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.guestbook.GuestbookEntry> findOne(
        com.example.guestbook.FindOneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindOneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.guestbook.DeleteResponse> delete(
        com.example.guestbook.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.guestbook.AddResponse> add(
        com.example.guestbook.AddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL = 0;
  private static final int METHODID_FIND_ONE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_ADD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GuestbookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GuestbookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL:
          serviceImpl.all((com.example.guestbook.AllRequest) request,
              (io.grpc.stub.StreamObserver<com.example.guestbook.GuestbookEntry>) responseObserver);
          break;
        case METHODID_FIND_ONE:
          serviceImpl.findOne((com.example.guestbook.FindOneRequest) request,
              (io.grpc.stub.StreamObserver<com.example.guestbook.GuestbookEntry>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.example.guestbook.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.example.guestbook.DeleteResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((com.example.guestbook.AddRequest) request,
              (io.grpc.stub.StreamObserver<com.example.guestbook.AddResponse>) responseObserver);
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

  private static abstract class GuestbookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GuestbookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.guestbook.GuestbookServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GuestbookService");
    }
  }

  private static final class GuestbookServiceFileDescriptorSupplier
      extends GuestbookServiceBaseDescriptorSupplier {
    GuestbookServiceFileDescriptorSupplier() {}
  }

  private static final class GuestbookServiceMethodDescriptorSupplier
      extends GuestbookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GuestbookServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GuestbookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GuestbookServiceFileDescriptorSupplier())
              .addMethod(getAllMethod())
              .addMethod(getFindOneMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getAddMethod())
              .build();
        }
      }
    }
    return result;
  }
}
