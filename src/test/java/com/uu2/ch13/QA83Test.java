package com.uu2.ch13;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA83Test {

    private QA83 qa83;

    @BeforeEach
    public void setUp() {
        qa83 = new QA83();
    }

    @Test
    public void permute_NullInput_ReturnsEmptyList() {
        List<List<Integer>> result = qa83.permute(null);
        assertTrue(result.isEmpty(), "Expected an empty list for null input");
    }

    @Test
    public void permute_EmptyArray_ReturnsEmptyList() {
        List<List<Integer>> result = qa83.permute(new int[]{});
        assertTrue(result.isEmpty(), "Expected an empty list for empty input");
    }

    @Test
    public void permute_SingleElement_ReturnsSingleElementList() {
        List<List<Integer>> result = qa83.permute(new int[]{1});
        assertEquals(1, result.size(), "Expected one permutation for a single element");
        assertEquals(Arrays.asList(1), result.get(0), "Expected the permutation to be [1]");
    }

    @Test
    public void permute_MultipleElements_ReturnsAllPermutations() {
        List<List<Integer>> result = qa83.permute(new int[]{1, 2, 3});
        assertEquals(6, result.size(), "Expected 6 permutations for 3 elements");
        assertTrue(result.contains(Arrays.asList(1, 2, 3)), "Expected permutation [1, 2, 3]");
        assertTrue(result.contains(Arrays.asList(1, 3, 2)), "Expected permutation [1, 3, 2]");
        assertTrue(result.contains(Arrays.asList(2, 1, 3)), "Expected permutation [2, 1, 3]");
        assertTrue(result.contains(Arrays.asList(2, 3, 1)), "Expected permutation [2, 3, 1]");
        assertTrue(result.contains(Arrays.asList(3, 1, 2)), "Expected permutation [3, 1, 2]");
        assertTrue(result.contains(Arrays.asList(3, 2, 1)), "Expected permutation [3, 2, 1]");
    }
}
