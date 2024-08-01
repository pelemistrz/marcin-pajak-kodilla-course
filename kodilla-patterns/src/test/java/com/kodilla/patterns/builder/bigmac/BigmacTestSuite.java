package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BigmacTestSuite {
    @Test
    void testBigmacNew(){
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_SEZAM)
                .souce("1000 islands")
                .burgers(3)
                .addIngredient("tomato")
                .addIngredient("pickel")
                .addIngredient("cheese")
                .build();
        System.out.println(bigmac);
        //when
        int howManyBurgers = bigmac.getBurgers();
        //then
        assertEquals(3, howManyBurgers);
        assertEquals("1000 islands", bigmac.getSouce());
        assertEquals(Bun.WITH_SEZAM, bigmac.getBun());
        assertEquals(3, bigmac.getIngredients().size());
    }
}
