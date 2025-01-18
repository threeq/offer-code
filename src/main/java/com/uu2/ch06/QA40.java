package com.uu2.ch06;

public class QA40 {
    /**
     * 40. 矩阵中的最大矩形
     */
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int[] heights = new int[matrix[0].length];
        int maxArea = 0;
        QA39 qa39 = new QA39();
        for (char[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                heights[j] = row[j] == '0' ? 0 : heights[j] + 1;
            }
            maxArea = Math.max(maxArea, qa39.largestRectangleArea3(heights));
        }
        return maxArea;
    }

}
