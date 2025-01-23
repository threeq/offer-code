package com.uu2.book1.ch14;

public class QA91 {
    /**
     * 粉刷房子
     */
    public int minCost(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }
        int[][] dp = new int[3][2];
        for (int i = 0; i < 3; i++) {
            dp[i][0] = costs[0][i];
        }
        for (int i = 1; i < costs.length; i++) {
            for (int j = 0; j < 3; j++) {
                int prev1 = dp[(j + 1) % 3][(i - 1) % 2];
                int prev2 = dp[(j + 2) % 3][(i - 1) % 2];
                dp[j][i % 2] = Math.min(prev1, prev2) + costs[i][j];
            }
        }
        int last = (costs.length - 1) % 2;
        return Math.min(dp[0][last], Math.min(dp[1][last], dp[2][last]));
    }
}
