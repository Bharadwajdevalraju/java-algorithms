package org.bd.blind50.set1;

import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static List<Integer> solve(int[] nums, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            var num=nums[i];
            if (map.containsKey(sum - num)) {
                return List.of(i, map.get(sum-num));
            }
            map.put(num,i);
        }
        return List.of();
    }

}
