package com.swapnil.sort;

public class SwapnilMergeSort {
    public void mergeSort(int array[], int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private void merge(int[] array, int low, int mid, int high) {

        int leftIndex = low;
        int rightIndex = mid + 1;
        int auxIndex = low;
        int[] auxArray = new int[array.length];
        while (leftIndex <= mid && rightIndex <= high) {
            if (array[leftIndex] < array[rightIndex]) {
                auxArray[auxIndex++] = array[leftIndex++];
            } else {
                auxArray[auxIndex++] = array[rightIndex++];
            }
        }
        while (leftIndex <= mid) {
            auxArray[auxIndex++] = array[leftIndex++];
        }
        while (rightIndex <= high) {
            auxArray[auxIndex++] = array[rightIndex++];
        }
        for (int i = low; i <= high; i++) {
            array[i] = auxArray[i];
        }
    }

    public static void main(String[] args) {
        int[] input = {5,4,3,2,1,9,8,7,6};
        SwapnilMergeSort sort = new SwapnilMergeSort();
        sort.mergeSort(input, 0, input.length -1);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
