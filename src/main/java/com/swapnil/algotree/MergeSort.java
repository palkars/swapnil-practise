package com.swapnil.algotree;

public class MergeSort {

    private int[] aux_array;

    // Allocate space to auxiliary array which is to be used for merging the sorted elements
    MergeSort(int sz) {
        aux_array = new int[sz];
    }

    // Function to merge the sorted sub-arrays into a bigger array.
    //void Merge (int[] aux_array, int[] array, int low, int mid, int high) {
    void merge(int[] array, int low, int mid, int high) {

        int left_index = low;
        int right_index = mid+1;
        int aux_index = low;

        /* Merge elements from array[low : mid] and array[mid+1 : high]
                                      ^                     ^
                                      |                     |
                                  left_index         right_index */

        // Pick the smaller number between the left part and the right part
        while (left_index <= mid && right_index <= high) {
            if (array[left_index] <= array[right_index]) {
                aux_array[aux_index++] = array[left_index++];
            } else {
                aux_array[aux_index++] = array[right_index++];
            }
        }

        if (left_index <= mid) {
            // There are still some unpicked numbers in the left part
            for (int i = left_index; i <= mid; i++) {
                aux_array[aux_index++] = array[i];
            }
        } else {
            // There are still some unpicked numbers in the right part
            for (int i = right_index; i <= high; i++) {
                aux_array[aux_index++] = array[i];
            }
        }

        // Copy numbers from the sorted auxiliary array into the original array
        for (int i=low; i<=high; i++) {
            array[i] = aux_array[i];
        }
    }

    // MergeSort function splits each sub-array till only a single element is available in the sub-array
    // and then proceeds with the merge of the sub-arrays into a bigger auxiliary array.
    //void MergeSort (int[] aux_array, int[] array, int low, int high) {
    void mergeSort(int[] array, int low, int high) {

        int mid;
        if (low < high) {
            mid = (low + high)/2;
            mergeSort(array, low, mid); // Recursively splits the left half of the array
            mergeSort(array, mid + 1, high); // Recursively splits the right half of the array
            merge(array, low, mid, high); // Merge the left and the right half of the array keeping it sorted.
        }
    }

    public static void main (String[] args) {

        int[] array = {7, 3, 5, 2, 4, 1, 8, 6};
        //int[] aux_array = new int[array.length];

        System.out.print("Unsorted array: ");

        for (int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        MergeSort s = new MergeSort(array.length);
        s.mergeSort (array, 0, array.length-1);

        System.out.print("Sorted array using Merge-Sort: ");

        for (int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
    }
}
