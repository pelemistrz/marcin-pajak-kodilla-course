package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class FinderFlight {
    private Set<Flight> flights;

    public FinderFlight(Set<Flight> flights) {
        this.flights = flights;
    }

    public Set<Flight> findFlightsToCity(String destination){
        Set<Flight> foundFlights = flights.stream()
                .filter(f -> f.getArrivalAirport().equals(destination))
                .collect(Collectors.toSet());
        return foundFlights;
    }
    public Set<Flight> findFlightsFromCity(String origin){
        Set<Flight> foundFlights = flights.stream()
                .filter(f -> f.getDepartureAirport().equals(origin))
                .collect(Collectors.toSet());
        return foundFlights;
    }

    public Set<Flight> getDirectRoute(String origin, String destination) {
        Set<Flight> foundFlights = flights.stream()
                .filter(f->f.getDepartureAirport().equals(origin))
                .filter(f->f.getArrivalAirport().equals(destination))
                .collect(Collectors.toSet());
        return foundFlights;
    }


   public void getIndirectRoute(String origin, String destination) {

      Set<Flight> flightsFromOrigin = findFlightsFromCity(origin);
      Set<Flight> flightsToDestination = findFlightsToCity(destination);



      Map<Flight,Flight> indirectRoutes = new HashMap<>();
      for(Flight flightFrom : flightsFromOrigin){
          if(flightFrom.getArrivalAirport().equals(destination)){
              continue;
          } else {
            for(Flight flightTo : flightsToDestination){
                LocalDateTime timeOfArrival = flightFrom.getDepartureTime().plusHours(flightFrom.getDurationOfFlight());

                long hours = ChronoUnit.HOURS.between(timeOfArrival, flightTo.getDepartureTime());

                  if(flightFrom.getArrivalAirport().equals(flightTo.getDepartureAirport()) && hours < 12 && hours > 1  ){
                      indirectRoutes.put(flightFrom, flightTo);
                  }
              }
          }
      }
      for(Map.Entry<Flight,Flight> entry : indirectRoutes.entrySet()){
          System.out.println("Route: " + entry.getKey().toString() + "\n -> " + entry.getValue().toString());
          System.out.println("*******************");
      }
    }
}
