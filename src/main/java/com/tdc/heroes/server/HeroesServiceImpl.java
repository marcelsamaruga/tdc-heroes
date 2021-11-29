package com.tdc.heroes.server;

import com.tdc.heroes.CreateHeroRequest;
import com.tdc.heroes.CreateHeroResponse;
import com.tdc.heroes.Hero;
import com.tdc.heroes.HeroesServiceGrpc;
import com.tdc.heroes.ListHeroesRequest;
import com.tdc.heroes.ListHeroesResponse;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;

public class HeroesServiceImpl extends HeroesServiceGrpc.HeroesServiceImplBase {

    private Map<String, Hero> heroes = new HashMap<>();

    @Override
    public StreamObserver<CreateHeroRequest> createHero(StreamObserver<CreateHeroResponse> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(CreateHeroRequest createHeroRequest) {
                // if hero does exist then include skill only
                if (heroes.containsKey(createHeroRequest.getNickname())) {
                    Hero heroExisted = heroes.get(createHeroRequest.getNickname());

                    Hero hero = Hero.newBuilder()
                            .setNickname(createHeroRequest.getNickname())
                            .addAllSkills(createHeroRequest.getSkillsList())
                            .addAllSkills(heroExisted.getSkillsList())
                            .build();

                    heroes.replace(createHeroRequest.getNickname(), hero);

                    System.out.println(createHeroRequest.getNickname() + " skills updated");

                // new hero
                } else {
                    heroes.put(createHeroRequest.getNickname()
                            , Hero.newBuilder()
                                    .setNickname(createHeroRequest.getNickname())
                                    .addAllSkills(createHeroRequest.getSkillsList())
                                    .build());

                    if (heroes.size() > 1) {
                        throw new RuntimeException("Hero should be unique on the request");
                    }

                    System.out.println("New hero created: " + createHeroRequest.getNickname());
                }
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("An error has happened: " + t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(
                       CreateHeroResponse.newBuilder()
                               .setHero(heroes.values().stream().findFirst().get())
                               .build()
                );

                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void listHeroes(ListHeroesRequest request, StreamObserver<ListHeroesResponse> responseObserver) {
        ListHeroesResponse response = ListHeroesResponse.newBuilder()
                .addAllHeroes(this.heroes.values())
                .build();

        System.out.println("List of heroes: "  + this.heroes);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
