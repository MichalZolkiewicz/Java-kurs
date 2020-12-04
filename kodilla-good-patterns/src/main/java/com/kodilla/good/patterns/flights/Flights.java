package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flights {

    private final String departureCity;
    private final String arrivalCity;

    public Flights(String departureCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return departureCity.equals(flights.departureCity) &&
                arrivalCity.equals(flights.arrivalCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, arrivalCity);
    }

    @Override
    public String toString() {
        return  departureCity + " -> " + arrivalCity;
    }
}
