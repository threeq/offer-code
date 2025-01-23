package com.uu2.ch14;

public class QA102 {
    /**
     * 加减的目标值
     */
    public int findTargetSumWays(int[] nums, int s) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (s > sum || s < -sum || Math.abs((sum + s) % 2) == 1) {
            return 0;
        }

        int target = (sum + s) / 2;
        return subsetSum(nums, target);
    }

    private int subsetSum(int[] nums, int t) {
        int[] dp = new int[t + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int i = t; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }

        return dp[t];
    }
}
