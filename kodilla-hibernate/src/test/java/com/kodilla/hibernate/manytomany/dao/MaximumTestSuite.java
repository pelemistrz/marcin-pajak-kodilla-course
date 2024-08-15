package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Maximum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTestSuite {
    @Test
    void testMaximumAndMinimum() {
        //given
        List<Integer> list = Arrays.asList(3,1,1,5,6,7,9,15,3,4,7,10);

        //when
        int max = Maximum.getMaximum(list);
        int minimum = Maximum.getMinimum(list);
        int secondMax = Maximum.getSecondMaximum(list);
        int secondMin = Maximum.getSecondMinimum(list);
        //then
        assertEquals(15,max);
        assertEquals(1,minimum);
        assertEquals(10,secondMax);
        assertEquals(3,secondMin);
    }
}
