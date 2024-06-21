package com.gilbert.jooq.actor.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.gilbert.jooq.actor.dto.ActorFilmographySearchCondition;
import com.gilbert.jooq.actor.entity.ActorFilmography;
import org.jooq.generated.tables.pojos.Actor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ActorRepositoryTest {

    @Autowired
    ActorRepository actorRepository;

    @Test
    void findByFirstNameAndLastName() {
        String firstName = "ED";
        String lastName = "CHASE";
        List<Actor> actors = actorRepository.findByFirstNameAndLastName(firstName, lastName);
        assertThat(actors).hasSize(1);
    }

    @Test
    void findByFirstNameOrLastName() {
        String firstName = "ED";
        String lastName = "CHASE";
        List<Actor> actors = actorRepository.findByFirstNameOrLastName(firstName, lastName);
        assertThat(actors).hasSize(4);
    }

    @Test
    void findByActorIdIn() {
        List<Long> actorIds = List.of(1L, 3L, 5L);
        List<Actor> actors = actorRepository.findByActorIdIn(actorIds);
        assertThat(actors).hasSize(3);

        assertThat(actorRepository.findByActorIdIn(null)).hasSize(200);
        assertThat(actorRepository.findByActorIdIn(List.of())).hasSize(200);
    }

    @Test
    void findByMultipleConditions() {
        ActorFilmographySearchCondition condition = new ActorFilmographySearchCondition("LOLLOBRIGIDA");
        List<ActorFilmography> actorFilmographies = actorRepository.findActorFilmography(condition);
        assertThat(actorFilmographies).hasSize(1);

        ActorFilmographySearchCondition condition2 = new ActorFilmographySearchCondition("LOLLOBRIGIDA", "COMMANDMENTS EXPRESS");
        List<ActorFilmography> actorFilmographies2 = actorRepository.findActorFilmography(condition2);
        assertThat(actorFilmographies2).hasSize(1);

        List<ActorFilmography> actorFilmographies3 = actorRepository.findActorFilmography(new ActorFilmographySearchCondition(null));
        assertThat(actorFilmographies3).hasSize(200);
    }
}