package com.swapnil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    RotateArray rotateArray;
    @BeforeEach
    void setUp() {
        rotateArray = new RotateArray();
    }

    @Test
    void rotate() {
        int[] input = {1,2,3,4,5,6,7};
        int[] output = {5,6,7,1,2,3,4};
        rotateArray.rotate(input, 3);
        System.out.println(Arrays.asList(input));
        assertArrayEquals(output, input);
    }
}