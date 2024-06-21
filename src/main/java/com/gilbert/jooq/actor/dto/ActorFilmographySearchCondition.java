package com.gilbert.jooq.actor.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ActorFilmographySearchCondition {

    private final String actorName;
    private final String filmTitle;

    public ActorFilmographySearchCondition(String actorName) {
        this(actorName, null);
    }
}
