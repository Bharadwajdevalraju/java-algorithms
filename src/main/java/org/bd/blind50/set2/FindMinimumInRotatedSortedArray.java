package org.bd.blind50.set2;

public class FindMinimumInRotatedSortedArray {

    public static int solve(int[] nums) {
        int l=0, r= nums.length-1;
        while (l<r) {
            int m = l+(r-l)/2;
            if (nums[m] > nums[r]) {
               l=m+1;
            } else {
                r=m;
            }
        }
        return nums[l];
    }

    //TC: 0(logn);
    //SC: 0(1)

}
