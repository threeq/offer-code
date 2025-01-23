package com.uu2.ch14;

public class QA100 {
    /**
     * 三角形中最小路径之和
     */
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int len = 0;
        for (int[] row : grid) {
            len = Math.max(len, row.length);
        }

        int[][] dp = new int[grid.length][len];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                dp[i][j] = grid[i][j];
                if (i > 0 && j == 0) {
                    dp[i][j] += dp[i - 1][j];
                } else if (i > 0 && i == j) {
                    dp[i][j] += dp[i - 1][j - 1];
                } else if (i > 0) {
                    dp[i][j] += Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < grid[grid.length - 1].length; i++) {
            min = Math.min(min, dp[grid.length - 1][i]);
        }
        return min;
    }

    public int minPathSum2(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int len = 0;
        for (int[] row : grid) {
            len = Math.max(len, row.length);
        }
        int[] dp = new int[len];
        for (int[] row : grid) {
            for (int j = row.length - 1; j >= 0; j--) {
                if (j == 0) {
                    dp[j] = dp[j] + row[j];
                } else if (j == row.length - 1) {
                    dp[j] = dp[j - 1] + row[j];
                } else {
                    dp[j] = Math.min(dp[j], dp[j - 1]) + row[j];
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int num : dp) {
            min = Math.min(min, num);
        }
        return min;
    }
}
