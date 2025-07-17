package org.bd.blind50.set1;

import java.util.*;

public class MergeIntervals {

    public static int[][] solve(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        List<int[]> merged = new LinkedList<>();
        merged.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            var cur = intervals[i];
            var prev = merged.getLast();
            if (cur[0] <= prev[1]) {
                prev[1] = Math.max(cur[1], prev[1]);
            } else {
                merged.add(cur);
            }
        }
        return merged.toArray(new int[][]{});
    }

    //TC: 0(nlogn);
    //SC: 0(n);
}
