package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA115Test {

    private QA115 qa115;

    @BeforeEach
    public void setUp() {
        qa115 = new QA115();
    }

    @Test
    public void sequenceReconstruction_ValidSequences_ReturnsTrue() {
        int[] org = {1, 2, 3};
        List<List<Integer>> seqs = new ArrayList<>();
        seqs.add(Arrays.asList(1, 2));
        seqs.add(Arrays.asList(1, 3));
        seqs.add(Arrays.asList(2, 3));
        assertTrue(qa115.sequenceReconstruction(org, seqs));
    }

    @Test
    public void sequenceReconstruction_InvalidSequences_ReturnsFalse() {
        int[] org = {1, 2, 3};
        List<List<Integer>> seqs = new ArrayList<>();
        seqs.add(Arrays.asList(1, 2));
        seqs.add(Arrays.asList(1, 3));
        assertFalse(qa115.sequenceReconstruction(org, seqs));
    }

    @Test
    public void sequenceReconstruction_OutOfRangeNumbers_ReturnsFalse() {
        int[] org = {1, 2, 3};
        List<List<Integer>> seqs = new ArrayList<>();
        seqs.add(Arrays.asList(1, 4));
        assertFalse(qa115.sequenceReconstruction(org, seqs));
    }

    @Test
    public void sequenceReconstruction_EmptySequences_ReturnsFalse() {
        int[] org = {1, 2, 3};
        List<List<Integer>> seqs = new ArrayList<>();
        assertFalse(qa115.sequenceReconstruction(org, seqs));
    }

    @Test
    public void sequenceReconstruction_SingleElement_ReturnsTrue() {
        int[] org = {1};
        List<List<Integer>> seqs = new ArrayList<>();
        seqs.add(Arrays.asList(1));
        assertTrue(qa115.sequenceReconstruction(org, seqs));
    }

    @Test
    public void sequenceReconstruction_MultipleValidSequences_ReturnsTrue() {
        int[] org = {1, 2, 3};
        List<List<Integer>> seqs = new ArrayList<>();
        seqs.add(Arrays.asList(1, 2));
        seqs.add(Arrays.asList(2, 3));
        seqs.add(Arrays.asList(1, 3));
        assertTrue(qa115.sequenceReconstruction(org, seqs));
    }
}
