package com.uu2.ch13;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA81Test {

    private QA81 qa81;

    @BeforeEach
    public void setUp() {
        qa81 = new QA81();
    }

    @Test
    public void combine_TargetZero_ReturnsEmptyList() {
        List<List<Integer>> result = qa81.combine(new int[]{1, 2, 3}, 0);
        assertEquals(1, result.size());
        assertEquals(Arrays.asList(), result.get(0));
    }

    @Test
    public void combine_TargetNegative_ReturnsEmptyList() {
        List<List<Integer>> result = qa81.combine(new int[]{1, 2, 3}, -1);
        assertEquals(0, result.size());
    }

    @Test
    public void combine_EmptyArray_ReturnsEmptyList() {
        List<List<Integer>> result = qa81.combine(new int[]{}, 5);
        assertEquals(0, result.size());
    }

    @Test
    public void combine_WithDuplicates_ReturnsCorrectCombinations() {
        List<List<Integer>> result = qa81.combine(new int[]{1, 2}, 4);
        assertEquals(3, result.size());
        assertEquals(Arrays.asList(Arrays.asList(1, 1, 1, 1), Arrays.asList(1, 1, 2), Arrays.asList(2, 2)), result);
    }

    @Test
    public void combine_WithNegativeNumbers_ReturnsCorrectCombinations() {
        List<List<Integer>> result = qa81.combine(new int[]{1, 3, 2}, 2);
        assertEquals(2, result.size());
        assertEquals(Arrays.asList(Arrays.asList(1, 1), Arrays.asList(2)), result);
    }

}
