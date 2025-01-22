package com.uu2.ch13;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class QA82 {
    /**
     * 包含重复元素集合的组合
     */
    public List<List<Integer>> combine(int[] nums, int target)
    {
        Arrays.sort(nums);

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
            dfs(nums, target, getNext(nums, i), path, res);

            path.addLast(nums[i]);
            dfs(nums, target - nums[i], i+1, path, res);
            path.removeLast();
        }
    }

    private int getNext(int[] nums, int i) {
        int next = i;
        while (next < nums.length && nums[next] == nums[i]) {
            next++;
        }
        return next;
    }
}
