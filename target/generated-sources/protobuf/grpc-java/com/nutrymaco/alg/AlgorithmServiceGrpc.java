package com.nutrymaco.alg;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: service.proto")
public final class AlgorithmServiceGrpc {

  private AlgorithmServiceGrpc() {}

  public static final String SERVICE_NAME = "com.nutrymaco.alg.AlgorithmService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.nutrymaco.alg.AlgorithmRequest,
      com.nutrymaco.alg.AlgorithmResponse> METHOD_GET_RESULT =
      io.grpc.MethodDescriptor.<com.nutrymaco.alg.AlgorithmRequest, com.nutrymaco.alg.AlgorithmResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.nutrymaco.alg.AlgorithmService", "GetResult"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.nutrymaco.alg.AlgorithmRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.nutrymaco.alg.AlgorithmResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlgorithmServiceStub newStub(io.grpc.Channel channel) {
    return new AlgorithmServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlgorithmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AlgorithmServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlgorithmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AlgorithmServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AlgorithmServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getResult(com.nutrymaco.alg.AlgorithmRequest request,
        io.grpc.stub.StreamObserver<com.nutrymaco.alg.AlgorithmResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RESULT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_RESULT,
            asyncUnaryCall(
              new MethodHandlers<
                com.nutrymaco.alg.AlgorithmRequest,
                com.nutrymaco.alg.AlgorithmResponse>(
                  this, METHODID_GET_RESULT)))
          .build();
    }
  }

  /**
   */
  public static final class AlgorithmServiceStub extends io.grpc.stub.AbstractStub<AlgorithmServiceStub> {
    private AlgorithmServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlgorithmServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlgorithmServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlgorithmServiceStub(channel, callOptions);
    }

    /**
     */
    public void getResult(com.nutrymaco.alg.AlgorithmRequest request,
        io.grpc.stub.StreamObserver<com.nutrymaco.alg.AlgorithmResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_RESULT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlgorithmServiceBlockingStub extends io.grpc.stub.AbstractStub<AlgorithmServiceBlockingStub> {
    private AlgorithmServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlgorithmServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlgorithmServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlgorithmServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nutrymaco.alg.AlgorithmResponse getResult(com.nutrymaco.alg.AlgorithmRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_RESULT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlgorithmServiceFutureStub extends io.grpc.stub.AbstractStub<AlgorithmServiceFutureStub> {
    private AlgorithmServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlgorithmServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlgorithmServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlgorithmServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nutrymaco.alg.AlgorithmResponse> getResult(
        com.nutrymaco.alg.AlgorithmRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_RESULT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESULT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlgorithmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlgorithmServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESULT:
          serviceImpl.getResult((com.nutrymaco.alg.AlgorithmRequest) request,
              (io.grpc.stub.StreamObserver<com.nutrymaco.alg.AlgorithmResponse>) responseObserver);
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

  private static final class AlgorithmServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nutrymaco.alg.Service.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AlgorithmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlgorithmServiceDescriptorSupplier())
              .addMethod(METHOD_GET_RESULT)
              .build();
        }
      }
    }
    return result;
  }
}
