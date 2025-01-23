package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA112Test {

    private QA112 qa112;

    @BeforeEach
    public void setUp() {
        qa112 = new QA112();
    }

    @Test
    public void longestIncreasingPath_NullMatrix_ReturnsZero() {
        int[][] matrix = null;
        int result = qa112.longestIncreasingPath(matrix);
        assertEquals(0, result);
    }

    @Test
    public void longestIncreasingPath_EmptyMatrix_ReturnsZero() {
        int[][] matrix = new int[0][0];
        int result = qa112.longestIncreasingPath(matrix);
        assertEquals(0, result);
    }

    @Test
    public void longestIncreasingPath_SingleElementMatrix_ReturnsOne() {
        int[][] matrix = {{1}};
        int result = qa112.longestIncreasingPath(matrix);
        assertEquals(1, result);
    }

    @Test
    public void longestIncreasingPath_NoIncreasingPath_ReturnsOne() {
        int[][] matrix = {{3, 3}, {3, 3}};
        int result = qa112.longestIncreasingPath(matrix);
        assertEquals(1, result);
    }

    @Test
    public void longestIncreasingPath_AllIncreasing_ReturnsMaxPath() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = qa112.longestIncreasingPath(matrix);
        assertEquals(5, result);
    }

    @Test
    public void longestIncreasingPath_MixedMatrix_ReturnsCorrectPath() {
        int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        int result = qa112.longestIncreasingPath(matrix);
        assertEquals(4, result);
    }

    @Test
    public void longestIncreasingPath_BoundaryConditions_ReturnsCorrectPath() {
        int[][] matrix = {{1, 2, 3}, {6, 5, 4}, {7, 8, 9}};
        int result = qa112.longestIncreasingPath(matrix);
        assertEquals(9, result);
    }
}
