package com.example.server.streaming;

import static com.example.server.streaming.MetricsServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by RxGrpc generator",
comments = "Source: Streaming.proto")
public final class RxMetricsServiceGrpc {
    private RxMetricsServiceGrpc() {}

    public static RxMetricsServiceStub newRxStub(io.grpc.Channel channel) {
        return new RxMetricsServiceStub(channel);
    }

    public static final class RxMetricsServiceStub extends io.grpc.stub.AbstractStub<RxMetricsServiceStub> {
        private MetricsServiceGrpc.MetricsServiceStub delegateStub;

        private RxMetricsServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = MetricsServiceGrpc.newStub(channel);
        }

        private RxMetricsServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = MetricsServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @java.lang.Override
        protected RxMetricsServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RxMetricsServiceStub(channel, callOptions);
        }

        public io.reactivex.Single<com.example.server.streaming.Streaming.Average> collect(io.reactivex.Flowable<com.example.server.streaming.Streaming.Metric> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.manyToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.Function<io.grpc.stub.StreamObserver<com.example.server.streaming.Streaming.Average>, io.grpc.stub.StreamObserver<com.example.server.streaming.Streaming.Metric>>() {
                    @java.lang.Override
                    public io.grpc.stub.StreamObserver<com.example.server.streaming.Streaming.Metric> apply(io.grpc.stub.StreamObserver<com.example.server.streaming.Streaming.Average> observer) {
                        return delegateStub.collect(observer);
                    }
                });
        }

    }

    public static abstract class MetricsServiceImplBase implements io.grpc.BindableService {

        public io.reactivex.Single<com.example.server.streaming.Streaming.Average> collect(io.reactivex.Flowable<com.example.server.streaming.Streaming.Metric> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.example.server.streaming.MetricsServiceGrpc.getCollectMethod(),
                            asyncClientStreamingCall(
                                    new MethodHandlers<
                                            com.example.server.streaming.Streaming.Metric,
                                            com.example.server.streaming.Streaming.Average>(
                                            this, METHODID_COLLECT)))
                    .build();
        }
    }

    private static final int METHODID_COLLECT = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final MetricsServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(MetricsServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_COLLECT:
                    return (io.grpc.stub.StreamObserver<Req>) com.salesforce.rxgrpc.stub.ServerCalls.manyToOne(
                            (io.grpc.stub.StreamObserver<com.example.server.streaming.Streaming.Average>) responseObserver,
                            serviceImpl::collect);
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
