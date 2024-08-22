package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class Order {
    private Product product;
    private LocalDate date;

    public Order(Product product, LocalDate date) {
        this.product = product;
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDate() {
        return date;
    }
}
