package com.uu2.ch14;

public class QA92 {
    /**
     * 翻转字符
     */
    public int minFlips(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int[][] dp = new int[2][2];
        char ch = s.charAt(0);
        dp[0][0] = ch == '0' ? 0 : 1;
        dp[1][0] = ch == '1' ? 0 : 1;

        for (int i = 1; i < len; i++) {
            ch = s.charAt(i);
            int prev0 = dp[0][(i - 1) % 2];
            int prev1 = dp[1][(i - 1) % 2];
            dp[0][i % 2] = ch == '0' ? prev0 : prev0 + 1;
            dp[1][i % 2] = Math.min(prev0, prev1) + (ch == '1' ? 0 : 1);
        }

        return Math.min(dp[0][(len - 1) % 2], dp[1][(len - 1) % 2]);
    }
}
