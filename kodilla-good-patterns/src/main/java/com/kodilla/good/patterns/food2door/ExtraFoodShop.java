package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Shop {
    @Override
    public String getName() {
        return "ExtraFoodShop";
    }

    @Override
    public Product getProduct() {
        return new Product("Wegan extra food", 15);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("I process order according to my shop." +
                "I send confirmation via email");


        return true;
    }
}
