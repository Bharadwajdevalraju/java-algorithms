package org.bd.blind50.set1;

public class ProductOfArrayExceptSelf {


    public static int[] solve(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        int suffix = 1;
        for (int i=n-1;i>=0;i--){
            prefix[i] *= suffix;
            suffix *= nums[i];
        }
        return prefix;
    }
    //TC: 0(n+n) : 0(n)
    //SC: 0(n)

}
