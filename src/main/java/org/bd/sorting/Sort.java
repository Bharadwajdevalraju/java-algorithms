package org.bd.sorting;

import java.util.Collections;

public interface Sort {

    void sort(int[] arr);

    default void print(int[] arr) {
        Collections.singletonList(arr).forEach(System.out::println);
    }

    default void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
