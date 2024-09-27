package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaDekorator implements PizzaOrder{
    PizzaOrder pizzaOrder;

    public AbstractPizzaDekorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaOrder.getPrice();
    }

    @Override
    public String getName() {
        return pizzaOrder.getName();
    }
}
