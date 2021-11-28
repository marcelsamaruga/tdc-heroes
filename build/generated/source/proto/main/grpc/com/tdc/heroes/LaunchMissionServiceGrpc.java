package com.tdc.heroes;

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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: Heroes.proto")
public final class LaunchMissionServiceGrpc {

  private LaunchMissionServiceGrpc() {}

  public static final String SERVICE_NAME = "heroes.LaunchMissionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tdc.heroes.NewMissionRequest,
      com.tdc.heroes.NewMissionResponse> getNewMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "newMission",
      requestType = com.tdc.heroes.NewMissionRequest.class,
      responseType = com.tdc.heroes.NewMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tdc.heroes.NewMissionRequest,
      com.tdc.heroes.NewMissionResponse> getNewMissionMethod() {
    io.grpc.MethodDescriptor<com.tdc.heroes.NewMissionRequest, com.tdc.heroes.NewMissionResponse> getNewMissionMethod;
    if ((getNewMissionMethod = LaunchMissionServiceGrpc.getNewMissionMethod) == null) {
      synchronized (LaunchMissionServiceGrpc.class) {
        if ((getNewMissionMethod = LaunchMissionServiceGrpc.getNewMissionMethod) == null) {
          LaunchMissionServiceGrpc.getNewMissionMethod = getNewMissionMethod =
              io.grpc.MethodDescriptor.<com.tdc.heroes.NewMissionRequest, com.tdc.heroes.NewMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "newMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tdc.heroes.NewMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tdc.heroes.NewMissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LaunchMissionServiceMethodDescriptorSupplier("newMission"))
              .build();
        }
      }
    }
    return getNewMissionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LaunchMissionServiceStub newStub(io.grpc.Channel channel) {
    return new LaunchMissionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LaunchMissionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LaunchMissionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LaunchMissionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LaunchMissionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LaunchMissionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void newMission(com.tdc.heroes.NewMissionRequest request,
        io.grpc.stub.StreamObserver<com.tdc.heroes.NewMissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewMissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewMissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tdc.heroes.NewMissionRequest,
                com.tdc.heroes.NewMissionResponse>(
                  this, METHODID_NEW_MISSION)))
          .build();
    }
  }

  /**
   */
  public static final class LaunchMissionServiceStub extends io.grpc.stub.AbstractStub<LaunchMissionServiceStub> {
    private LaunchMissionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LaunchMissionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LaunchMissionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LaunchMissionServiceStub(channel, callOptions);
    }

    /**
     */
    public void newMission(com.tdc.heroes.NewMissionRequest request,
        io.grpc.stub.StreamObserver<com.tdc.heroes.NewMissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewMissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LaunchMissionServiceBlockingStub extends io.grpc.stub.AbstractStub<LaunchMissionServiceBlockingStub> {
    private LaunchMissionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LaunchMissionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LaunchMissionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LaunchMissionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tdc.heroes.NewMissionResponse newMission(com.tdc.heroes.NewMissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewMissionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LaunchMissionServiceFutureStub extends io.grpc.stub.AbstractStub<LaunchMissionServiceFutureStub> {
    private LaunchMissionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LaunchMissionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LaunchMissionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LaunchMissionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tdc.heroes.NewMissionResponse> newMission(
        com.tdc.heroes.NewMissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewMissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_MISSION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LaunchMissionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LaunchMissionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_MISSION:
          serviceImpl.newMission((com.tdc.heroes.NewMissionRequest) request,
              (io.grpc.stub.StreamObserver<com.tdc.heroes.NewMissionResponse>) responseObserver);
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

  private static abstract class LaunchMissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LaunchMissionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tdc.heroes.Heroes.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LaunchMissionService");
    }
  }

  private static final class LaunchMissionServiceFileDescriptorSupplier
      extends LaunchMissionServiceBaseDescriptorSupplier {
    LaunchMissionServiceFileDescriptorSupplier() {}
  }

  private static final class LaunchMissionServiceMethodDescriptorSupplier
      extends LaunchMissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LaunchMissionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LaunchMissionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LaunchMissionServiceFileDescriptorSupplier())
              .addMethod(getNewMissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
