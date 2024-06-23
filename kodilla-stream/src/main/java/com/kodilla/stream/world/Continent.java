package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> countries = new ArrayList<Country>();

    public List<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country){
        countries.add(country);
    }
}
