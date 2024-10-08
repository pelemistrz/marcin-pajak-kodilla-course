package com.kodilla.example;


import java.time.LocalDateTime;

public class RentRequestRetriever {
    public RentRequest retrieve(){
        User user = new User("John", "Doe");
        LocalDateTime rentFrom = LocalDateTime.of(2017,8,1,12,0);
        LocalDateTime rentTo = LocalDateTime.of(2017,8,12,12,0);

        return new RentRequest(user,rentFrom,rentTo);
    }
}
