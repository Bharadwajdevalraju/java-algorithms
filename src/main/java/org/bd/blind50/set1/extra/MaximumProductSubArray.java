package org.bd.blind50.set1.extra;

public class MaximumProductSubArray {

    public int solve(int[] nums) {
        int max =1, min=1;
        int result= 0;
        for(int i=0;i<nums.length;i++) {
            min = Math.min(min,nums[i] * min);
            max = Math.max(max, nums[i] * max);

        }
        return 0;
    }

}
