package com.tdc.heroes.client;

import com.tdc.heroes.CreateHeroRequest;
import com.tdc.heroes.CreateHeroResponse;
import com.tdc.heroes.HeroesServiceGrpc;
import com.tdc.heroes.Skill;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class HeroesClient {

    private static final String HOST = "localhost";
    private static final int PORT = 50051;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("HeroesClient has started");

        ManagedChannel channel = openChannel();

        // client streaming (new stub - async)
        HeroesServiceGrpc.HeroesServiceStub heroesStub = HeroesServiceGrpc.newStub(channel);


        // invoke gRPC service [createHero]
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<CreateHeroRequest> createBatmanObserver = heroesStub.createHero(new CreateHeroResponseStreamObserver(latch));

        createBatmanObserver.onNext(
            createHero("Batman", "wealth")
        );

        createBatmanObserver.onNext(
                createHero("Batman", "martial arts")
        );

        createBatmanObserver.onNext(
                createHero("Batman", "weapon skills")
        );

        createBatmanObserver.onNext(
                createHero("Batman", "wisdom")
        );

        createBatmanObserver.onCompleted();

        latch.await();

        // **** **** ****

        channel.shutdown();
    }

    private static ManagedChannel openChannel() {
        return  ManagedChannelBuilder
                .forAddress(HOST, PORT)
                .usePlaintext()
                .build();
    }

    private static class CreateHeroResponseStreamObserver implements StreamObserver<CreateHeroResponse> {

        private CountDownLatch latch;

        CreateHeroResponseStreamObserver(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void onNext(CreateHeroResponse heroCreated) {
            System.out.println(heroCreated);
        }

        @Override
        public void onError(Throwable t) {
            Status error = Status.fromCode(Status.Code.UNKNOWN);
            System.out.println(error.withDescription("An error has happened on client CreateHeroRequest"));
            throw new RuntimeException(error.asException());
        }

        @Override
        public void onCompleted() {
            this.latch.countDown();
        }
    }

    private static CreateHeroRequest createHero(String nickname, String skill) {
        return CreateHeroRequest.newBuilder()
                .addSkills(Skill.newBuilder().setStrength(skill).build())
                .setNickname(nickname)
                .build();
    }
}
