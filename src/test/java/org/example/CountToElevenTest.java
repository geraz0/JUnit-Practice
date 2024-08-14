package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountToElevenTest {

    private CountToEleven countToEleven;

    @BeforeEach
    void setUp() {
        countToEleven = new CountToEleven();
    }

    @Test
    void testCountToEleven_StartAt5() {
        List<Integer> expected = Arrays.asList(5, 6, 7, 8, 9, 10, 11);
        assertEquals(expected, countToEleven.countToEleven(5));
    }

    @Test
    void testCountToEleven_StartAt10() {
        List<Integer> expected = Arrays.asList(10, 11);
        assertEquals(expected, countToEleven.countToEleven(10));
    }

    @Test
    void testCountToEleven_StartAt11() {
        List<Integer> expected = Arrays.asList(11);
        assertEquals(expected, countToEleven.countToEleven(11));
    }

    @Test
    void testCountToEleven_StartAbove11() {
        List<Integer> expected = Arrays.asList(); // Empty list since input is invalid
        assertEquals(expected, countToEleven.countToEleven(12));
    }
}
