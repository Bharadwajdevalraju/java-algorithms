package org.bd.blind50.set3;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {

    public static int solve(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));
        int end = intervals[0][1];
        int c = 0;
        for (int i = 1; i < intervals.length; i++) {
            var cur = intervals[i];
            if (cur[0] < end) {
                c++;
            } else {
                end = cur[1];
            }
        }
        return c;
    }

}
