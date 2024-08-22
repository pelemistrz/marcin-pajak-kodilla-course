package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;
    private LocalDateTime departureTime;
    private int durationOfFlight;

    public Flight(String departureAirport, String arrivalAirport,int durationOfFlight, int year, int month, int day,int hour, int minute) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = LocalDateTime.of(year, month, day, hour, minute);
        this.durationOfFlight = durationOfFlight;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getDurationOfFlight() {
        return durationOfFlight;
    }

    public void setDurationOfFlight(int durationOfFlight) {
        this.durationOfFlight = durationOfFlight;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;
        return durationOfFlight == flight.durationOfFlight && departureAirport.equals(flight.departureAirport) && arrivalAirport.equals(flight.arrivalAirport) && departureTime.equals(flight.departureTime);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        result = 31 * result + departureTime.hashCode();
        result = 31 * result + durationOfFlight;
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureTime=" + departureTime +
                ", durationOfFlight=" + durationOfFlight +
                '}';
    }
}
