package com.gilbert.jooq.common.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PageResponse {

    private final long page;
    private final long pageSize;
}
