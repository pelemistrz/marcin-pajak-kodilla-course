package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder{
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(20);
    }

    @Override
    public String getName() {
        return "Pizza on shortcrust pastry";
    }


}
