package com.gilbert.jooq.film.entity;

import java.util.Arrays;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class FilmPriceSummary {

    private long filmId;
    private String title;
    private double rentalRate;
    private PriceCategory priceCategory;
    private long totalInventory;

    @Getter
    @RequiredArgsConstructor
    public enum PriceCategory {

        CHEAP("Cheap"),
        MODERATE("Moderate"),
        EXPENSIVE("Expensive");

        private final String code;

        public static PriceCategory valueOfCode(String code) {
            return Arrays.stream(values())
                .filter(value -> code.equalsIgnoreCase(value.getCode()))
                .findFirst()
                .orElse(null);
        }
    }

}
