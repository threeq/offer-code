package com.uu2.ch01;

public class Strings01 {
    // 题5
    public int maxProduct1(String[] words){
        boolean[][] flag = new boolean[words.length][26];
        for (int i = 0; i < words.length; i++) {
            for(char c : words[i].toCharArray()) {
                flag[i][c - 'a'] = true;
            }
        }
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                boolean isIntersect = false;
                for (int k = 0; k < 26; k++) {
                    if (flag[i][k] && flag[j][k]) {
                        isIntersect = true;
                        break;
                    }
                }
                if (!isIntersect) {
                    int prod = words[i].length() * words[j].length();
                    result = Math.max(result, prod);
                }
            }
        }
        return result;
    }

    public int maxProduct(String[] words){
        int[] mask = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                mask[i] |= 1 << (c - 'a');
            }
        }
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length;j++) {
                if ((mask[i] & mask[j]) == 0) {
                    result = Math.max(result, words[i].length() * words[j].length());
                }
            }
        }
        return result;
    }
}
