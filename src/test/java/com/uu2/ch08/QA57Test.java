package com.uu2.ch08;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA57Test {

    private QA57 qa57;

    @BeforeEach
    public void setUp() {
        qa57 = new QA57();
    }

    @Test
    public void containNearAlmostDup_EmptyArray_ReturnsFalse() {
        int[] nums = {};
        assertFalse(qa57.containNearAlmostDup(nums, 1, 1));
    }

    @Test
    public void containNearAlmostDup_SingleElement_ReturnsFalse() {
        int[] nums = {1};
        assertFalse(qa57.containNearAlmostDup(nums, 1, 1));
    }

    @Test
    public void containNearAlmostDup_ValidPair_ReturnsTrue() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(qa57.containNearAlmostDup(nums, 3, 0));
    }

    @Test
    public void containNearAlmostDup_NoValidPair_ReturnsFalse() {
        int[] nums = {1, 0, 1, 1};
        assertTrue(qa57.containNearAlmostDup(nums, 1, 2));
    }

    @Test
    public void containNearAlmostDup_KZero_ReturnsFalse() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        assertFalse(qa57.containNearAlmostDup(nums, 0, 3));
    }

    @Test
    public void containNearAlmostDup_TZero_ReturnsTrue() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(qa57.containNearAlmostDup(nums, 3, 0));
    }

    @Test
    public void containNearAlmostDup_NegativeNumbers_ReturnsTrue() {
        int[] nums = {-1, 2147483647};
        assertFalse(qa57.containNearAlmostDup(nums, 1, 2147483647));
    }

    @Test
    public void containNearAlmostDup_LargeNumbers_ReturnsTrue() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(qa57.containNearAlmostDup(nums, 3, 3));
    }

    @Test
    public void containNearAlmostDup2_EmptyArray_ReturnsFalse() {
        int[] nums = {};
        assertFalse(qa57.containNearAlmostDup2(nums, 1, 1));
    }

    @Test
    public void containNearAlmostDup2_SingleElement_ReturnsFalse() {
        int[] nums = {1};
        assertFalse(qa57.containNearAlmostDup2(nums, 1, 1));
    }

    @Test
    public void containNearAlmostDup2_ValidPair_ReturnsTrue() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(qa57.containNearAlmostDup2(nums, 3, 0));
    }

    @Test
    public void containNearAlmostDup2_NoValidPair_ReturnsFalse() {
        int[] nums = {1, 0, 1, 1};
        assertTrue(qa57.containNearAlmostDup2(nums, 1, 2));
    }

    @Test
    public void containNearAlmostDup2_KZero_ReturnsFalse() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        assertFalse(qa57.containNearAlmostDup2(nums, 0, 3));
    }

    @Test
    public void containNearAlmostDup2_TZero_ReturnsTrue() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(qa57.containNearAlmostDup2(nums, 3, 0));
    }

    @Test
    public void containNearAlmostDup2_LargeNumbers_ReturnsTrue() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(qa57.containNearAlmostDup2(nums, 3, 3));
    }

    @Test
    public void containNearAlmostDup2_ValidPairWithT_ReturnsTrue() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(qa57.containNearAlmostDup2(nums, 3, 1));
    }

    @Test
    public void containNearAlmostDup2_NoValidPairWithT_ReturnsFalse() {
        int[] nums = {1, 5, 9, 1, 5, 9};
        assertFalse(qa57.containNearAlmostDup2(nums, 2, 3));
    }

    @Test
    public void containNearAlmostDup2_ValidPairWithNegativeNumbers_ReturnsTrue() {
        int[] nums = {-1, -2, -3, -1};
        assertTrue(qa57.containNearAlmostDup2(nums, 3, 0));
    }

    @Test
    public void containNearAlmostDup2_NoValidPairWithNegativeNumbers_ReturnsFalse() {
        int[] nums = {-1, -2, -3, -1};
        assertTrue(qa57.containNearAlmostDup2(nums, 1, 2));
    }
}
