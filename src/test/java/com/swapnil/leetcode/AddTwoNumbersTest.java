package com.swapnil.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    AddTwoNumbers twoNumbers;
    @BeforeEach
    void setUp() {
        twoNumbers = new AddTwoNumbers();
    }

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expectedResult = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode result = twoNumbers.addTwoNumbers(l1, l2);
        assertEquals(expectedResult, result);
    }
}