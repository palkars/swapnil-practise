package com.swapnil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringGenerator2Test {

    ReverseStringGenerator reverseStringGenerator;

    @BeforeEach
    void setUp() {
        reverseStringGenerator = new ReverseStringGenerator();
    }

    @ParameterizedTest
    @CsvSource({"abc,cba", "ab,ba",","})
    void reverse(String input, String expectedOutput) {

        assertEquals(expectedOutput, reverseStringGenerator.reverse(input));
    }
}