package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Shop {
    @Override
    public String getName() {
        return "Healthy Shop";
    }

    @Override
    public Product getProduct() {
        return new Product("Healthy chicken", 20);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("I process the order and send confirmation via sms");
        return true;
    }
}
