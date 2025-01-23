package com.uu2.book1.ch08;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class QA57 {
    /**
     * 值和下标之差都在给定的范围内
     */
    public static boolean containNearAlmostDup(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Long lower = set.floor((long) nums[i]);
            if (lower != null && lower >= (long) nums[i] - t) {
                return true;
            }
            Long higher = set.ceiling((long) nums[i]);
            if (higher != null && higher <= (long) nums[i] + t) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    public static boolean containNearAlmostDup2(int[] nums, int k, int t) {
        Map<Integer, Integer> bucket = new HashMap<>();

        int bucketSize = t + 1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int id = getBucketID(num, bucketSize);
            if (bucket.containsKey(id)
                    || (bucket.containsKey(id - 1) && num - bucket.get(id - 1) <= t)
                    || (bucket.containsKey(id + 1) && bucket.get(id + 1) - num <= t)) {
                return true;
            }
            bucket.put(id, num);
            if (i >= k) {
                bucket.remove(getBucketID(nums[i - k], bucketSize));
            }
        }
        return false;
    }

    private static int getBucketID(int num, int bucketSize) {
        return num < 0 ? (num + 1) / bucketSize - 1 : num / bucketSize;
    }
}
