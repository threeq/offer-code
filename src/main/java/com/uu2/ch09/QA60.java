package com.uu2.ch09;

import java.util.*;

public class QA60 {
    /**
     * 出现频率最高的K个元素
     */
    public List<Integer> topK(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        Queue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            res.add(minHeap.poll().getKey());
        }
        return res;
    }
}
