package org.bd.blind50.set2;

public class ContainerWithMostWater {

    public static int solve(int[] height) {
        int left=0, right = height.length-1;
        int max = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right-left);
            max = Math.max(area, max);
            if(height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return max;
    }

    //TC: 0(n)
    //SC: 0(1)
}
