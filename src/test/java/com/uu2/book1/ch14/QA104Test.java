package com.uu2.book1.ch14;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.uu2.book1.ch14.QA104;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA104Test {

    private QA104 qa104;

    @BeforeEach
    public void setUp() {
        qa104 = new QA104();
    }

    @Test
    public void permutationSum_EmptyArray_Zero() {
        int[] nums = {};
        int t = 5;
        assertEquals(0, qa104.permutationSum(nums, t));
    }

    @Test
    public void permutationSum_SingleNumber_MultipleOfT() {
        int[] nums = {3,2};
        int t = 6;
        assertEquals(2, qa104.permutationSum(nums, t)); // 3+3
    }

    @Test
    public void permutationSum_SingleNumber_NotMultipleOfT() {
        int[] nums = {3};
        int t = 5;
        assertEquals(0, qa104.permutationSum(nums, t));
    }

    @Test
    public void permutationSum_MultipleNumbers_MultipleWays() {
        int[] nums = {1, 2, 3};
        int t = 4;
        assertEquals(7, qa104.permutationSum(nums, t)); // 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1
    }

    @Test
    public void permutationSum_MultipleNumbers_NoWays() {
        int[] nums = {5, 10};
        int t = 3;
        assertEquals(0, qa104.permutationSum(nums, t));
    }

    @Test
    public void permutationSum_BoundaryCaseTZero_One() {
        int[] nums = {1, 2, 3};
        int t = 0;
        assertEquals(1, qa104.permutationSum(nums, t));
    }
}
