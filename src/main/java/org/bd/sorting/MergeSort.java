package org.bd.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sort {

    @Override
    public void sort(int[] arr) {
        int i = 0, j = arr.length - 1;
        sort(arr, i, j);
    }

    private void sort(int[] arr, int i, int j) {
        if (i < j) {
            int mid = i + (j - i) / 2;
            sort(arr, i, mid);
            sort(arr, mid + 1, j);
            merge(arr, i, mid, j);
        }
    }

    private void merge(int[] arr, int start, int mid, int end) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = start; i <= mid; i++) {
            left.add(arr[i]);
        }
        for (int i = mid + 1; i <= end; i++) {
            right.add(arr[i]);
        }
        int index = start;
        int leftP = 0, rightP = 0;
        while (leftP <= left.size() && rightP <= right.size()) {
            if (left.get(leftP) < right.get(rightP)) {
                arr[index++] = left.get(leftP++);
            } else {
                arr[index++] = right.get(rightP++);
            }
        }

        while (leftP <= left.size()) {
            arr[index++] = left.get(leftP++);
        }

        while (rightP <= right.size()) {
            arr[index++] = right.get(rightP++);
        }

    }
}

