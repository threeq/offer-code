package com.uu2.book1.ch05;

import java.util.*;

public class QA33 {
    /**
     * 变位词组
     */
    public List<List<String>> groupAnagrams1(String[] strs) {
        int[] hash = {2, 3, 4, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Map<Long, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            long wordHash = 1;
            for (char ch : s.toCharArray()) {
                wordHash *= hash[ch - 'a'];
            }
            groups.putIfAbsent(wordHash, new LinkedList<>());
            groups.get(wordHash).add(s);
        }
        return new LinkedList<>(groups.values());
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            groups.putIfAbsent(key, new LinkedList<>());
            groups.get(key).add(s);
        }
        return new LinkedList<>(groups.values());

    }
}
