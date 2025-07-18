package org.bd.blind50.set2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MinimumWindowSubString {


    public static String solve(final String s, final String t) {
        var map = t.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        var map2 = new HashMap<Character, Integer>();
        int left = 0;
        int max = -1;
        int r1=0; int l1=0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }
            while (covers(map, map2)) {
                if (right - left + 1 < max) {
                    max = right-left+1;
                    r1=right+1;
                    l1=left;
                }
                char lc = s.charAt(left);
                if(map2.containsKey(lc)){
                    map2.put(lc, map2.get(lc)-1);
                }
                left++;
            }
        }
        return s.substring(l1, r1);
    }


    private static boolean covers(Map<Character, Long> m1, HashMap<Character, Integer> m2) {
        for(var entry: m1.entrySet()) {
            if(m2.get(entry.getKey()) > entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    //TC: 0(n2)
    //SC:0(n)
}
