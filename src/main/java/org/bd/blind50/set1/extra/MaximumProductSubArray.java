package org.bd.blind50.set1.extra;

public class MaximumProductSubArray {

    public int solve(int[] nums) {
        int min=1, max=1;
        int res = nums[0];
        for(int i=0;i<nums.length;i++) {
            if (nums[i]==0) { // reset
                min = 1;
                max = 1;
                res = Math.max(res, 0);
                continue;
            }
            int minH = nums[i] * min;
            int maxH = nums[i] * max;
            min = Math.min(nums[i], Math.min(minH, maxH));
            max = Math.max(nums[i], Math.max(minH, maxH));
            res = Math.max(res, max);

        }
        return res;
    }

}
