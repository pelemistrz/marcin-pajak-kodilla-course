package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
     private Calculator calculator;


    @Test
    void testCalculations(){
        //given
        double a = 5.7;
        double b = 3.0;
        //when
        //then
        assertAll(
                ()->assertEquals(8.7, calculator.add(a, b), 0.0000000000001),
                ()->assertEquals(2.7,calculator.sub(a,b), 0.0000000000001),
                ()->assertEquals(17.1,calculator.mul(a,b), 0.0000000000001),
                ()->assertEquals(1.9,calculator.div(a,b), 0.0000000000001)
        );
    }
}
