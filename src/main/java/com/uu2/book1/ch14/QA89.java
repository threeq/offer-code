package com.uu2.book1.ch14;

import java.util.Arrays;

public class QA89 {
    /**
     * 房屋偷盗
     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        helper(nums, n - 1, dp);
        return dp[n - 1];
    }

    private void helper(int[] nums, int i, int[] dp) {
        if (i == 0) {
            dp[i] = nums[i];
        } else if (i == 1) {
            dp[i] = Math.max(nums[i], nums[i - 1]);
        } else if (dp[i] < 0) {
            helper(nums, i - 1, dp);
            helper(nums, i - 2, dp);
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
    }

    public int robOn(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        if (n > 1) {
            dp[1] = Math.max(nums[0], nums[1]);
        }
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }

    public int robO(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[]{nums[0], Math.max(nums[0], nums[1])};
        for (int i = 2; i < nums.length; i++) {
            dp[i % 2] = Math.max(dp[(i - 1) % 2], dp[(i - 2) % 2] + nums[i]);
        }
        return Math.max(dp[0], dp[1]);
    }


    public int rob2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        int[][] dp = new int[2][2];
        dp[0][0] = 0;
        dp[1][0] = nums[0];

        for (int i = 1; i < n; i++) {
            dp[0][i % 2] = Math.max(dp[0][(i - 1) % 2], dp[1][(i - 1) % 2]);
            dp[1][i % 2] = nums[i] + dp[0][(i - 1) % 2];
        }
        return Math.max(dp[0][(n - 1) % 2], dp[1][(n - 1) % 2]);
    }
}
