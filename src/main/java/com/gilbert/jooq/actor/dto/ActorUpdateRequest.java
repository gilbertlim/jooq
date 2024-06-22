package com.gilbert.jooq.actor.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ActorUpdateRequest {

    private final String firstName;
    private final String lastName;

    public ActorUpdateRequest(String firstName) {
        this(firstName, null);
    }
}
