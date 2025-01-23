package com.uu2.book1.ch14;

import java.util.Arrays;

public class QA98 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return helper(m - 1, n - 1, dp);
    }

    private int helper(int i, int j, int[][] dp) {
        if (dp[i][j] == 0) {
            if (i == 0 || j == 0) {
                dp[i][j] = 1;
            } else {
                dp[i][j] = helper(i - 1, j, dp) + helper(i, j - 1, dp);
            }
        }

        return dp[i][j];
    }

    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[m][n];
        Arrays.fill(dp[0], 1);
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public int uniquePaths3(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
