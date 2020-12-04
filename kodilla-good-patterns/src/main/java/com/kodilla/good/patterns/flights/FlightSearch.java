package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.*;

public class FlightSearch {

    private final FlightsRepository flightsRepository;

    public FlightSearch(FlightsRepository flightsRepository) {
        this.flightsRepository = flightsRepository;
    }

    public List<Flights> getFlightsTo(String arrivalCity) {

        return flightsRepository.getListOfFlights().stream()
                .filter(flights -> flights.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Flights> getFlightsFrom(String departureCity) {

        return flightsRepository.getListOfFlights().stream()
                .filter(flights -> flights.getDepartureCity().equals(departureCity))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public String getFlightThrough(Flights flights) {

        String departure = flights.getDepartureCity();
        String arrival = flights.getArrivalCity();

        List<Flights> flightsFrom = getFlightsFrom(departure);
        List<Flights> flightsTo = getFlightsTo(arrival);

        ArrayList<Flights> notDirectFlightsFrom = flightsFrom.stream()
                .filter(from -> flightsTo.stream()
                        .anyMatch(to -> to.getDepartureCity().equals(from.getArrivalCity())))
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Flights> notDirectFlightsTo = flightsTo.stream()
                .filter(to -> flightsFrom.stream()
                        .anyMatch(from -> from.getArrivalCity().equals(to.getDepartureCity())))
                .collect(Collectors.toCollection(ArrayList::new));

        String flightThrough = Stream.of(notDirectFlightsFrom, notDirectFlightsTo)
                .flatMap(Collection::stream)
                .map(Objects::toString)
                .collect(Collectors.joining(","));

        if (notDirectFlightsFrom.isEmpty() && notDirectFlightsTo.isEmpty()) {
            return "\nOnly direct flights available.";
        }else{
            return "\nThere are indirect flights: " + flightThrough;
        }
    }
}

