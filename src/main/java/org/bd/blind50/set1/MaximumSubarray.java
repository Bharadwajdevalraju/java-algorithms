package org.bd.blind50.set1;

public class MaximumSubarray {

    public static int solve(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int num: nums) {
            sum += num;
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }
        return max;

        //TC: 0(n)
        //SC: 0(1)
    }
}
