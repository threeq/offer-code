package com.uu2.ch06;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA39Test {

    private QA39 qa39;

    @BeforeEach
    public void setUp() {
        qa39 = new QA39();
    }

    @Test
    public void largestRectangleArea_EmptyArray_ReturnsZero() {
        int[] heights = {};
        assertEquals(0, qa39.largestRectangleArea(heights));
    }

    @Test
    public void largestRectangleArea_SingleBar_ReturnsHeight() {
        int[] heights = {5};
        assertEquals(5, qa39.largestRectangleArea(heights));
    }

    @Test
    public void largestRectangleArea_AllSameHeight_ReturnsCorrectArea() {
        int[] heights = {3, 3, 3, 3};
        assertEquals(12, qa39.largestRectangleArea(heights));
    }

    @Test
    public void largestRectangleArea_DifferentHeights_ReturnsCorrectArea() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        assertEquals(10, qa39.largestRectangleArea(heights));
    }

    @Test
    public void largestRectangleArea_IncreasingHeights_ReturnsCorrectArea() {
        int[] heights = {1, 2, 3, 4, 5};
        assertEquals(9, qa39.largestRectangleArea(heights));
    }

    @Test
    public void largestRectangleArea_DecreasingHeights_ReturnsCorrectArea() {
        int[] heights = {5, 4, 3, 2, 1};
        assertEquals(9, qa39.largestRectangleArea(heights));
    }

    @Test
    public void largestRectangleArea_MixedHeights_ReturnsCorrectArea() {
        int[] heights = {1, 0, 2, 1, 3, 2, 1};
        assertEquals(5, qa39.largestRectangleArea(heights));
    }

    @Test
    public void largestRectangleArea2_EmptyArray_ReturnsZero() {
        int[] heights = {};
        assertEquals(0, qa39.largestRectangleArea2(heights));
    }

    @Test
    public void largestRectangleArea2_SingleBar_ReturnsHeight() {
        int[] heights = {5};
        assertEquals(5, qa39.largestRectangleArea2(heights));
    }

    @Test
    public void largestRectangleArea2_AllSameHeight_ReturnsCorrectArea() {
        int[] heights = {3, 3, 3, 3};
        assertEquals(12, qa39.largestRectangleArea2(heights));
    }

    @Test
    public void largestRectangleArea2_DifferentHeights_ReturnsCorrectArea() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        assertEquals(10, qa39.largestRectangleArea2(heights));
    }

    @Test
    public void largestRectangleArea2_IncreasingHeights_ReturnsCorrectArea() {
        int[] heights = {1, 2, 3, 4, 5};
        assertEquals(9, qa39.largestRectangleArea2(heights));
    }

    @Test
    public void largestRectangleArea2_DecreasingHeights_ReturnsCorrectArea() {
        int[] heights = {5, 4, 3, 2, 1};
        assertEquals(9, qa39.largestRectangleArea2(heights));
    }

    @Test
    public void largestRectangleArea2_MixedHeights_ReturnsCorrectArea() {
        int[] heights = {1, 0, 2, 1, 3, 2, 1};
        assertEquals(5, qa39.largestRectangleArea2(heights));
    }

    @Test
    public void largestRectangleArea2_MinHeightInMiddle_ReturnsCorrectArea() {
        int[] heights = {3, 2, 1, 2, 3};
        assertEquals(5, qa39.largestRectangleArea2(heights));
    }

    @Test
    public void largestRectangleArea2_MinHeightAtEdge_ReturnsCorrectArea() {
        int[] heights = {1, 2, 3, 4, 0};
        assertEquals(6, qa39.largestRectangleArea2(heights));
    }

    @Test
    public void largestRectangleArea3_EmptyArray_ReturnsZero() {
        int[] heights = {};
        assertEquals(0, qa39.largestRectangleArea3(heights));
    }

    @Test
    public void largestRectangleArea3_SingleBar_ReturnsHeight() {
        int[] heights = {5};
        assertEquals(5, qa39.largestRectangleArea3(heights));
    }

    @Test
    public void largestRectangleArea3_AllSameHeight_ReturnsCorrectArea() {
        int[] heights = {3, 3, 3, 3};
        assertEquals(12, qa39.largestRectangleArea3(heights));
    }

    @Test
    public void largestRectangleArea3_DifferentHeights_ReturnsCorrectArea() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        assertEquals(10, qa39.largestRectangleArea3(heights));
    }

    @Test
    public void largestRectangleArea3_IncreasingHeights_ReturnsCorrectArea() {
        int[] heights = {1, 2, 3, 4, 5};
        assertEquals(9, qa39.largestRectangleArea3(heights));
    }

    @Test
    public void largestRectangleArea3_DecreasingHeights_ReturnsCorrectArea() {
        int[] heights = {5, 4, 3, 2, 1};
        assertEquals(9, qa39.largestRectangleArea3(heights));
    }

    @Test
    public void largestRectangleArea3_MixedHeights_ReturnsCorrectArea() {
        int[] heights = {1, 0, 2, 1, 3, 2, 1};
        assertEquals(5, qa39.largestRectangleArea3(heights));
    }

    @Test
    public void largestRectangleArea3_MinHeightInMiddle_ReturnsCorrectArea() {
        int[] heights = {3, 2, 1, 2, 3};
        assertEquals(5, qa39.largestRectangleArea3(heights));
    }
}
