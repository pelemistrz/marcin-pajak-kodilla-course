package com.kodilla.example;



import java.time.LocalDateTime;

public class CarRentalService implements RentalService {
    @Override
    public boolean rent(User user, LocalDateTime carRentFrom, LocalDateTime carRentTo) {
        return true;
    }
}
