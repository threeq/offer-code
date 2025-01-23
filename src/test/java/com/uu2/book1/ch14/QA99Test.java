package com.uu2.book1.ch14;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.uu2.book1.ch14.QA99;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA99Test {

    private QA99 qa99;

    @BeforeEach
    public void setUp() {
        qa99 = new QA99();
    }

    @Test
    public void minPathSum_SingleCellGrid_ReturnsCell() {
        int[][] grid = {{1}};
        assertEquals(1, qa99.minPathSum(grid));
    }

    @Test
    public void minPathSum_SingleRowGrid_ReturnsSumOfRow() {
        int[][] grid = {{1, 2, 3}};
        assertEquals(6, qa99.minPathSum(grid));
    }

    @Test
    public void minPathSum_SingleColumnGrid_ReturnsSumOfColumn() {
        int[][] grid = {{1}, {2}, {3}};
        assertEquals(6, qa99.minPathSum(grid));
    }

    @Test
    public void minPathSum_MultipleRowsAndColumns_ReturnsMinPathSum() {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        assertEquals(7, qa99.minPathSum(grid));
    }

    @Test
    public void minPathSum_EmptyGrid_ReturnsZero() {
        int[][] grid = {};
        assertEquals(0, qa99.minPathSum(grid));
    }

    @Test
    public void minPathSum_NullGrid_ReturnsZero() {
        int[][] grid = null;
        assertEquals(0, qa99.minPathSum(grid));
    }

    @Test
    public void minPathSum2_SingleCellGrid_ReturnsCell() {
        int[][] grid = {{1}};
        assertEquals(1, qa99.minPathSum2(grid));
    }

    @Test
    public void minPathSum2_SingleRowGrid_ReturnsSumOfRow() {
        int[][] grid = {{1, 2, 3}};
        assertEquals(6, qa99.minPathSum2(grid));
    }

    @Test
    public void minPathSum2_SingleColumnGrid_ReturnsSumOfColumn() {
        int[][] grid = {{1}, {2}, {3}};
        assertEquals(6, qa99.minPathSum2(grid));
    }

    @Test
    public void minPathSum2_MultipleRowsAndColumns_ReturnsMinPathSum() {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        assertEquals(7, qa99.minPathSum2(grid));
    }

    @Test
    public void minPathSum2_EmptyGrid_ReturnsZero() {
        int[][] grid = {};
        assertEquals(0, qa99.minPathSum2(grid));
    }

    @Test
    public void minPathSum2_NullGrid_ReturnsZero() {
        int[][] grid = null;
        assertEquals(0, qa99.minPathSum2(grid));
    }
}
