package com.uu2.book1.ch14;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.uu2.book1.ch14.QA100;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA100Test {

    private QA100 qa100;

    @BeforeEach
    public void setUp() {
        qa100 = new QA100();
    }

    @Test
    public void minPathSum_NullInput_ReturnsZero() {
        assertEquals(0, qa100.minPathSum(null));
    }

    @Test
    public void minPathSum_EmptyInput_ReturnsZero() {
        assertEquals(0, qa100.minPathSum(new int[0][0]));
    }

    @Test
    public void minPathSum_SingleRow_ReturnsSumOfRow() {
        int[][] grid = {{1, 2, 3}};
        assertEquals(1, qa100.minPathSum(grid));
    }

    @Test
    public void minPathSum_SingleColumn_ReturnsSumOfColumn() {
        int[][] grid = {{1}, {2}, {3}};
        assertEquals(6, qa100.minPathSum(grid));
    }

    @Test
    public void minPathSum_StandardTriangle_ReturnsCorrectSum() {
        int[][] grid = {
                {2},
                {3, 4},
                {6, 5, 7},
                {4, 1, 8, 3}
        };
        assertEquals(11, qa100.minPathSum(grid));
    }

    @Test
    public void minPathSum_NegativeValues_ReturnsCorrectSum() {
        int[][] grid = {
                {-1},
                {-2, -3},
                {-4, -5, -6},
                {-7, -8, -9, -10}
        };
        assertEquals(-20, qa100.minPathSum(grid));
    }

    @Test
    public void minPathSum_LargeValues_ReturnsCorrectSum() {
        int[][] grid = {
                {100000},
                {200000, 300000},
                {400000, 500000, 600000},
                {700000, 800000, 900000, 1000000}
        };
        assertEquals(1400000, qa100.minPathSum(grid));
    }

    @Test
    public void minPathSum2_NullInput_ReturnsZero() {
        assertEquals(0, qa100.minPathSum2(null));
    }

    @Test
    public void minPathSum2_EmptyInput_ReturnsZero() {
        assertEquals(0, qa100.minPathSum2(new int[0][0]));
    }

    @Test
    public void minPathSum2_SingleRow_ReturnsMinValue() {
        int[][] grid = {{1, 2, 3}};
        assertEquals(1, qa100.minPathSum2(grid));
    }

    @Test
    public void minPathSum2_SingleColumn_ReturnsSumOfColumn() {
        int[][] grid = {{1}, {2}, {3}};
        assertEquals(6, qa100.minPathSum2(grid));
    }

    @Test
    public void minPathSum2_StandardTriangle_ReturnsCorrectSum() {
        int[][] grid = {
                {2},
                {3, 4},
                {6, 5, 7},
                {4, 1, 8, 3}
        };
        assertEquals(11, qa100.minPathSum2(grid));
    }

    @Test
    public void minPathSum2_NegativeValues_ReturnsCorrectSum() {
        int[][] grid = {
                {-1},
                {-2, -3},
                {-4, -5, -6},
                {-7, -8, -9, -10}
        };
        assertEquals(-20, qa100.minPathSum2(grid));
    }

    @Test
    public void minPathSum2_LargeValues_ReturnsCorrectSum() {
        int[][] grid = {
                {100000},
                {200000, 300000},
                {400000, 500000, 600000},
                {700000, 800000, 900000, 1000000}
        };
        assertEquals(1400000, qa100.minPathSum2(grid));
    }
}
