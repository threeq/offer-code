package com.uu2.ch11;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA71Test {

    private QA71 qa71;

    @BeforeEach
    public void setUp() {
        qa71 = new QA71();
    }

    @Test
    public void pickIndex_EmptyArray_ReturnsMinusOne() {
        int[] w = {};
        int result = qa71.pickIndex(w);
        assertEquals(-1, result);
    }

    @Test
    public void pickIndex_SingleWeight_ReturnsZero() {
        int[] w = {1};
        int result = qa71.pickIndex(w);
        assertEquals(0, result);
    }

    @Test
    public void pickIndex_MultipleWeights_ReturnsCorrectIndex() {
        int[] w = {1, 2, 3};
        int[] counts = new int[w.length];
        int iterations = 100000;
        for (int i = 0; i < iterations; i++) {
            int result = qa71.pickIndex(w);
            counts[result]++;
        }
        // 验证权重是否大致按比例分配
        assertTrue(counts[0] < counts[1]);
        assertTrue(counts[1] < counts[2]);
    }

    @Test
    public void pickIndex_EqualWeights_DistributesEvenly() {
        int[] w = {1, 1, 1};
        int[] counts = new int[w.length];
        int iterations = 100000;
        for (int i = 0; i < iterations; i++) {
            int result = qa71.pickIndex(w);
            counts[result]++;
        }
        // 验证权重是否大致相等
        assertTrue(Math.abs(counts[0] - counts[1]) < 1000);
        assertTrue(Math.abs(counts[1] - counts[2]) < 1000);
    }

    @Test
    public void pickIndex_DifferentWeights_BiasesSelection() {
        int[] w = {1, 10, 100};
        int[] counts = new int[w.length];
        int iterations = 100000;
        for (int i = 0; i < iterations; i++) {
            int result = qa71.pickIndex(w);
            counts[result]++;
        }
        // 验证权重是否偏向较大的权重
        assertTrue(counts[0] < counts[1]);
        assertTrue(counts[1] < counts[2]);
    }
}
