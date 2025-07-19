package org.bd.blind50.set2;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public static int solve(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0;
        int max =0;
        int maxCount =0;
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);
            if(map.get(c)>maxCount) {
                maxCount = map.get(c);
            }
            while((right-left+1)-maxCount > k){
                char leftC = s.charAt(left);
                map.put(leftC, map.get(leftC)-1);
                left++;
            }
            max= Math.max(max, right-left+1);
        }
        return max;
    }
}
