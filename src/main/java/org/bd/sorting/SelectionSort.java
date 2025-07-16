package org.bd.sorting;

public class SelectionSort implements Sort {

    @Override
    public void sort(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
}
