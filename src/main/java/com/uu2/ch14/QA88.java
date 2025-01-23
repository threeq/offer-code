package com.uu2.ch14;

public class QA88 {
    /**
     * 爬楼梯的最小成本
     */
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(helper(cost, n - 1), helper(cost, n - 2));
    }

    private int helper(int[] cost, int i) {
        if (i < 2) {
            return cost[Math.max(0, i)];
        }
        return Math.min(helper(cost, i - 2), helper(cost, i - 1)) + cost[i];
    }

    public int minCostClimbingStairsCache(int[] cost) {
        int n = cost.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return cost[0];
        }
        int[] dp = new int[n];
        helper(cost, n - 1, dp);
        helper(cost, n - 2, dp);
        return Math.min(dp[n - 2], dp[n - 1]);
    }

    private void helper(int[] cost, int i, int[] dp) {
        if (i < 2) {
            if (i >= 0) {
                dp[i] = 0;
            }
            dp[i] = cost[i];
            return;
        } if(dp[i] == 0) {
            helper(cost, i - 2, dp);
            helper(cost, i - 1, dp);
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
        }
    }

    public int minCostClimbingStairsWhileOn(int[] cost) {
        int n = cost.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return cost[0];
        }
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
        }
        return Math.min(dp[n - 2], dp[n - 1]);
    }

    public int minCostClimbingStairsWhileO1(int[] cost) {
        int n = cost.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return cost[0];
        }
        int[] dp = new int[]{cost[0], cost[1]};
        for (int i = 2; i < cost.length; i++) {
            dp[i % 2] = Math.min(dp[(i - 2) % 2], dp[(i - 1) % 2]) + cost[i];
        }
        return Math.min(dp[0], dp[1]);
    }
}
