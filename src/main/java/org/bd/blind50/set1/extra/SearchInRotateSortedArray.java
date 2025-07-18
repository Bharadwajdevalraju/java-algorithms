package org.bd.blind50.set1.extra;

public class SearchInRotateSortedArray {

    public boolean search(int[] nums, int t) {
        int i=0, j=nums.length-1;
        while (i<=j) {
            int m = i+(j-i)/2;
            if (nums[m] == t) {
                return true;
            }
            if (nums[i] < nums[m]) {
              if (nums[i]<=t && t<nums[m]) {
                 j=m-1;
              }else {
                  i=m+1;
              }
            } else {
                if(nums[m]<t && t<=nums[j]){
                    i=m+1;
                }else {
                    j=m-1;
                }
            }
        }
        return false;
    }
}
