package com.tdc.heroes.server;

import com.tdc.heroes.CreateHeroRequest;
import com.tdc.heroes.CreateHeroResponse;
import com.tdc.heroes.Hero;
import com.tdc.heroes.HeroesServiceGrpc;
import com.tdc.heroes.ListHeroesRequest;
import com.tdc.heroes.ListHeroesResponse;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class HeroesServiceImpl extends HeroesServiceGrpc.HeroesServiceImplBase {

    private List<Hero> heroes = new ArrayList<>();

    @Override
    public void createHero(CreateHeroRequest request, StreamObserver<CreateHeroResponse> responseObserver) {
        for (int i = 0; i < 100; i++) {
            Hero newHero = Hero.newBuilder()
                    .setNickname(request.getNickname()+ " -> " + i)
                    .addAllSkills(request.getSkillsList())
                    .build();

            CreateHeroResponse heroResponse = CreateHeroResponse.newBuilder()
                    .setHero(newHero)
                    .build();

            System.out.println("Hero created: " + newHero);
            this.heroes.add(newHero);

            responseObserver.onNext(heroResponse);
        }

        responseObserver.onCompleted();
    }

    @Override
    public void listHeroes(ListHeroesRequest request, StreamObserver<ListHeroesResponse> responseObserver) {
        ListHeroesResponse response = ListHeroesResponse.newBuilder()
                .addAllHeroes(this.heroes)
                .build();

        System.out.println("List of heroes: "  + this.heroes);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
