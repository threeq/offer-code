package com.uu2.book1.ch15;

import java.util.LinkedList;
import java.util.Queue;

public class QA107 {
    /**
     * 矩阵中的距离
     */
    public int[][] updateMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }
        int m = matrix.length, n = matrix[0].length;
        int[][] dist = new int[m][n];

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int d = dist[cur[0]][cur[1]];
            for (int[] dir : dirs) {
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                if (x >= 0 && x < m && y >= 0 && y < n && dist[x][y] > d + 1) {
                    dist[x][y] = d + 1;
                    queue.offer(new int[]{x, y});
                }
            }
        }
        return dist;
    }
}
