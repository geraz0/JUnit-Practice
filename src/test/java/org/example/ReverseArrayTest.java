package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseArrayTest {

    private ReverseArray reverseArray;

    @BeforeEach
    void setUp() {
        reverseArray = new ReverseArray();
    }

    @Test
    void testReverseArray_NormalCase() {
        int[] nums = {1, 2, 3};
        int[] expected = {3, 2, 1};
        assertArrayEquals(expected, reverseArray.reverse3(nums));
    }

    @Test
    void testReverseArray_DifferentValues() {
        int[] nums = {7, 8, 9};
        int[] expected = {9, 8, 7};
        assertArrayEquals(expected, reverseArray.reverse3(nums));
    }

    @Test
    void testReverseArray_SameValues() {
        int[] nums = {12, 13, 14};
        int[] expected = {14, 13, 12};
        assertArrayEquals(expected, reverseArray.reverse3(nums));
    }
}
