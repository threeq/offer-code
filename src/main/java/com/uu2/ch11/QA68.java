package com.uu2.ch11;

public class QA68 {
    /**
     * 查找插入的位置
     */
    public int findInsertPos(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] >= target) {
                if(mid==0 || nums[mid - 1] < target) {
                    return mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return nums.length;
    }
}
