package com.uu2.ch10;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA67Test {

    private QA67 qa67;

    @BeforeEach
    public void setUp() {
        qa67 = new QA67();
    }

    @Test
    public void findMaximumXOR_EmptyArray_ReturnsZero() {
        int[] nums = {};
        assertEquals(0, qa67.findMaximumXOR(nums));
    }

    @Test
    public void findMaximumXOR_SingleElement_ReturnsZero() {
        int[] nums = {5};
        assertEquals(0, qa67.findMaximumXOR(nums));
    }

    @Test
    public void findMaximumXOR_TwoElements_ReturnsXor() {
        int[] nums = {5, 6};
        assertEquals(3, qa67.findMaximumXOR(nums));
    }

    @Test
    public void findMaximumXOR_MultipleElements_ReturnsMaxXor() {
        int[] nums = {3, 10, 5, 25, 2, 8};
        assertEquals(28, qa67.findMaximumXOR(nums));
    }

    @Test
    public void findMaximumXOR_AllSameElements_ReturnsZero() {
        int[] nums = {7, 7, 7, 7};
        assertEquals(0, qa67.findMaximumXOR(nums));
    }

    @Test
    public void findMaximumXOR_AllDifferentElements_ReturnsMaxXor() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(7, qa67.findMaximumXOR(nums));
    }

    @Test
    public void findMaximumXOR_ContainsZero_ReturnsMaxXor() {
        int[] nums = {0, 1, 2, 3, 4};
        assertEquals(7, qa67.findMaximumXOR(nums));
    }

    @Test
    public void findMaximumXOR_ContainsNegativeNumbers_ReturnsMaxXor() {
        int[] nums = {-1, -2, -3, -4, -5};
        assertEquals(7, qa67.findMaximumXOR(nums));
    }
}
