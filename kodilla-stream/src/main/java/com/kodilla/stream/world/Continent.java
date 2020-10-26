package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continentName;
    private final List<Country> countries = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public final void addCountry(Country country) {
        countries.add(country);
    }

    public final List<Country> getCountry() {
        return countries;
    }

    public String getContinentName() {
        return continentName;
    }
}
