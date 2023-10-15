package com.swapnil;

public class NumberReversal {
    ReverseStringGenerator reverseStringGenerator = new ReverseStringGenerator();
    public int reverse(int input) {
        return Integer.parseInt(reverseStringGenerator.reverse(input+""));
    }
}
