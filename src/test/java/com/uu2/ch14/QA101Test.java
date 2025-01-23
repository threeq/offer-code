package com.uu2.ch14;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA101Test {

    private QA101 qa101;

    @BeforeEach
    public void setUp() {
        qa101 = new QA101();
    }

    @Test
    public void canPartition_OddSum_ReturnsFalse() {
        int[] nums = {1, 2, 4};
        assertFalse(qa101.canPartition(nums));
    }

    @Test
    public void canPartition_EvenSumSubsetExists_ReturnsTrue() {
        int[] nums = {1, 5, 11, 5};
        assertTrue(qa101.canPartition(nums));
    }

    @Test
    public void canPartition_EvenSumSubsetDoesNotExist_ReturnsFalse() {
        int[] nums = {1, 2, 3, 5};
        assertFalse(qa101.canPartition(nums));
    }

    @Test
    public void canPartition_EmptyArray_ReturnsTrue() {
        int[] nums = {};
        assertTrue(qa101.canPartition(nums));
    }

    @Test
    public void canPartition_SingleElement_ReturnsFalse() {
        int[] nums = {1};
        assertFalse(qa101.canPartition(nums));
    }

    @Test
    public void canPartition_TwoEqualElements_ReturnsTrue() {
        int[] nums = {2, 2};
        assertTrue(qa101.canPartition(nums));
    }

    @Test
    public void canPartition2_OddSum_ReturnsFalse() {
        int[] nums = {1, 2, 4};
        assertFalse(qa101.canPartition2(nums));
    }

    @Test
    public void canPartition2_EvenSumSubsetExists_ReturnsTrue() {
        int[] nums = {1, 5, 11, 5};
        assertTrue(qa101.canPartition2(nums));
    }

    @Test
    public void canPartition2_EvenSumSubsetDoesNotExist_ReturnsFalse() {
        int[] nums = {1, 2, 3, 5};
        assertFalse(qa101.canPartition2(nums));
    }

    @Test
    public void canPartition2_EmptyArray_ReturnsTrue() {
        int[] nums = {};
        assertTrue(qa101.canPartition2(nums));
    }

    @Test
    public void canPartition2_SingleElement_ReturnsFalse() {
        int[] nums = {1};
        assertFalse(qa101.canPartition2(nums));
    }

    @Test
    public void canPartition2_TwoEqualElements_ReturnsTrue() {
        int[] nums = {2, 2};
        assertTrue(qa101.canPartition2(nums));
    }

    @Test
    public void canPartition3_OddSum_ReturnsFalse() {
        int[] nums = {1, 2, 4};
        assertFalse(qa101.canPartition3(nums));
    }

    @Test
    public void canPartition3_EvenSumSubsetExists_ReturnsTrue() {
        int[] nums = {1, 5, 11, 5};
        assertTrue(qa101.canPartition3(nums));
    }

    @Test
    public void canPartition3_EvenSumSubsetDoesNotExist_ReturnsFalse() {
        int[] nums = {1, 2, 3, 5};
        assertFalse(qa101.canPartition3(nums));
    }

    @Test
    public void canPartition3_EmptyArray_ReturnsTrue() {
        int[] nums = {};
        assertTrue(qa101.canPartition3(nums));
    }

    @Test
    public void canPartition3_SingleElement_ReturnsFalse() {
        int[] nums = {1};
        assertFalse(qa101.canPartition3(nums));
    }

    @Test
    public void canPartition3_TwoEqualElements_ReturnsTrue() {
        int[] nums = {2, 2};
        assertTrue(qa101.canPartition3(nums));
    }

    @Test
    public void canPartition3_NullArray_ReturnsTrue() {
        int[] nums = null;
        assertTrue(qa101.canPartition3(nums));
    }
}
