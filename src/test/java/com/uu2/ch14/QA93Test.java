package com.uu2.ch14;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA93Test {

    private QA93 qa93;

    @BeforeEach
    public void setUp() {
        qa93 = new QA93();
    }

    @Test
    public void lenLongestFib_NullArray_ReturnsZero() {
        int[] A = null;
        assertEquals(0, qa93.lenLongestFib(A));
    }

    @Test
    public void lenLongestFib_EmptyArray_ReturnsZero() {
        int[] A = {};
        assertEquals(0, qa93.lenLongestFib(A));
    }

    @Test
    public void lenLongestFib_SingleElement_ReturnsZero() {
        int[] A = {1};
        assertEquals(0, qa93.lenLongestFib(A));
    }

    @Test
    public void lenLongestFib_TwoElements_ReturnsZero() {
        int[] A = {1, 2};
        assertEquals(0, qa93.lenLongestFib(A));
    }

    @Test
    public void lenLongestFib_ValidFibonacciSequence_ReturnsLength() {
        int[] A = {1, 2, 3, 5, 8, 13};
        assertEquals(6, qa93.lenLongestFib(A));
    }

    @Test
    public void lenLongestFib_NoFibonacciSequence_ReturnsZero() {
        int[] A = {1, 4, 6, 8, 11};
        assertEquals(0, qa93.lenLongestFib(A));
    }

    @Test
    public void lenLongestFib_MultipleFibonacciSequences_ReturnsLongest() {
        int[] A = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        assertEquals(14, qa93.lenLongestFib(A));
    }

    @Test
    public void lenLongestFib_AllSameElements_ReturnsZero() {
        int[] A = {1, 1, 1, 1, 1};
        assertEquals(0, qa93.lenLongestFib(A));
    }

    @Test
    public void lenLongestFib_UnorderedElements_ReturnsCorrectLength() {
        int[] A = {10, 1, 2, 3, 5, 8};
        assertEquals(5, qa93.lenLongestFib(A));
    }
}
