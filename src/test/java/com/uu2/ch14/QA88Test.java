package com.uu2.ch14;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA88Test {

    private QA88 qa88;

    @BeforeEach
    public void setUp() {
        qa88 = new QA88();
    }

    @Test
    public void minCostClimbingStairs_Example1_ReturnsCorrectCost() {
        int[] cost = {10, 15, 20};
        int expected = 15;
        int actual = qa88.minCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairs_Example2_ReturnsCorrectCost() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
        int actual = qa88.minCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairs_SingleStep_ReturnsCost() {
        int[] cost = {10};
        int expected = 10;
        int actual = qa88.minCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairs_TwoSteps_ReturnsMinimumCost() {
        int[] cost = {10, 20};
        int expected = 10;
        int actual = qa88.minCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsCache_Example1_ReturnsCorrectCost() {
        int[] cost = {10, 15, 20};
        int expected = 15;
        int actual = qa88.minCostClimbingStairsCache(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsCache_Example2_ReturnsCorrectCost() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
        int actual = qa88.minCostClimbingStairsCache(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsCache_SingleStep_ReturnsCost() {
        int[] cost = {10};
        int expected = 10;
        int actual = qa88.minCostClimbingStairsCache(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsCache_TwoSteps_ReturnsMinimumCost() {
        int[] cost = {10, 20};
        int expected = 10;
        int actual = qa88.minCostClimbingStairsCache(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsCache_EmptyCostArray_ReturnsZero() {
        int[] cost = {};
        int expected = 0;
        int actual = qa88.minCostClimbingStairsCache(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsCache_LargeCostArray_ReturnsCorrectCost() {
        int[] cost = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 25;
        int actual = qa88.minCostClimbingStairsCache(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileOn_Example1_ReturnsCorrectCost() {
        int[] cost = {10, 15, 20};
        int expected = 15;
        int actual = qa88.minCostClimbingStairsWhileOn(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileOn_Example2_ReturnsCorrectCost() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
        int actual = qa88.minCostClimbingStairsWhileOn(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileOn_SingleStep_ReturnsCost() {
        int[] cost = {10};
        int expected = 10;
        int actual = qa88.minCostClimbingStairsWhileOn(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileOn_TwoSteps_ReturnsMinimumCost() {
        int[] cost = {10, 20};
        int expected = 10;
        int actual = qa88.minCostClimbingStairsWhileOn(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileOn_EmptyCostArray_ReturnsZero() {
        int[] cost = {};
        int expected = 0;
        int actual = qa88.minCostClimbingStairsWhileOn(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileOn_LargeCostArray_ReturnsCorrectCost() {
        int[] cost = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 25;
        int actual = qa88.minCostClimbingStairsWhileOn(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileO1_EmptyCostArray_ReturnsZero() {
        int[] cost = {};
        int expected = 0;
        int actual = qa88.minCostClimbingStairsWhileO1(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileO1_SingleStep_ReturnsCost() {
        int[] cost = {10};
        int expected = 10;
        int actual = qa88.minCostClimbingStairsWhileO1(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileO1_TwoSteps_ReturnsMinimumCost() {
        int[] cost = {10, 20};
        int expected = 10;
        int actual = qa88.minCostClimbingStairsWhileO1(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileO1_Example1_ReturnsCorrectCost() {
        int[] cost = {10, 15, 20};
        int expected = 15;
        int actual = qa88.minCostClimbingStairsWhileO1(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileO1_Example2_ReturnsCorrectCost() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
        int actual = qa88.minCostClimbingStairsWhileO1(cost);
        assertEquals(expected, actual);
    }

    @Test
    public void minCostClimbingStairsWhileO1_LargeCostArray_ReturnsCorrectCost() {
        int[] cost = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 25;
        int actual = qa88.minCostClimbingStairsWhileO1(cost);
        assertEquals(expected, actual);
    }
}
