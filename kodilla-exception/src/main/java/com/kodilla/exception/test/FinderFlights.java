package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FinderFlights {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Tokio", false);
        flights.put("Berlin", false);
        flights.put("Monachium", true);
        flights.put("Gdansk", true);
        flights.put("Krakow", true);
        flights.put("New York", false);
        for (Map.Entry<String, Boolean> entry : flights.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport()) && entry.getValue()) {
                System.out.println("You can flight there");
                return;
            }
            if (entry.getKey().equals(flight.getArrivalAirport()) && !entry.getValue()) {
                System.out.println("You can not flight there");
                return;
            }
        }
        throw new RouteNotFoundException("This airport does not exist on our map");
    }
}
