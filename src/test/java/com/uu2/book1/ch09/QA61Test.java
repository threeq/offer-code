package com.uu2.book1.ch09;


import com.uu2.book1.ch09.QA61;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA61Test {

    private QA61 qa61;

    @BeforeEach
    public void setUp() {
        qa61 = new QA61();
    }

    @Test
    public void kSmallestPairs_EmptyArrays_ReturnsEmptyList() {
        List<List<Integer>> result = qa61.kSmallestPairs(new int[]{}, new int[]{}, 3);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void kSmallestPairs_SingleElementArrays_ReturnsSinglePair() {
        List<List<Integer>> result = qa61.kSmallestPairs(new int[]{1}, new int[]{2}, 1);
        assertEquals(Arrays.asList(Arrays.asList(1, 2)), result);
    }

    @Test
    public void kSmallestPairs_KGreaterThanArrayLength_ReturnsAllPairs() {
        List<List<Integer>> result = qa61.kSmallestPairs(new int[]{1, 2}, new int[]{3, 4}, 10);
        assertEquals(Arrays.asList(Arrays.asList(2, 4), Arrays.asList(1, 4), Arrays.asList(2, 3), Arrays.asList(1, 3)), result);
    }

    @Test
    public void kSmallestPairs_KLessThanArrayLength_ReturnsKSmallestPairs() {
        List<List<Integer>> result = qa61.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3);
        assertEquals(Arrays.asList(Arrays.asList(1, 6), Arrays.asList(1, 4), Arrays.asList(1, 2)), result);
    }

    @Test
    public void kSmallestPairs_KZero_ReturnsEmptyList() {
        List<List<Integer>> result = qa61.kSmallestPairs(new int[]{1, 2}, new int[]{3, 4}, 0);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void kSmallestPairs_NegativeAndZeroValues_ReturnsCorrectPairs() {
        List<List<Integer>> result = qa61.kSmallestPairs(new int[]{-1, 0, 1}, new int[]{-2, 0, 2}, 2);
        assertEquals(Arrays.asList(Arrays.asList(0, -2), Arrays.asList(-1, -2)), result);
    }

    @Test
    public void kSmallestPairs_DuplicateElements_ReturnsCorrectPairs() {
        List<List<Integer>> result = qa61.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 3);
        assertEquals(Arrays.asList(Arrays.asList(2, 1), Arrays.asList(1, 1), Arrays.asList(1, 1)), result);
    }

    @Test
    public void kSmallestPairs2_EmptyArrays_ReturnsEmptyList() {
        List<List<Integer>> result = qa61.kSmallestPairs2(new int[]{}, new int[]{}, 3);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void kSmallestPairs2_SingleElementArrays_ReturnsSinglePair() {
        List<List<Integer>> result = qa61.kSmallestPairs2(new int[]{1}, new int[]{2}, 1);
        assertEquals(Arrays.asList(Arrays.asList(1, 2)), result);
    }

    @Test
    public void kSmallestPairs2_KGreaterThanArrayLength_ReturnsAllPairs() {
        List<List<Integer>> result = qa61.kSmallestPairs2(new int[]{1, 2}, new int[]{3, 4}, 10);
        assertEquals(Arrays.asList(Arrays.asList(1, 3), Arrays.asList(2, 3), Arrays.asList(1, 4), Arrays.asList(2, 4)), result);
    }

    @Test
    public void kSmallestPairs2_KLessThanArrayLength_ReturnsKSmallestPairs() {
        List<List<Integer>> result = qa61.kSmallestPairs2(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3);
        assertEquals(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(1, 4), Arrays.asList(1, 6)), result);
    }

    @Test
    public void kSmallestPairs2_KZero_ReturnsEmptyList() {
        List<List<Integer>> result = qa61.kSmallestPairs2(new int[]{1, 2}, new int[]{3, 4}, 0);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void kSmallestPairs2_NegativeAndZeroValues_ReturnsCorrectPairs() {
        List<List<Integer>> result = qa61.kSmallestPairs2(new int[]{-1, 0, 1}, new int[]{-2, 0, 2}, 2);
        assertEquals(Arrays.asList(Arrays.asList(-1, -2), Arrays.asList(0, -2)), result);
    }

    @Test
    public void kSmallestPairs2_DuplicateElements_ReturnsCorrectPairs() {
        List<List<Integer>> result = qa61.kSmallestPairs2(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 3);
        assertEquals(Arrays.asList(Arrays.asList(1, 1), Arrays.asList(1, 1), Arrays.asList(1, 2)), result);
    }
}
