package com.uu2.book1.ch15;

import java.util.*;

public class QA115 {
    /**
     * 重建序列
     */
    public boolean sequenceReconstruction(int[] org, List<List<Integer>> seqs) {
        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (List<Integer> seq : seqs) {
            for (int num : seq) {
                if (num < 1 || num > org.length) {
                    return false;
                }

                graph.putIfAbsent(num, new HashSet<>());
                inDegree.putIfAbsent(num, 0);
            }
            for (int i = 0; i < seq.size() - 1; i++) {
                int num1 = seq.get(i);
                int num2 = seq.get(i + 1);
                if (!graph.get(num1).contains(num2)) {
                    graph.get(num1).add(num2);
                    inDegree.put(num2, inDegree.get(num2) + 1);
                }
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int num : inDegree.keySet()) {
            if (inDegree.get(num) == 0) {
                queue.offer(num);
            }
        }

        List<Integer> build = new LinkedList<>();
        while (queue.size()==1) {
            int num = queue.poll();
            build.add(num);
            for (int next : graph.get(num)) {
                inDegree.put(next, inDegree.get(next) - 1);
                if (inDegree.get(next) == 0) {
                    queue.offer(next);
                }
            }
        }
        int[] result = build.stream().mapToInt(Integer::intValue).toArray();
        return Arrays.equals(result, org);
    }
}
