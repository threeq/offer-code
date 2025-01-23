package com.uu2.ch14;

public class QA101 {
    /**
     * 分割等和子集
     */
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        return subsetSum(nums, sum / 2);
    }

    private boolean subsetSum(int[] nums, int target) {
        Boolean[][] dp = new Boolean[nums.length + 1][target + 1];
        return helper(nums, dp, nums.length, target);
    }

    private boolean helper(int[] nums, Boolean[][] dp, int i, int j) {
        if (dp[i][j] == null) {
            if (j == 0) {
                dp[i][j] = true;
            } else if (i == 0) {
                dp[i][j] = false;
            } else {
                dp[i][j] = helper(nums, dp, i - 1, j);
                if (!dp[i][j] && nums[i - 1] <= j) {
                    dp[i][j] = helper(nums, dp, i - 1, j - nums[i - 1]);
                }
            }
        }
        return dp[i][j];
    }

    public boolean canPartition2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }

        int target = sum / 2;

        boolean[][] dp = new boolean[nums.length + 1][target + 1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (nums[i - 1] <= j && !dp[i][j]) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[nums.length][target];
    }

    public boolean canPartition3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }

        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = target; j >= nums[i - 1]; j--) {
                dp[j] = dp[j - nums[i - 1]];
            }
        }

        return dp[target];

    }
}
