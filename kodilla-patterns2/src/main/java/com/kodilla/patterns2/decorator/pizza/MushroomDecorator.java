package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomDecorator extends AbstractPizzaDekorator{
    public MushroomDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(BigDecimal.valueOf(7));
    }

    @Override
    public String getName() {
        return super.getName()+" + mushrooms";
    }
}
