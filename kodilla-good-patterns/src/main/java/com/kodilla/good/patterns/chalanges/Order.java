package com.kodilla.good.patterns.chalanges;

import java.time.LocalDate;

public class Order {
    Item item;
    LocalDate timeOfOrder;
    User user;

    public Order(User user, Item item, LocalDate timeOfOrder) {
        this.item = item;
        this.timeOfOrder = timeOfOrder;
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public LocalDate getTimeOfOrder() {
        return timeOfOrder;
    }

    public User getUser() {
        return user;
    }
}
