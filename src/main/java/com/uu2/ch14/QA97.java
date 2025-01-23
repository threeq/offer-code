package com.uu2.ch14;

public class QA97 {
    /**
     * 自序列的数目
     */
    public int numDistinct(String S, String T) {
        int[][] dp = new int[S.length() + 1][T.length() + 1];
        dp[0][0] = 1;
        for (int i = 0; i < S.length(); i++) {
            dp[i + 1][0] = 1;
            for (int j = 0; j < T.length(); j++) {
                if (S.charAt(i) == T.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + dp[i][j + 1];
                } else {
                    dp[i + 1][j + 1] = dp[i][j + 1];
                }
            }
        }

        return dp[S.length()][T.length()];
    }

    public int numDistinct2(String S, String T) {
        if (S.isEmpty() && T.isEmpty()) {
            return 1;
        }
        int[] dp = new int[T.length() + 1];
        if (!S.isEmpty()) {
            dp[0] = 1;
        }
        for (int i = 0; i < S.length(); i++) {
            for (int j = Math.min(T.length() - 1, i); j >= 0; j--) {
                if (S.charAt(i) == T.charAt(j)) {
                    dp[j + 1] += dp[j];
                }
            }
        }

        return dp[T.length()];
    }
}
