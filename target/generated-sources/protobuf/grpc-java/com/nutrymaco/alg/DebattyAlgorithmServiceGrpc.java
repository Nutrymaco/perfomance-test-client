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
public final class DebattyAlgorithmServiceGrpc {

  private DebattyAlgorithmServiceGrpc() {}

  public static final String SERVICE_NAME = "com.nutrymaco.alg.DebattyAlgorithmService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.nutrymaco.alg.AlgorithmRequest,
      com.nutrymaco.alg.AlgorithmResponse> METHOD_GET_RESULT =
      io.grpc.MethodDescriptor.<com.nutrymaco.alg.AlgorithmRequest, com.nutrymaco.alg.AlgorithmResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.nutrymaco.alg.DebattyAlgorithmService", "GetResult"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.nutrymaco.alg.AlgorithmRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.nutrymaco.alg.AlgorithmResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DebattyAlgorithmServiceStub newStub(io.grpc.Channel channel) {
    return new DebattyAlgorithmServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DebattyAlgorithmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DebattyAlgorithmServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DebattyAlgorithmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DebattyAlgorithmServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DebattyAlgorithmServiceImplBase implements io.grpc.BindableService {

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
  public static final class DebattyAlgorithmServiceStub extends io.grpc.stub.AbstractStub<DebattyAlgorithmServiceStub> {
    private DebattyAlgorithmServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DebattyAlgorithmServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebattyAlgorithmServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DebattyAlgorithmServiceStub(channel, callOptions);
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
  public static final class DebattyAlgorithmServiceBlockingStub extends io.grpc.stub.AbstractStub<DebattyAlgorithmServiceBlockingStub> {
    private DebattyAlgorithmServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DebattyAlgorithmServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebattyAlgorithmServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DebattyAlgorithmServiceBlockingStub(channel, callOptions);
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
  public static final class DebattyAlgorithmServiceFutureStub extends io.grpc.stub.AbstractStub<DebattyAlgorithmServiceFutureStub> {
    private DebattyAlgorithmServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DebattyAlgorithmServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DebattyAlgorithmServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DebattyAlgorithmServiceFutureStub(channel, callOptions);
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
    private final DebattyAlgorithmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DebattyAlgorithmServiceImplBase serviceImpl, int methodId) {
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

  private static final class DebattyAlgorithmServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nutrymaco.alg.Service.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DebattyAlgorithmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DebattyAlgorithmServiceDescriptorSupplier())
              .addMethod(METHOD_GET_RESULT)
              .build();
        }
      }
    }
    return result;
  }
}
