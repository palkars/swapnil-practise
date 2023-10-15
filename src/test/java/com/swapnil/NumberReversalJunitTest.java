package com.swapnil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberReversalJunitTest {
    NumberReversal numberReversal;

    @BeforeEach
    void setUp() {
        numberReversal = new NumberReversal();
    }

    @Test
    void reverse() {
        assertEquals(123, numberReversal.reverse(321));
        assertEquals(456, numberReversal.reverse(654));
        assertEquals(12345678, numberReversal.reverse(87654321));
    }
}