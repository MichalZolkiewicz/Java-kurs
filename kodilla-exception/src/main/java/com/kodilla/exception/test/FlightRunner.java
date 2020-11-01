package com.kodilla.exception.test;

public class FlightRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Balice", "Radom");
        FlightFinder findFlight = new FlightFinder();

        try {
            boolean isPossibleFlight = findFlight.flightFinder(flight);
            if (isPossibleFlight) {
                System.out.println("The flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport()
                        + " is possible!");
            } else {
                System.out.println("Unfortunately there is no such connection!");
            }
        }catch(RouteNotFoundException exception) {
            System.out.println("Commencing a new search. " + exception.getMessage());
        }finally{
            System.out.println("Thank you for using Kodilla Airlines!");
        }
    }
}
