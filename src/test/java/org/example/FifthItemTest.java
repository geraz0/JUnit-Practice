package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FifthItemTest {

    private FifthItem fifthItem;

    @BeforeEach
    void setUp() {
        fifthItem = new FifthItem();
    }

    @Test
    void testGetFifthItem_WithFiveItems() {
        List<String> inputs = Arrays.asList("one", "two", "three", "four", "five");
        String expected = "The fifth item in the list is: five";
        assertEquals(expected, fifthItem.getFifthItem(inputs));
    }

    @Test
    void testGetFifthItem_WithLessThanFiveItems() {
        List<String> inputs = Arrays.asList("one", "two", "three");
        String expected = "There were not enough items to reach the fifth one.";
        assertEquals(expected, fifthItem.getFifthItem(inputs));
    }

    @Test
    void testGetFifthItem_WithNoItems() {
        List<String> inputs = Collections.emptyList();
        String expected = "There were not enough items to reach the fifth one.";
        assertEquals(expected, fifthItem.getFifthItem(inputs));
    }
}
