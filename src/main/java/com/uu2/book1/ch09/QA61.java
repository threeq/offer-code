package com.uu2.book1.ch09;

import java.util.*;

public class QA61 {
    /**
     * 和最小的K个数对
     */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] + b[1] - a[0] - a[1]);
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            for (int j = 0; j < Math.min(nums2.length, k); j++) {
                maxHeap.offer(new int[]{nums1[i], nums2[j]});
                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            int[] pair = maxHeap.poll();
            result.add(Arrays.asList(pair[0], pair[1]));
        }
        return result;
    }

    public List<List<Integer>> kSmallestPairs2(int[] nums1, int[] nums2, int k) {
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> nums1[a[0]] + nums2[a[1]] - nums1[b[0]] - nums2[b[1]]);

        if(nums2.length>0) {
            for (int i = 0; i < Math.min(nums1.length, k); i++) {
                minHeap.offer(new int[]{i, 0});
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        while (!minHeap.isEmpty() && k-- > 0) {
            int[] pair = minHeap.poll();
            result.add(Arrays.asList(nums1[pair[0]], nums2[pair[1]]));
            if (pair[1] + 1 < nums2.length) {
                minHeap.offer(new int[]{pair[0], pair[1] + 1});
            }
        }
        return result;
    }
}
