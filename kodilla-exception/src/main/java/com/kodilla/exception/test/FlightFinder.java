package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {


    public boolean flightFinder(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Balice", true);
        flights.put("Okęcie", true);
        flights.put("Pyrzowice", false);
        flights.put("Modlin", true);

        String arrival = flight.getArrivalAirport();
        String departure = flight.getDepartureAirport();

        if(flights.containsKey(arrival) && flights.containsKey(departure)) {
            return flights.get(arrival) && flights.get(departure);
        }else{
            throw new RouteNotFoundException("That flight is not possible!");
        }
    }
}

