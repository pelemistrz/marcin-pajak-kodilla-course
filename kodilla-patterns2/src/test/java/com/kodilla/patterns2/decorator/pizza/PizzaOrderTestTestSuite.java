package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


class PizzaOrderTestTestSuite {
    @Test
    void testPizzaOrderWithMushrooms() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new MushroomDecorator(theOrder);
        //When and then
        assertEquals(new BigDecimal("27"), theOrder.getPrice());
        assertEquals("Pizza on shortcrust pastry + mushrooms", theOrder.getName());
    }
    @Test
    void testPizzaOrderWithCheeseAndDoubleSalami() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        //when and then
        assertEquals(new BigDecimal("41"), theOrder.getPrice());
        assertEquals("Pizza on shortcrust pastry + with cheese + salami + salami", theOrder.getName());

    }
}