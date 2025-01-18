package com.uu2.ch05;

import java.util.HashMap;
import java.util.Map;

public class QA32 {
    /**
     * 有效的变位词
     */
    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            int count = counts[s2.charAt(i) - 'a'];
            if(count ==0) {
                return false;
            }
            counts[s2.charAt(i) - 'a']--;
        }

        return true;
    }

    public boolean isAnagramASCII(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();
        for (char ch: s1.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        for (char ch2 : s2.toCharArray()) {
            if (!counts.containsKey(ch2) || counts.get(ch2) == 0) {
                return false;
            }
            counts.put(ch2, counts.get(ch2) - 1);
        }

        return true;
    }
}
