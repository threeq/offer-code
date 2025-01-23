package com.uu2.book1.ch06;


import com.uu2.book1.ch06.QA38;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QA38Test {

    private QA38 qa38;

    @BeforeEach
    public void setUp() {
        qa38 = new QA38();
    }

    @Test
    public void dailyTemperatures_ExampleInput_ShouldReturnCorrectOutput() {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, qa38.dailyTemperatures(T));
    }

    @Test
    public void dailyTemperatures_NoHigherTemperature_ShouldReturnZeros() {
        int[] T = {80, 79, 78, 77};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, qa38.dailyTemperatures(T));
    }

    @Test
    public void dailyTemperatures_EmptyArray_ShouldReturnEmptyArray() {
        int[] T = {};
        int[] expected = {};
        assertArrayEquals(expected, qa38.dailyTemperatures(T));
    }

    @Test
    public void dailyTemperatures_SingleElement_ShouldReturnZero() {
        int[] T = {75};
        int[] expected = {0};
        assertArrayEquals(expected, qa38.dailyTemperatures(T));
    }

    @Test
    public void dailyTemperatures_UnorderedTemperatures_ShouldReturnCorrectOutput() {
        int[] T = {72, 75, 71, 69, 74, 76, 73};
        int[] expected = {1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, qa38.dailyTemperatures(T));
    }

    @Test
    public void dailyTemperatures2_ExampleInput_ShouldReturnCorrectOutput() {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, qa38.dailyTemperatures2(T));
    }

    @Test
    public void dailyTemperatures2_NoHigherTemperature_ShouldReturnZeros() {
        int[] T = {80, 79, 78, 77};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, qa38.dailyTemperatures2(T));
    }

    @Test
    public void dailyTemperatures2_EmptyArray_ShouldReturnEmptyArray() {
        int[] T = {};
        int[] expected = {};
        assertArrayEquals(expected, qa38.dailyTemperatures2(T));
    }

    @Test
    public void dailyTemperatures2_SingleElement_ShouldReturnZero() {
        int[] T = {75};
        int[] expected = {0};
        assertArrayEquals(expected, qa38.dailyTemperatures2(T));
    }

    @Test
    public void dailyTemperatures2_UnorderedTemperatures_ShouldReturnCorrectOutput() {
        int[] T = {72, 75, 71, 69, 74, 76, 73};
        int[] expected = {1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, qa38.dailyTemperatures2(T));
    }

    @Test
    public void dailyTemperatures2_AllSameTemperatures_ShouldReturnZeros() {
        int[] T = {75, 75, 75, 75};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, qa38.dailyTemperatures2(T));
    }

    @Test
    public void dailyTemperatures2_StrictlyIncreasing_ShouldReturnZeros() {
        int[] T = {71, 72, 73, 74};
        int[] expected = {1, 1, 1, 0};
        assertArrayEquals(expected, qa38.dailyTemperatures2(T));
    }

    @Test
    public void dailyTemperatures2_StrictlyDecreasing_ShouldReturnCorrectOutput() {
        int[] T = {74, 73, 72, 71};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, qa38.dailyTemperatures2(T));
    }

    @Test
    public void dailyTemperatures2_BoundaryValues_ShouldHandleCorrectly() {
        int[] T = {Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] expected = {0, 1, 0};
        assertArrayEquals(expected, qa38.dailyTemperatures2(T));
    }
}
