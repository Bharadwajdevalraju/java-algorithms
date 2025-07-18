package org.bd.blind50.set2;

import java.util.ArrayList;
import java.util.List;

public class PallindromicSubstrings {

    private static List<String> helper(String s, int start, int end) {
        List<String> result =new ArrayList<>();
        while (start >= 0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)) {
            result.add(s.substring(start--, ++end));
        }
        return result;
    }

    public static List<String> solve(String s){
        List<String> result = new ArrayList<>();
        for (int i=0;i<s.length();i++) {
            result.addAll(helper(s,i,i));
            result.addAll(helper(s,i, i+1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solve("abc"));
        System.out.println(solve("aaa"));
    }

    //TC: 0(n2)
    //SC: 0(1);

}
