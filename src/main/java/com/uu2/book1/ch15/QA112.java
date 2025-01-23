package com.uu2.book1.ch15;

public class QA112 {
    /**
     * 最长递增路径
     */
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int[][] lengths = new int[matrix.length][matrix[0].length];
        int maxLength = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxLength = Math.max(maxLength, getLength(matrix, lengths, i, j));
            }
        }
        return maxLength;
    }

    private int getLength(int[][] matrix, int[][] lengths, int i, int j) {
        if (lengths[i][j] != 0) {
            return lengths[i][j];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int length = 1;
        for (int[] dir : dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if (newI >= 0 && newI < rows && newJ >= 0 && newJ < cols && matrix[newI][newJ] > matrix[i][j]) {
                length = Math.max(length, getLength(matrix, lengths, newI, newJ) + 1);
            }
        }
        lengths[i][j] = length;
        return length;
    }
}
