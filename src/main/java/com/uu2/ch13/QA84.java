package com.uu2.ch13;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class QA84 {
    /**
     * 包含重复元素集合的全排列
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
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
        Set<Integer> set = new HashSet<>();
        for (int j = i; j < nums.length; j++) {
            if (set.contains(nums[j])) {
                continue;
            }
            set.add(nums[j]);
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
