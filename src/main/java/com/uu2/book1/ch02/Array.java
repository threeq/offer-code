package com.uu2.book1.ch02;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Array {

    // 题6
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j && nums[i] + nums[j] != target) {
            if (nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{i, j};
    }

    // 题7
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length >= 3) {
            java.util.Arrays.sort(nums);
            int i = 0;
            while (i < nums.length - 2) {
                twoSum(nums, i, result);
                int temp = nums[i];
                while (i < nums.length && nums[i] == temp) {
                    i++;
                }
            }
        }
        return result;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> result) {
        int j = i + 1;
        int k = nums.length - 1;
        while (j < k) {
            if (nums[i] + nums[j] + nums[k] == 0) {
                result.add(new LinkedList<>(java.util.Arrays.asList(nums[i], nums[j], nums[k])));
                int temp = nums[j];
                while (j < k && nums[j] == temp) {
                    j++;
                }
            } else if (nums[i] + nums[j] + nums[k] < 0) {
                j++;
            } else {
                k--;
            }
        }
    }

    /* 题8
    题目：输入一个正整数组成的数组和一个正整数k，请问数组中和大于或等于k的连续子数组的最短长度是多少？
    如果不存在所有数字之和大于或等于k的子数组，则返回0。例如，输入数组[5，1，4，3]，k的值为7，和大于或等
    于7的最短连续子数组是[4，3]，因此输出它的长度2。
    */
    public int minSubArrayLen(int[] nums, int k) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= k && left <= right) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    /* 题9
    题目：输入一个由正整数组成的数组和一个正整数k，请问数组中有多少个数字乘积小于k的连续子数组？
    例如，输入数组[10，5，2，6]，k的值为100，有8个子数组的所有数字的乘积小于100，它们分
    别是[10]、[5]、[2]、[6]、[10，5]、[5，2]、[2，6]和[5，2，6]。
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int result = 0;
        int left = 0;
        int product = 1;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k && left <= right) {
                product /= nums[left++];
            }
            result += right >= left ? right - left + 1 : 0;
        }
        return result;
    }

    /* 问题10：和为k的子数组
    题目：输入一个整数数组和一个整数k，请问数组中有多少个数字之和等于k的连续子数组？
    例如，输入数组[1，1，1]，k的值为2，有2个连续子数组之和等于2。
     */
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumToCount = new HashMap<>();
        sumToCount.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            count += sumToCount.getOrDefault(sum - k, 0);
            sumToCount.put(sum, sumToCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    /* 问题11: 0和1个数相同的子数组
    题目：输入一个只包含0和1的数组，请问如何求0和1的个数相同的最长连续子数组的长度？例如，
    在数组[0，1，0]中有两个子数组包含相同个数的0和1，分别是[0，1]和[1，0]，它们的长度都是2，因此输出2。
     */
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> maxLengthCount = new HashMap<>();
        maxLengthCount.put(0, -1);
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (maxLengthCount.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - maxLengthCount.get(sum));
            } else {
                maxLengthCount.put(sum, i);
            }
        }

        return maxLength;
    }

    /* 问题12：左右两边子数组的和相等
    题目：输入一个整数数组，如果一个数字左边的子数组的数字之和等于右边的子数组的数字之和，那么返回该数字的下标。
    如果存在多个这样的数字，则返回最左边一个数字的下标。如果不存在这样的数字，则返回-1。例如，
    在数组[1，7，3，6，2，9]中，下标为3的数字（值为6）的左边3个数字1、7、3的和与右边两个数字2和9的和相等，
    都是11，因此正确的输出值是3。
     */
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum - nums[i] == total - sum) {
                return i;
            }
        }
        return -1;
    }

}
