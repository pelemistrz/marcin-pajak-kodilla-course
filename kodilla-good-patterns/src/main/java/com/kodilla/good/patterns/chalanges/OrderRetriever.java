package com.kodilla.good.patterns.chalanges;

import java.time.LocalDate;

public class OrderRetriever {
    public Order retrieve(){
        User user = new User("John", "Smith");
        Item item = new Item("Hammer" , 10.24);
        LocalDate date = LocalDate.of(2024,8,23);

        return new Order(user,item,date);
    }
}
