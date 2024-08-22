package com.kodilla.example;


import java.time.LocalDateTime;

 public interface RentalService {
    boolean rent(User user, LocalDateTime carRentFrom,LocalDateTime carRentTo);
}
