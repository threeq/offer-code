package com.uu2.book1.ch15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QA105 {
    /**
     * 最大的岛屿
     */
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int max = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int area = getAreaDepthFirst(grid, i, j, visited);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    private int getAreaBreadthFirst(int[][] grid, int i, int j, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        int area = 0;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            area++;
            for (int[] dir : dirs) {
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                if (x >= 0 && x < grid.length
                        && y >= 0 && y < grid[0].length
                        && grid[x][y] == 1 && !visited[x][y]) {
                    queue.offer(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }
        return area;
    }

    private int getAreaDepthFirst(int[][] grid, int i, int j, boolean[][] visited) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        visited[i][j] = true;

        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int area = 0;
        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            area++;
            for (int[] dir : dirs) {
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                if (x >= 0 && x < grid.length
                        && y >= 0 && y < grid[0].length
                        && grid[x][y] == 1 && !visited[x][y]) {
                    stack.push(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }
        return area;
    }

    /**
     * 递归实现
     */
    public int getAreaRecursive(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + getAreaRecursive(grid, i + 1, j, visited)
                + getAreaRecursive(grid, i - 1, j, visited)
                + getAreaRecursive(grid, i, j + 1, visited)
                + getAreaRecursive(grid, i, j - 1, visited);
    }
}
