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
public final class ApacheAlgorithmServiceGrpc {

  private ApacheAlgorithmServiceGrpc() {}

  public static final String SERVICE_NAME = "com.nutrymaco.alg.ApacheAlgorithmService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.nutrymaco.alg.AlgorithmRequest,
      com.nutrymaco.alg.AlgorithmResponse> METHOD_GET_RESULT =
      io.grpc.MethodDescriptor.<com.nutrymaco.alg.AlgorithmRequest, com.nutrymaco.alg.AlgorithmResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.nutrymaco.alg.ApacheAlgorithmService", "GetResult"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.nutrymaco.alg.AlgorithmRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.nutrymaco.alg.AlgorithmResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApacheAlgorithmServiceStub newStub(io.grpc.Channel channel) {
    return new ApacheAlgorithmServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApacheAlgorithmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApacheAlgorithmServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApacheAlgorithmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApacheAlgorithmServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ApacheAlgorithmServiceImplBase implements io.grpc.BindableService {

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
  public static final class ApacheAlgorithmServiceStub extends io.grpc.stub.AbstractStub<ApacheAlgorithmServiceStub> {
    private ApacheAlgorithmServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApacheAlgorithmServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApacheAlgorithmServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApacheAlgorithmServiceStub(channel, callOptions);
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
  public static final class ApacheAlgorithmServiceBlockingStub extends io.grpc.stub.AbstractStub<ApacheAlgorithmServiceBlockingStub> {
    private ApacheAlgorithmServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApacheAlgorithmServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApacheAlgorithmServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApacheAlgorithmServiceBlockingStub(channel, callOptions);
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
  public static final class ApacheAlgorithmServiceFutureStub extends io.grpc.stub.AbstractStub<ApacheAlgorithmServiceFutureStub> {
    private ApacheAlgorithmServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApacheAlgorithmServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApacheAlgorithmServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApacheAlgorithmServiceFutureStub(channel, callOptions);
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
    private final ApacheAlgorithmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApacheAlgorithmServiceImplBase serviceImpl, int methodId) {
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

  private static final class ApacheAlgorithmServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nutrymaco.alg.Service.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ApacheAlgorithmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApacheAlgorithmServiceDescriptorSupplier())
              .addMethod(METHOD_GET_RESULT)
              .build();
        }
      }
    }
    return result;
  }
}
