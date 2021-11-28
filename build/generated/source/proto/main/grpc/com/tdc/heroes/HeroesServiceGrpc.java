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
 * <pre>
 * SERVICE
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: Heroes.proto")
public final class HeroesServiceGrpc {

  private HeroesServiceGrpc() {}

  public static final String SERVICE_NAME = "heroes.HeroesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tdc.heroes.CreateHeroRequest,
      com.tdc.heroes.CreateHeroResponse> getCreateHeroMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createHero",
      requestType = com.tdc.heroes.CreateHeroRequest.class,
      responseType = com.tdc.heroes.CreateHeroResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tdc.heroes.CreateHeroRequest,
      com.tdc.heroes.CreateHeroResponse> getCreateHeroMethod() {
    io.grpc.MethodDescriptor<com.tdc.heroes.CreateHeroRequest, com.tdc.heroes.CreateHeroResponse> getCreateHeroMethod;
    if ((getCreateHeroMethod = HeroesServiceGrpc.getCreateHeroMethod) == null) {
      synchronized (HeroesServiceGrpc.class) {
        if ((getCreateHeroMethod = HeroesServiceGrpc.getCreateHeroMethod) == null) {
          HeroesServiceGrpc.getCreateHeroMethod = getCreateHeroMethod =
              io.grpc.MethodDescriptor.<com.tdc.heroes.CreateHeroRequest, com.tdc.heroes.CreateHeroResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createHero"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tdc.heroes.CreateHeroRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tdc.heroes.CreateHeroResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HeroesServiceMethodDescriptorSupplier("createHero"))
              .build();
        }
      }
    }
    return getCreateHeroMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tdc.heroes.ListHeroesRequest,
      com.tdc.heroes.ListHeroesResponse> getListHeroesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listHeroes",
      requestType = com.tdc.heroes.ListHeroesRequest.class,
      responseType = com.tdc.heroes.ListHeroesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tdc.heroes.ListHeroesRequest,
      com.tdc.heroes.ListHeroesResponse> getListHeroesMethod() {
    io.grpc.MethodDescriptor<com.tdc.heroes.ListHeroesRequest, com.tdc.heroes.ListHeroesResponse> getListHeroesMethod;
    if ((getListHeroesMethod = HeroesServiceGrpc.getListHeroesMethod) == null) {
      synchronized (HeroesServiceGrpc.class) {
        if ((getListHeroesMethod = HeroesServiceGrpc.getListHeroesMethod) == null) {
          HeroesServiceGrpc.getListHeroesMethod = getListHeroesMethod =
              io.grpc.MethodDescriptor.<com.tdc.heroes.ListHeroesRequest, com.tdc.heroes.ListHeroesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listHeroes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tdc.heroes.ListHeroesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tdc.heroes.ListHeroesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HeroesServiceMethodDescriptorSupplier("listHeroes"))
              .build();
        }
      }
    }
    return getListHeroesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeroesServiceStub newStub(io.grpc.Channel channel) {
    return new HeroesServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeroesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeroesServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeroesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeroesServiceFutureStub(channel);
  }

  /**
   * <pre>
   * SERVICE
   * </pre>
   */
  public static abstract class HeroesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createHero(com.tdc.heroes.CreateHeroRequest request,
        io.grpc.stub.StreamObserver<com.tdc.heroes.CreateHeroResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateHeroMethod(), responseObserver);
    }

    /**
     */
    public void listHeroes(com.tdc.heroes.ListHeroesRequest request,
        io.grpc.stub.StreamObserver<com.tdc.heroes.ListHeroesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListHeroesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateHeroMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tdc.heroes.CreateHeroRequest,
                com.tdc.heroes.CreateHeroResponse>(
                  this, METHODID_CREATE_HERO)))
          .addMethod(
            getListHeroesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tdc.heroes.ListHeroesRequest,
                com.tdc.heroes.ListHeroesResponse>(
                  this, METHODID_LIST_HEROES)))
          .build();
    }
  }

  /**
   * <pre>
   * SERVICE
   * </pre>
   */
  public static final class HeroesServiceStub extends io.grpc.stub.AbstractStub<HeroesServiceStub> {
    private HeroesServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeroesServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeroesServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeroesServiceStub(channel, callOptions);
    }

    /**
     */
    public void createHero(com.tdc.heroes.CreateHeroRequest request,
        io.grpc.stub.StreamObserver<com.tdc.heroes.CreateHeroResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateHeroMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listHeroes(com.tdc.heroes.ListHeroesRequest request,
        io.grpc.stub.StreamObserver<com.tdc.heroes.ListHeroesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHeroesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SERVICE
   * </pre>
   */
  public static final class HeroesServiceBlockingStub extends io.grpc.stub.AbstractStub<HeroesServiceBlockingStub> {
    private HeroesServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeroesServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeroesServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeroesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tdc.heroes.CreateHeroResponse createHero(com.tdc.heroes.CreateHeroRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateHeroMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tdc.heroes.ListHeroesResponse listHeroes(com.tdc.heroes.ListHeroesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListHeroesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SERVICE
   * </pre>
   */
  public static final class HeroesServiceFutureStub extends io.grpc.stub.AbstractStub<HeroesServiceFutureStub> {
    private HeroesServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeroesServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeroesServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeroesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tdc.heroes.CreateHeroResponse> createHero(
        com.tdc.heroes.CreateHeroRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateHeroMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tdc.heroes.ListHeroesResponse> listHeroes(
        com.tdc.heroes.ListHeroesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListHeroesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HERO = 0;
  private static final int METHODID_LIST_HEROES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeroesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeroesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_HERO:
          serviceImpl.createHero((com.tdc.heroes.CreateHeroRequest) request,
              (io.grpc.stub.StreamObserver<com.tdc.heroes.CreateHeroResponse>) responseObserver);
          break;
        case METHODID_LIST_HEROES:
          serviceImpl.listHeroes((com.tdc.heroes.ListHeroesRequest) request,
              (io.grpc.stub.StreamObserver<com.tdc.heroes.ListHeroesResponse>) responseObserver);
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

  private static abstract class HeroesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeroesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tdc.heroes.Heroes.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeroesService");
    }
  }

  private static final class HeroesServiceFileDescriptorSupplier
      extends HeroesServiceBaseDescriptorSupplier {
    HeroesServiceFileDescriptorSupplier() {}
  }

  private static final class HeroesServiceMethodDescriptorSupplier
      extends HeroesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeroesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeroesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeroesServiceFileDescriptorSupplier())
              .addMethod(getCreateHeroMethod())
              .addMethod(getListHeroesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
