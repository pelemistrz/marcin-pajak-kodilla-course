package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Shop {
    @Override
    public String getName() {
        return "Gluten Free Shop";
    }

    @Override
    public Product getProduct() {
        return new Product("Gluten free bread", 150);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("One day deliver. Employee will call to confirm ATA");
        return true;
    }
}
