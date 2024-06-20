package com.gilbert.jooq.actor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.jooq.generated.tables.pojos.Actor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ActorRepositoryTest {

    @Autowired
    ActorRepository actorRepository;

    @Test
    void findByFirstnameAndLastName() {
        String firstName = "ED";
        String lastName = "CHASE";
        List<Actor> actors = actorRepository.findByFirstNameAndLastName(firstName, lastName);
        assertThat(actors).hasSize(1);
    }

}