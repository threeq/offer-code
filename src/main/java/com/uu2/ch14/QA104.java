package com.uu2.ch14;

public class QA104 {
    /**
     * 排列的数目
     */
    public int permutationSum(int[] nums, int t) {
        int[] dp = new int[t + 1];
        dp[0] = 1;

        for (int i = 1; i <= t; i++) {
            for (int num : nums) {
                if (i >= num) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[t];
    }
}
