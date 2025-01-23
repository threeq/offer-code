package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QA107Test {

    private QA107 qa107;

    @BeforeEach
    public void setUp() {
        qa107 = new QA107();
    }

    @Test
    public void updateMatrix_NullInput_ReturnsNull() {
        int[][] matrix = null;
        int[][] result = qa107.updateMatrix(matrix);
        assertArrayEquals(null, result);
    }

    @Test
    public void updateMatrix_EmptyMatrix_ReturnsEmptyMatrix() {
        int[][] matrix = new int[0][0];
        int[][] result = qa107.updateMatrix(matrix);
        assertArrayEquals(new int[0][0], result);
    }

    @Test
    public void updateMatrix_SingleZero_ReturnsZero() {
        int[][] matrix = {{0}};
        int[][] expected = {{0}};
        int[][] result = qa107.updateMatrix(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void updateMatrix_SingleOne_ReturnsOne() {
        int[][] matrix = {{1}};
        int[][] expected = {{Integer.MAX_VALUE}};
        int[][] result = qa107.updateMatrix(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void updateMatrix_AllZeros_ReturnsAllZeros() {
        int[][] matrix = {{0, 0}, {0, 0}};
        int[][] expected = {{0, 0}, {0, 0}};
        int[][] result = qa107.updateMatrix(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void updateMatrix_AllOnes_ReturnsCorrectDistances() {
        int[][] matrix = {{1, 1}, {1, 1}};
        int[][] expected = {{Integer.MAX_VALUE, Integer.MAX_VALUE}, {Integer.MAX_VALUE, Integer.MAX_VALUE}};
        int[][] result = qa107.updateMatrix(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void updateMatrix_MixedMatrix_ReturnsCorrectDistances() {
        int[][] matrix = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] expected = {{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};
        int[][] result = qa107.updateMatrix(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void updateMatrix_EdgeCase_ReturnsCorrectDistances() {
        int[][] matrix = {{1, 0, 1, 1, 0, 0, 1, 0, 0, 1}, {0, 1, 1, 0, 1, 0, 1, 0, 1, 1}, {0, 0, 1, 0, 1, 0, 0, 1, 0, 0}, {1, 0, 1, 0, 1, 1, 1, 1, 1, 1}, {0, 1, 0, 1, 1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 1, 0, 0, 0, 1, 0}, {1, 0, 0, 1, 0, 0, 1, 0, 0, 1}, {1, 0, 0, 0, 1, 0, 1, 0, 1, 0}, {1, 1, 1, 0, 1, 0, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 0, 1, 0, 1, 0}};
        int[][] expected = {{1, 0, 1, 1, 0, 0, 1, 0, 0, 1}, {0, 1, 1, 0, 1, 0, 1, 0, 1, 1}, {0, 0, 1, 0, 1, 0, 0, 1, 0, 0}, {1, 0, 1, 0, 1, 1, 1, 1, 1, 1}, {0, 1, 0, 1, 1, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 1, 0, 0, 0, 1, 0}, {1, 0, 0, 1, 0, 0, 1, 0, 0, 1}, {1, 0, 0, 0, 1, 0, 1, 0, 1, 0}, {1, 1, 1, 0, 1, 0, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 0, 1, 0, 1, 0}};
        int[][] result = qa107.updateMatrix(matrix);
        assertArrayEquals(expected, result);
    }
}
