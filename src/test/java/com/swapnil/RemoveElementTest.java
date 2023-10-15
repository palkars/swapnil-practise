package com.swapnil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    RemoveElement removeElement;
    @BeforeEach
    void setUp() {
        removeElement = new RemoveElement();
    }

    @Test
    void removeElement() {
        int[] input = {0,1,2,2,3,0,4,2};
        int[] expectedOutput = {0,1,3,0,4,Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        int removedCount = removeElement.removeElement(input, 2);
        assertEquals(5, removedCount);
        assertArrayEquals(expectedOutput, input);
    }
}