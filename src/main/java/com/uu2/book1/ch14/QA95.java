package com.uu2.book1.ch14;

public class QA95 {
    /**
     * 最长公共子序列
     */
    public int longestCommonSub(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[len1][len2];
    }

    public int longestCommonSub2(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 < len2) {
            return longestCommonSub2(s2, s1);
        }

        int[][] dp = new int[2][len2 + 1];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[(i + 1) % 2][j + 1] = dp[i % 2][j] + 1;
                } else {
                    dp[(i + 1) % 2][j + 1] = Math.max(dp[i % 2][j + 1], dp[(i + 1) % 2][j]);
                }
            }
        }
        return dp[len1 % 2][len2];
    }

    public int longestCommonSub3(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 < len2) {
            return longestCommonSub2(s2, s1);
        }

        int[] dp = new int[len2 + 1];
        for (int i = 0; i < len1; i++) {
            int prev = dp[0];
            for (int j = 0; j < len2; j++) {
                int curr;
                if (s1.charAt(i) == s2.charAt(j)) {
                    curr = prev + 1;
                } else {
                    curr = Math.max(dp[j + 1], dp[j]);
                }
                prev = dp[j + 1];
                dp[j + 1] = curr;
            }
        }
        return dp[len2];
    }
}
