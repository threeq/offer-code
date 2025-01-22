package com.uu2.ch13;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA84Test {

    private QA84 qa84;

    @BeforeEach
    public void setUp() {
        qa84 = new QA84();
    }

    @Test
    public void permuteUnique_NullInput_ReturnsEmptyList() {
        List<List<Integer>> result = qa84.permuteUnique(null);
        assertTrue(result.isEmpty(), "Expected an empty list for null input");
    }

    @Test
    public void permuteUnique_EmptyArray_ReturnsEmptyList() {
        List<List<Integer>> result = qa84.permuteUnique(new int[]{});
        assertTrue(result.isEmpty(), "Expected an empty list for empty input");
    }

    @Test
    public void permuteUnique_SingleElement_ReturnsSingleElementList() {
        List<List<Integer>> result = qa84.permuteUnique(new int[]{1});
        assertEquals(1, result.size(), "Expected a single permutation");
        assertEquals(Arrays.asList(1), result.get(0), "Expected the single element list");
    }

    @Test
    public void permuteUnique_NoDuplicates_ReturnsAllPermutations() {
        List<List<Integer>> result = qa84.permuteUnique(new int[]{1, 2, 3});
        assertEquals(6, result.size(), "Expected 6 permutations for 3 unique elements");
        Set<List<Integer>> resultSet = new HashSet<>(result);
        assertEquals(6, resultSet.size(), "Expected all permutations to be unique");
    }

    @Test
    public void permuteUnique_WithDuplicates_ReturnsUniquePermutations() {
        List<List<Integer>> result = qa84.permuteUnique(new int[]{1, 1, 2});
        assertEquals(3, result.size(), "Expected 3 unique permutations");
        Set<List<Integer>> resultSet = new HashSet<>(result);
        assertEquals(3, resultSet.size(), "Expected all permutations to be unique");
    }

    @Test
    public void permuteUnique_AllElementsSame_ReturnsSinglePermutation() {
        List<List<Integer>> result = qa84.permuteUnique(new int[]{1, 1, 1});
        assertEquals(1, result.size(), "Expected a single permutation");
        assertEquals(Arrays.asList(1, 1, 1), result.get(0), "Expected the single permutation");
    }
}
