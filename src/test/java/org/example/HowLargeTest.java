package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowLargeTest {

    private HowLarge howLarge;

    @BeforeEach
    void setUp() {
        howLarge = new HowLarge();
    }

    @Test
    void testGetSize_WithMultipleItems() {
        List<String> inputs = Arrays.asList("one", "two", "three", "four");
        int expectedSize = 4;
        assertEquals(expectedSize, howLarge.getSize(inputs));
    }

    @Test
    void testGetSize_WithNoItems() {
        List<String> inputs = Collections.emptyList();
        int expectedSize = 0;
        assertEquals(expectedSize, howLarge.getSize(inputs));
    }

    @Test
    void testGetSize_WithSingleItem() {
        List<String> inputs = Collections.singletonList("one");
        int expectedSize = 1;
        assertEquals(expectedSize, howLarge.getSize(inputs));
    }
}
