package org.bd.blind50.set1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public HashMap<String, List<String>> solve(final List<String> inputs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String input: inputs) {
            char[] chars = input.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(input);
        }
        return map;
    }

    //SC: 0(n)
    //TC: 0(klogn)
}
