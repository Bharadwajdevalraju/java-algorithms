package org.bd.blind50.set2;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingCharacter {

    public static int solve(String s) {
        if (s.length() <= 1) return s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    //TC: 0(n);
    //SC: 0(n);
}
