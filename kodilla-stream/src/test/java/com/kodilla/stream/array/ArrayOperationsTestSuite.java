package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        int[] numbers = {1,43,13,25,16,6,7,3,12,9};

        assertEquals(13.5, ArrayOperations.getAverage(numbers), 0);
    }
}
