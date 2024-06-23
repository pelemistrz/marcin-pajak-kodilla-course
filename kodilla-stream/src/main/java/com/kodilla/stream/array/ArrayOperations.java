package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static OptionalDouble getAverage(int [] numbers){
        IntStream.range(0,numbers.length)
                .forEach(i->System.out.println(numbers[i]));
        OptionalDouble average = IntStream.range(0,numbers.length)
                .map(i ->numbers[i])
                .average();
        return average;
    }
}
