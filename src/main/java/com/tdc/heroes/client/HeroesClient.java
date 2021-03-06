package com.tdc.heroes.client;

import com.tdc.heroes.CreateHeroRequest;
import com.tdc.heroes.CreateHeroResponse;
import com.tdc.heroes.HeroesServiceGrpc;
import com.tdc.heroes.ListHeroesRequest;
import com.tdc.heroes.ListHeroesResponse;
import com.tdc.heroes.Skill;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HeroesClient {

    private static final String HOST = "localhost";
    private static final int PORT = 50051;

    public static void main(String[] args) {
        System.out.println("HeroesClient has started");

        ManagedChannel channel = openChannel();

        // unary request (blocking stub)
            HeroesServiceGrpc.HeroesServiceBlockingStub heroesStub = HeroesServiceGrpc.newBlockingStub(channel);

        // create a new hero
        CreateHeroRequest createBatmanRequest = CreateHeroRequest.newBuilder()
                .addSkills(Skill.newBuilder().setStrength("martial arts").build())
                .addSkills(Skill.newBuilder().setStrength("wisdom").build())
                .setNickname("Batman")
                .build();

        // invoke gRPC service [createHero]
        CreateHeroResponse createBatmanResponse = heroesStub.createHero(createBatmanRequest);
        System.out.println("New hero: " + createBatmanResponse);

        // create a new hero
        CreateHeroRequest createFlashRequest = CreateHeroRequest.newBuilder()
                .addSkills(Skill.newBuilder().setStrength("super speed").build())
                .addSkills(Skill.newBuilder().setStrength("time travel").build())
                .setNickname("Flash")
                .build();

        // invoke gRPC service [createHero]
        CreateHeroResponse createFlashResponse = heroesStub.createHero(createFlashRequest);
        System.out.println("New hero: " + createFlashResponse);

        // **** **** ****

        // invoke gRPC service [listHeroes]
        ListHeroesResponse listHeroesResponse =
                heroesStub.listHeroes(ListHeroesRequest.newBuilder().build());

        System.out.println("List of heroes: " + listHeroesResponse.getHeroesList());

        channel.shutdown();
    }

    private static ManagedChannel openChannel() {
        return  ManagedChannelBuilder
                .forAddress(HOST, PORT)
                .usePlaintext()
                .build();
    }
}
