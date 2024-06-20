package com.gilbert.jooq.actor;

import java.util.List;

import org.springframework.stereotype.Repository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.generated.tables.Actor_;
import org.jooq.generated.tables.pojos.Actor;

@RequiredArgsConstructor
@Repository
public class ActorRepository {

    public static final Actor_ ACTOR = Actor_.ACTOR;
    private final DSLContext dslContext;

    public List<Actor> findByFirstNameAndLastName(String firstName, String lastName) {
        return dslContext.selectFrom(ACTOR)
            .where(
                ACTOR.FIRST_NAME.eq(firstName).and(ACTOR.LAST_NAME.eq(lastName))
            ).fetchInto(Actor.class);
    }
}
