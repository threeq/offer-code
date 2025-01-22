package com.uu2.ch12;

public class QA76 {
    /**
     * 数组中第k大的元素
     */
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int left = 0, right = len - 1;
        int target = len - k;
        while (left < right) {
            int mid = partition(nums, left, right);
            if (mid == target) {
                break;
            } else if (mid < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[target];
    }

    private int partition(int[] nums, int left, int right) {
        int random = left + (int) (Math.random() * (right - left + 1));
        swap(nums, random, right);
        int small = left - 1;
        for (int i = left; i < right; i++) {
            if(nums[i]<=nums[right]) {
                small++;
                swap(nums, small, i);
            }
        }
        small++;
        swap(nums, small, right);
        return small;
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
