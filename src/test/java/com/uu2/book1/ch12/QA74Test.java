package com.uu2.book1.ch12;


import com.uu2.book1.ch12.QA74;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QA74Test {

    private QA74 qa74;

    @BeforeEach
    public void setUp() {
        qa74 = new QA74();
    }

    @Test
    public void merge_EmptyInput_ReturnsEmpty() {
        int[][] intervals = {};
        int[][] expected = {};
        assertArrayEquals(expected, qa74.merge(intervals));
    }

    @Test
    public void merge_SingleInterval_ReturnsSameInterval() {
        int[][] intervals = {{1, 3}};
        int[][] expected = {{1, 3}};
        assertArrayEquals(expected, qa74.merge(intervals));
    }

    @Test
    public void merge_NonOverlappingIntervals_ReturnsSameIntervals() {
        int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};
        int[][] expected = {{1, 2}, {3, 4}, {5, 6}};
        assertArrayEquals(expected, qa74.merge(intervals));
    }

    @Test
    public void merge_OverlappingIntervals_MergesCorrectly() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, qa74.merge(intervals));
    }

    @Test
    public void merge_FullyContainedIntervals_MergesCorrectly() {
        int[][] intervals = {{1, 4}, {2, 3}};
        int[][] expected = {{1, 4}};
        assertArrayEquals(expected, qa74.merge(intervals));
    }

    @Test
    public void merge_ConsecutiveOverlappingIntervals_MergesCorrectly() {
        int[][] intervals = {{1, 4}, {4, 5}, {5, 6}};
        int[][] expected = {{1, 6}};
        assertArrayEquals(expected, qa74.merge(intervals));
    }

    @Test
    public void merge_BoundaryOverlappingIntervals_MergesCorrectly() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}};
        int[][] expected = {{1, 4}};
        assertArrayEquals(expected, qa74.merge(intervals));
    }
}
