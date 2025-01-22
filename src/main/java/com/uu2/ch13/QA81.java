package com.uu2.ch13;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class QA81 {
    /**
     * 允许重复选择元素的组合
     */
    public List<List<Integer>> combine(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
        dfs(nums, target, 0, path, res);
        Collections.reverse(res);
        return res;
    }

    private void dfs(int[] nums, int target, int i, LinkedList<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new LinkedList<>(path));
            return;
        }
        if (target > 0 && i < nums.length) {
            dfs(nums, target, i + 1, path, res);
            path.add(nums[i]);
            dfs(nums, target - nums[i], i, path, res);
            path.removeLast();
        }
    }


}
