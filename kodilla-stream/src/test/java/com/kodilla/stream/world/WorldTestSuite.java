package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent america = new Continent();
        Continent asia = new Continent();
        Continent australia = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("37000000")));
        europe.addCountry(new Country("Spain",new BigDecimal("40000000")));
        europe.addCountry(new Country("France",new BigDecimal("85000000")));
        asia.addCountry(new Country("China",new BigDecimal("1200000000")));
        asia.addCountry(new Country("India",new BigDecimal("1500000000")));
        australia.addCountry(new Country("Australia",new BigDecimal("80000000")));
        america.addCountry(new Country("USA",new BigDecimal("300000000")));
        america.addCountry(new Country("Canada",new BigDecimal("40000000")));
        world.addContinent(europe);
        world.addContinent(america);
        world.addContinent(asia);
        world.addContinent(australia);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal peopleQuantityexpected = new BigDecimal("3282000000");
        assertEquals(peopleQuantityexpected,peopleQuantity);
    }
}
