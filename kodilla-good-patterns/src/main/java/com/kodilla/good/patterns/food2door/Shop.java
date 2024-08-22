package com.kodilla.good.patterns.food2door;

public interface Shop {
    public String getName();
    public Product getProduct();
    public boolean process(Order order);
}
