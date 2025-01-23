package com.uu2.book1.ch14;


import com.uu2.book1.ch14.QA102;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA102Test {

    private QA102 qa102;

    @BeforeEach
    public void setUp() {
        qa102 = new QA102();
    }

    @Test
    public void findTargetSumWays_ValidInput_ReturnsCorrectCount() {
        int[] nums = {1, 1, 1, 1, 1};
        int s = 3;
        int result = qa102.findTargetSumWays(nums, s);
        assertEquals(5, result);
    }

    @Test
    public void findTargetSumWays_SumLessThanTarget_ReturnsZero() {
        int[] nums = {1, 1, 1, 1, 1};
        int s = 10;
        int result = qa102.findTargetSumWays(nums, s);
        assertEquals(0, result);
    }

    @Test
    public void findTargetSumWays_SumGreaterThanNegativeTarget_ReturnsZero() {
        int[] nums = {1, 1, 1, 1, 1};
        int s = -10;
        int result = qa102.findTargetSumWays(nums, s);
        assertEquals(0, result);
    }

    @Test
    public void findTargetSumWays_OddSumPlusTarget_ReturnsZero() {
        int[] nums = {1, 2, 3};
        int s = 2;
        int result = qa102.findTargetSumWays(nums, s);
        assertEquals(1, result);
    }

    @Test
    public void findTargetSumWays_EmptyArray_ReturnsZero() {
        int[] nums = {};
        int s = 0;
        int result = qa102.findTargetSumWays(nums, s);
        assertEquals(0, result);
    }

    @Test
    public void findTargetSumWays_SingleElementArray_ReturnsCorrectCount() {
        int[] nums = {1};
        int s = 1;
        int result = qa102.findTargetSumWays(nums, s);
        assertEquals(1, result);
    }

    @Test
    public void findTargetSumWays_SingleElementArrayNegativeTarget_ReturnsZero() {
        int[] nums = {1};
        int s = -2;
        int result = qa102.findTargetSumWays(nums, s);
        assertEquals(0, result);
    }
}
