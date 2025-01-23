package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA105Test {

    private QA105 qa105;

    @BeforeEach
    public void setUp() {
        qa105 = new QA105();
    }

    @Test
    public void maxAreaOfIsland_EmptyGrid_ReturnsZero() {
        int[][] grid = {};
        assertEquals(0, qa105.maxAreaOfIsland(grid));
    }

    @Test
    public void maxAreaOfIsland_SingleLandCell_ReturnsOne() {
        int[][] grid = {{1}};
        assertEquals(1, qa105.maxAreaOfIsland(grid));
    }

    @Test
    public void maxAreaOfIsland_SingleWaterCell_ReturnsZero() {
        int[][] grid = {{0}};
        assertEquals(0, qa105.maxAreaOfIsland(grid));
    }

    @Test
    public void maxAreaOfIsland_MultipleIslands_ReturnsMaxArea() {
        int[][] grid = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1}
        };
        assertEquals(4, qa105.maxAreaOfIsland(grid));
    }

    @Test
    public void maxAreaOfIsland_NoLand_ReturnsZero() {
        int[][] grid = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertEquals(0, qa105.maxAreaOfIsland(grid));
    }

    @Test
    public void maxAreaOfIsland_AllLand_ReturnsTotalArea() {
        int[][] grid = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        assertEquals(9, qa105.maxAreaOfIsland(grid));
    }

    @Test
    public void maxAreaOfIsland_AdjacentIslands_ReturnsMaxArea() {
        int[][] grid = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 1, 1},
            {0, 0, 0, 1, 1}
        };
        assertEquals(4, qa105.maxAreaOfIsland(grid));
    }
}
