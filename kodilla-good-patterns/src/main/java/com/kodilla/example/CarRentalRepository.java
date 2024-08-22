package com.kodilla.example;


import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    @Override
    public void createRental(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("saving rental to db");
    }
}
