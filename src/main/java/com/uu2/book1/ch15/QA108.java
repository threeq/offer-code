package com.uu2.book1.ch15;

import java.util.*;

/**
 * 单词演变
 */
public class QA108 {

    /**
     * 单项广度搜索
     *
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        Set<String> notVisited = new HashSet<>(wordList);
        int len = 1;
        queue1.offer(beginWord);
        while (!queue1.isEmpty()) {
            String word = queue1.poll();
            if (word.equals(endWord)) {
                return len;
            }
            List<String> neighbors = getNeighbors(word);
            for (String neighbor : neighbors) {
                if (notVisited.contains(neighbor)) {
                    queue2.offer(neighbor);
                    notVisited.remove(neighbor);
                }
            }
            if (queue1.isEmpty()) {
                queue1 = queue2;
                queue2 = new LinkedList<>();
                len++;
            }
        }
        return 0;
    }

    private List<String> getNeighbors(String word) {
        List<String> neighbors = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            char[] chars = word.toCharArray();
            for (char c = 'a'; c <= 'z'; c++) {
                chars[i] = c;
                String newWord = new String(chars);
                if (newWord.equals(word)) {
                    continue;
                }
                neighbors.add(newWord);
            }
        }
        return neighbors;
    }

    /**
     * 双向广度搜索
     */
    public int ladderLength2(String beginWord, String endWord, List<String> wordList) {
        Set<String> notVisited = new HashSet<>(wordList);
        if (!notVisited.contains(endWord)) {
            return 0;
        }

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add(beginWord);
        set2.add(endWord);
        notVisited.remove(endWord);

        int len = 2;
        while (!set1.isEmpty() && !set2.isEmpty()) {
            if (set1.size() > set2.size()) {
                Set<String> temp = set1;
                set1 = set2;
                set2 = temp;
            }
            Set<String> set3 = new HashSet<>();
            for (String word : set1) {
                List<String> neighbors = getNeighbors(word);
                for (String neighbor : neighbors) {
                    if (set2.contains(neighbor)) {
                        return len;
                    }
                    if (notVisited.contains(neighbor)) {
                        set3.add(neighbor);
                        notVisited.remove(neighbor);
                    }
                }
            }
            len++;
            set1 = set3;
        }
        return 0;
    }
}
