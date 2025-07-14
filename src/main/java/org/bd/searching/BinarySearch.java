package org.bd.searching;

import java.util.NoSuchElementException;

public class BinarySearch {

    public static int search(int[] arr, int target) throws NoSuchElementException {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        throw new NoSuchElementException("Element %s not found".formatted(target));
    }
}
