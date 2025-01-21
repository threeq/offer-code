package com.uu2.ch11;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA68Test {

    private QA68 qa68;

    @BeforeEach
    public void setUp() {
        qa68 = new QA68();
    }

    @Test
    public void findInsertPos_TargetLessThanFirstElement_ReturnsZero() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        assertEquals(0, qa68.findInsertPos(nums, target));
    }

    @Test
    public void findInsertPos_TargetEqualToFirstElement_ReturnsZero() {
        int[] nums = {1, 3, 5, 6};
        int target = 1;
        assertEquals(0, qa68.findInsertPos(nums, target));
    }

    @Test
    public void findInsertPos_TargetBetweenElements_ReturnsCorrectPosition() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        assertEquals(1, qa68.findInsertPos(nums, target));
    }

    @Test
    public void findInsertPos_TargetEqualToElement_ReturnsPosition() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        assertEquals(2, qa68.findInsertPos(nums, target));
    }

    @Test
    public void findInsertPos_TargetGreaterThanAllElements_ReturnsLength() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        assertEquals(4, qa68.findInsertPos(nums, target));
    }

    @Test
    public void findInsertPos_TargetLessThanAllElements_ReturnsZero() {
        int[] nums = {1, 3, 5, 6};
        int target = -1;
        assertEquals(0, qa68.findInsertPos(nums, target));
    }

    @Test
    public void findInsertPos_TargetBetweenLastTwoElements_ReturnsCorrectPosition() {
        int[] nums = {1, 3, 5, 7};
        int target = 6;
        assertEquals(3, qa68.findInsertPos(nums, target));
    }
}
