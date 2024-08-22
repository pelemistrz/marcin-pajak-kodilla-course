package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsDb {
    private Set<Flight> flights = new HashSet<>();

    public FlightsDb() {

        String[] cities = {"Warsaw","Tokio", "Los Angeles","Madrid","Monachium"};

        for(int i = 0; i < 300; i++){
            String cityFrom = cities[(int)(Math.random()*cities.length)];
            String cityTo = cities[(int)(Math.random()*cities.length)];
            while (cityFrom.equals(cityTo)){
                cityFrom = cities[(int)(Math.random()*cities.length)];
            }

            int durationOfFlight = 3+(int)(Math.random()*6);
            int day = 1+(int)(Math.random()*31);
            int hour = (int)(Math.random()*24);
            int minute = (int)(Math.random()*60);
            Flight flight = new Flight(cityFrom,cityTo,durationOfFlight,2024,8,day,hour,minute);
            flights.add(flight);
        }
    }


    public Set<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }
}
