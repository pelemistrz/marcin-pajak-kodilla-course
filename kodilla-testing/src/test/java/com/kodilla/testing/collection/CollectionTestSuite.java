package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Begin: Testing method exterminate from OddNumbersExterminator");
    }

    @AfterEach
    public void after() {
        System.out.println("End: Testing method exterminate from OddNumbersExterminator");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("Check if method return empty array when we provide empty array"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        boolean isEmpty = result.isEmpty();

        //Then
        Assertions.assertTrue(isEmpty);
    }

    @DisplayName("when we put numbers , " +
            "then we should return only even"
    )
    @Test
    void testCaseEvenNumbersExpected() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        Integer[] expectedResult = {2,4,6};

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assertions.assertArrayEquals(expectedResult, result.toArray());
    }

    @DisplayName("when we put numbers , " +
            "then we should return only even using Arrays.asList()"
    )
    @Test
    void testCaseEvenNumbersExpectedArrayAsList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        Integer[] a = {2,4,6};
        List<Integer> expectedResult = Arrays.asList(a);

        //Then
        Assertions.assertIterableEquals(expectedResult, result);
    }
}