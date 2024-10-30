package com.kodilla.tobinary;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {
    @Test
    void decimalToBinary() {
        assertEquals("1010", DecimalToBinary.decimalToBinary(10));
        assertEquals("110010", DecimalToBinary.decimalToBinary(50));
        assertEquals("11111010", DecimalToBinary.decimalToBinary(250));
        assertEquals("0", DecimalToBinary.decimalToBinary(0));

    }
}