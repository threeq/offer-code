package com.uu2.book1.ch13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QA79 {
    /**
     * 所有子集
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length == 0){
            return result;
        }

        helper(nums, 0, new LinkedList<>(), result);
        return result;
    }

    private void helper(int[] nums, int i, LinkedList<Integer> subset, List<List<Integer>> result) {
        if(i==nums.length) {
            result.add(new LinkedList<>(subset));
        } else {
            helper(nums, i+1, subset, result);
            subset.add(nums[i]);
            helper(nums, i+1, subset, result);
            subset.removeLast();
        }
    }
}
