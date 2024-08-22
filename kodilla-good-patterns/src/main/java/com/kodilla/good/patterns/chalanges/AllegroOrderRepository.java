package com.kodilla.good.patterns.chalanges;

import java.time.LocalDate;

public class AllegroOrderRepository implements OrderRepository {
    @Override
    public void createOrder(Order order) {
        System.out.println("Saving order to db Allegro");
    }
}
