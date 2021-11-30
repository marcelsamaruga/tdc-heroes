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
        StreamObserver<CreateHeroRequest> createHeroObserver = heroesStub.createHero(new CreateHeroResponseStreamObserver(latch));

        createHeroObserver.onNext(
            createHero("Batman", "wealth")
        );

        createHeroObserver.onNext(
                createHero("Batman", "martial arts")
        );

        try {
            Thread.sleep(5000);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        createHeroObserver.onNext(
                createHero("Flash", "super speed")
        );

        createHeroObserver.onNext(
                createHero("Flash", "time travel")
        );

        createHeroObserver.onCompleted();

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
            System.out.println("Hero has been created or updated: " + heroCreated);
        }

        @Override
        public void onError(Throwable t) {
            Status error = Status.fromCode(Status.Code.UNKNOWN);
            throw new RuntimeException(error.withDescription("Error description").asException());
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
