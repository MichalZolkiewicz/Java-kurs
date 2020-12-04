package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {


        FlightsRepository flightsRepository = new FlightsRepository();
        FlightSearch flightSearch = new FlightSearch(flightsRepository);

        flightSearch.getFlightsTo("Wrocław").forEach(System.out::println);
        System.out.println();
        flightSearch.getFlightsFrom("Warszawa").forEach(System.out::println);

        System.out.println(flightSearch.getFlightThrough(new Flights("Warszawa", "Kraków")));

    }
}
