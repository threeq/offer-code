package com.uu2.book1.ch15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QA106 {
    /**
     * 二分图
     */
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        Arrays.fill(colors, -1);
        for (int i = 0; i < n; i++) {
            if (colors[i] == -1) {
                if (!setColor(graph, colors, i, 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean setColor(int[][] graph, int[] colors, int i, int color) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        colors[i] = color;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int next : graph[cur]) {
                if (colors[next] == -1) {
                    queue.offer(next);
                    colors[next] = 1 - colors[cur];
                } else if (colors[next] == colors[cur]) {
                    return false;
                }
            }
        }
        return true;
    }
}
