package com.uu2.book1.ch13;

import java.util.LinkedList;
import java.util.List;

public class QA83 {
    /**
     * 没有重复元素集合的全排列
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        dfs(nums, 0, res);
        return res;
    }

    private void dfs(int[] nums, int i, List<List<Integer>> res) {
        if (i == nums.length) {
            List<Integer> path = new LinkedList<>();
            for (int num : nums) {
                path.add(num);
            }
            res.add(path);
            return;
        }
        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            dfs(nums, i + 1, res);
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
