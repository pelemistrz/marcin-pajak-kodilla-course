package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String nameOfCountry;
    private final BigDecimal population;

    public Country(String nameOfCountry, BigDecimal population) {
        this.nameOfCountry = nameOfCountry;
        this.population = population;
    }

    public BigDecimal getPeopleQuantity(){
        return population;
    }
}
