package com.kodilla.good.patterns.flights;

import java.util.Set;

public class AplicationFlights {
    public static void main(String[] args) {
        FlightsDb flightsDb = new FlightsDb();
        FinderFlight finderFlight = new FinderFlight(flightsDb.getFlights());

        Set<Flight> foundFlights = finderFlight.findFlightsToCity("Tokio");
        System.out.println("========================================");
        System.out.println("Flight to City Tokio ");
        if (foundFlights.size() == 0) {
            System.out.println("No flights found");
        } else {
            foundFlights.stream()
                    .forEach(System.out::println);
        }
        System.out.println("=====================================");


        System.out.println("================================== ");
        System.out.println("Flights from city Warsaw");
       foundFlights = finderFlight.findFlightsFromCity("Warsaw");
        if (foundFlights.size() == 0) {
            System.out.println("No flights found");
        } else {
            foundFlights.stream()
                    .forEach(System.out::println);
        }
        System.out.println("===========================");


        System.out.println("=======================");
        System.out.println("Direct flights from Warsaw to Tokio");
        foundFlights = finderFlight.getDirectRoute("Warsaw","Tokio");
        if (foundFlights.size() == 0) {
            System.out.println("No flights found");
        } else {
            foundFlights.stream()
                    .forEach(System.out::println);
        }
        System.out.println("=========================");


        System.out.println("================================");
        finderFlight.getIndirectRoute("Warsaw","Tokio");
    }
}
