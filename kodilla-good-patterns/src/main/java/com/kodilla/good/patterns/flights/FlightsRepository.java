package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsRepository {

        private final List<Flights> listOfFlights = new ArrayList<>();

    public FlightsRepository() {
        this.listOfFlights.add(new Flights("Warszawa", "Kraków"));
        this.listOfFlights.add(new Flights("Kraków", "Warszawa"));
        this.listOfFlights.add(new Flights("Wrocław", "Kraków"));
        this.listOfFlights.add(new Flights("Warszawa", "Wrocław"));
        this.listOfFlights.add(new Flights("Kraków", "Wrocław"));
        this.listOfFlights.add(new Flights("Warszawa", "Wrocław"));
    }

    public List<Flights> getListOfFlights(){
        return listOfFlights;
    }
}
