package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testAverage(){
        //Given
        int[] numbers = {1,2,3,4,5,6,7,8,9,10, 11,12,13,14,15,16,17,18,19,20};

        //When
        OptionalDouble average = ArrayOperations.getAverage(numbers);
        double averageDouble = average.getAsDouble();
        //Then
        assertEquals(10.5, averageDouble, 0.001);
    }
}
