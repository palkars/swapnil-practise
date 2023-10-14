package com.swapnil.search;

public class BinarySearch {

    public static int binarySearch(int[] array, int value) {
        int begIndex = 0, endIndex = array.length - 1;
        while(begIndex<= endIndex){
            int mid = begIndex + (endIndex-begIndex)/2;
            if(array[mid] == value) {
                return mid;
            } else if (array[mid] <value ) {
                begIndex = mid +1;
            } else {
                endIndex = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 7, 8, 9, 10, 13, 15};
        System.out.println(binarySearch(input, 6));
        System.out.println(binarySearch(input, 5));
    }
}
