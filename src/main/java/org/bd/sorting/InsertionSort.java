package org.bd.sorting;

public class InsertionSort implements Sort {

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                arr[j] = key;
                j--;
            }
        }
    }
}
