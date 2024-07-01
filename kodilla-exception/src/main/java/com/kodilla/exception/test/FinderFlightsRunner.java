package com.kodilla.exception.test;

public class FinderFlightsRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Lima");
        FinderFlights finderFlights = new FinderFlights();
        try {
            finderFlights.findFlight(flight1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
