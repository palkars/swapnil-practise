package com.swapnil;

public class ReverseStringGenerator {
    public String reverse(String input) {
        if (input == null || "".equals(input.trim())) {
            return input;
        }
        int length = input.length();
        char[] reverseBytes = new char[length];
        for (int i = length-1; i >= 0; i--) {
            reverseBytes[i] = input.charAt(length -1 - i);
        }
        return new String(reverseBytes);
    }
}
