package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveNumbersTest {

    private PositiveNumbers positiveNumbers;

    @BeforeEach
    void setUp() {
        positiveNumbers = new PositiveNumbers();
    }

    @Test
    void testPositiveNumber() {
        int input = 5;
        String expected = "Number is 5";
        assertEquals(expected, positiveNumbers.checkNumber(input));
    }

    @Test
    void testNegativeNumber() {
        int input = -5;
        String expected = "Number must be a positive number";
        assertEquals(expected, positiveNumbers.checkNumber(input));
    }

    @Test
    void testZero() {
        int input = 0;
        String expected = "Number is 0";
        assertEquals(expected, positiveNumbers.checkNumber(input));
    }
}
