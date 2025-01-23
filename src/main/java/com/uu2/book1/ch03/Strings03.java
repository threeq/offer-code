package com.uu2.book1.ch03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Strings03 {
    /**
     * 问题14: 字符串中的变位词
     * 题目：输入字符串s1和s2，如何判断字符串s2中是否包含字符串s1的某个变位词？如果字符串s2中包含字符串s1的某个变位词，
     * 则字符串s1至少有一个变位词是字符串s2的子字符串。假设两个字符串中只包含英文小写字母。例如，字符串s1为"ac"，
     * 字符串s2为"dgcaf"，由于字符串s2中包含字符串s1的变位词"ca"，因此输出为true。如果字符串s1为"ab"，字符串s2为"dgcaf"，
     * 则输出为false。
     */
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;
            counts[s2.charAt(i) - 'a']--;
        }
        if (allZero(counts)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            counts[s2.charAt(i) - 'a']--;
            counts[s2.charAt(i - s1.length()) - 'a']++;
            if (allZero(counts)) {
                return true;
            }
        }
        return false;
    }

    private boolean allZero(int[] counts) {
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 问题15：字符串中的所有变位词
     * 题目：输入字符串s1和s2，如何找出字符串s2的所有变位词在字符串s1中的起始下标？假设两个字符串中只包含英文小写字母。
     * 例如，字符串s1为"cbadabacg"，字符串s2为"abc"，字符串s2的两个变位词"cba"和"bac"是字符串s1中的子字符串，输
     * 出它们在字符串s1中的起始下标0和5。
     */
    public List<Integer> findAnagrams(String s1, String s2) {
        if (s2.length() > s1.length()) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int[] counts = new int[26];
        int i = 0;
        for (; i < s2.length(); i++) {
            counts[s2.charAt(i) - 'a']++;
            counts[s1.charAt(i) - 'a']--;
        }
        if (allZero(counts)) {
            result.add(0);
        }
        for (; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']--;
            counts[s1.charAt(i - s2.length()) - 'a']++;
            if (allZero(counts)) {
                result.add(i - s2.length() + 1);
            }
        }

        return result;
    }

    /**
     * 问题16：不含重复字符的最长子字符串
     * 题目：输入一个字符串，求该字符串中不含重复字符的最长子字符串的长度。
     * 例如，输入字符串"babcca"，其最长的不含重复字符的子字符串是"abc"，长度为3。
     */
    public int lengthOfLongestSubstring1(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int[] counts = new int[256];
        int result = 1;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
            while (hasGreaterThan1(counts)) {
                counts[s.charAt(j)]--;
                j++;
            }
            result = Math.max(result, i - j + 1);
        }

        return result;
    }

    private boolean hasGreaterThan1(int[] counts) {
        for (int count : counts) {
            if (count > 1) {
                return true;
            }
        }
        return false;
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int[] counts = new int[256];
        int result = 1;
        int j = 0;
        int countDup = 0;
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
            if (counts[s.charAt(i)] == 2) {
                countDup++;
            }
            while (countDup > 0) {
                counts[s.charAt(j)]--;
                j++;
                if (counts[s.charAt(j)] == 1) {
                    countDup--;
                }
            }
            result = Math.max(result, i - j + 1);
        }

        return result;
    }

    /**
     * 问题17：countDup
     * 题目：输入两个字符串s和t，请找出字符串s中包含字符串t的所有字符的最短子字符串。
     * 例如，输入的字符串s为"ADDBANCAD"，字符串t为"ABC"，则字符串s中包含字符'A'、'B'和'C'的
     * 最短子字符串是"BANC"。如果不存在符合条件的子字符串，则返回空字符串""。如果存在多个符合条件
     * 的子字符串，则返回任意一个。
     */
    public String minWindow(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return "";
        }
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c : t.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        int count = charCounts.size();
        int start = 0;
        int end = 0;
        int minStart = 0;
        int minEnd = 0;
        int minLen = Integer.MAX_VALUE;
        while (end < s.length() || (count == 0 && end == s.length())) {
            if (count > 0) {
                char endCh = s.charAt(end);
                if (charCounts.containsKey(endCh)) {
                    charCounts.put(endCh, charCounts.get(endCh) - 1);
                    if (charCounts.get(endCh) == 0) {
                        count--;
                    }
                }
                end++;
            } else {
                if (end - start < minLen) {
                    minLen = end - start;
                    minStart = start;
                    minEnd = end;
                }
                char startCh = s.charAt(start);
                if (charCounts.containsKey(startCh)) {
                    charCounts.put(startCh, charCounts.get(startCh) + 1);
                    if (charCounts.get(startCh) == 1) {
                        count++;
                    }
                }

                start++;
            }
        }
        return minLen < Integer.MAX_VALUE
                ? s.substring(minStart, minEnd)
                : "";
    }

    /**
     * 问题18：有效的回文
     * 题目：给定一个字符串，请判断它是不是回文。假设只需要考虑字母和数字字符，并忽略大小写。
     * 例如，"Was it a cat I saw？"是一个回文字符串，而"race a car"不是回文字符串。
     */
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char startCh = s.charAt(start);
            char endCh = s.charAt(end);
            if (!Character.isLetterOrDigit(startCh)) {
                start++;
            } else if (!Character.isLetterOrDigit(endCh)) {
                end--;
            } else {
                if (Character.toLowerCase(startCh) != Character.toLowerCase(endCh)) {
                    return false;
                } else {
                    start++;
                    end--;
                }
            }
        }
        return true;
    }

    /**
     * 问题19：最多删除一个字符得到回文
     * 题目：给定一个字符串，请判断如果最多从字符串中删除一个字符能不能得到一个回文字符串。
     * 例如，如果输入字符串"abca"，由于删除字符'b'或'c'就能得到一个回文字符串，因此输出为true
     */
    public boolean validPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        for (; start < s.length() / 2; start++, end--) {
            char startCh = s.charAt(start);
            char endCh = s.charAt(end);
            if (startCh != endCh) {
                break;
            }
        }
        return start == s.length() / 2
                || isPalindrome(s.substring(start + 1, end + 1))
                || isPalindrome(s.substring(start, end));
    }

    /**
     * 问题20：回文子字符串的个数
     */
    public int countSubstrings(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += countPalindrome(s, i, i);
            result += countPalindrome(s, i, i + 1);
        }
        return result;
    }

    private int countPalindrome(String s, int start, int end) {
        int count = 0;
        while (start >= 0 && end < s.length()
                && s.charAt(start) == s.charAt(end)) {
            count++;
            start--;
            end++;
        }
        return count;
    }
}
