package com.uu2.ch14;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA91Test {

    private QA91 qa91;

    @BeforeEach
    public void setUp() {
        qa91 = new QA91();
    }

    @Test
    public void minCost_NullInput_ReturnsZero() {
        assertEquals(0, qa91.minCost(null));
    }

    @Test
    public void minCost_EmptyInput_ReturnsZero() {
        assertEquals(0, qa91.minCost(new int[0][0]));
    }

    @Test
    public void minCost_SingleHouse_ReturnsMinimumCost() {
        int[][] costs = {{17, 2, 17}};
        assertEquals(2, qa91.minCost(costs));
    }

    @Test
    public void minCost_MultipleHouses_ReturnsMinimumCost() {
        int[][] costs = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
        assertEquals(10, qa91.minCost(costs));
    }

    @Test
    public void minCost_AllSameCosts_ReturnsMinimumCost() {
        int[][] costs = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
        assertEquals(30, qa91.minCost(costs));
    }

    @Test
    public void minCost_ZeroCosts_ReturnsZero() {
        int[][] costs = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertEquals(0, qa91.minCost(costs));
    }

    @Test
    public void minCost_MixedCosts_ReturnsMinimumCost() {
        int[][] costs = {{3, 5, 3}, {6, 17, 6}, {7, 13, 18}, {9, 10, 18}};
        assertEquals(26, qa91.minCost(costs));
    }
}
