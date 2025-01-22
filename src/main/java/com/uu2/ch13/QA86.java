package com.uu2.ch13;

import java.util.LinkedList;
import java.util.List;

public class QA86 {
    /**
     * 分割会问字符串
     */
    public List<List<String>> partition(String s)
    {
        List<List<String>> result = new LinkedList<>();
        if (s.isEmpty()) {
            return result;
        }
        helper(0, s, new LinkedList<>(), result);
        return result;
    }

    private void helper(int start, String s, LinkedList<String> substrings, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new LinkedList<>(substrings));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                String sub = s.substring(start, i + 1);
                substrings.add(sub);
                helper(i + 1, s, substrings, result);
                substrings.removeLast();
            }
        }

    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
