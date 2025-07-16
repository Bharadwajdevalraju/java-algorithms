package org.bd.sorting;

public class BubbleSort implements Sort {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            boolean swap = false;
            for(int j=0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
        
    }
}
