package org.bd.blind50.set1;

public class ValidAnagram {

    public static boolean solve(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++;
            hash[t.charAt(i)-'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (hash[i] != 0) return false;
        }
        return true;
    }
}
