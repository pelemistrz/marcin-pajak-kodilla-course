package com.kodilla.good.patterns.carService;

import java.time.LocalDateTime;

public class RentRequesterRetriever {
    public RentRequest retrieve(){
        User user = new User();

        LocalDateTime rentFrom = LocalDateTime.of(2017,8,1,12,0);
        LocalDateTime rentTo = LocalDateTime.of(2017,8,10,12,0);

        return new RentRequest(user, rentFrom,rentTo)
    }
}
