package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA117Test {

    private QA117 qa117;

    @BeforeEach
    public void setUp() {
        qa117 = new QA117();
    }

    @Test
    public void numSimilarGroups_EmptyArray_ReturnsZero() {
        String[] strs = {};
        assertEquals(0, qa117.numSimilarGroups(strs));
    }

    @Test
    public void numSimilarGroups_SingleString_ReturnsOne() {
        String[] strs = {"abc"};
        assertEquals(1, qa117.numSimilarGroups(strs));
    }

    @Test
    public void numSimilarGroups_AllStringsSimilar_ReturnsOne() {
        String[] strs = {"abc", "acb", "bac", "bca", "cab", "cba"};
        assertEquals(1, qa117.numSimilarGroups(strs));
    }

    @Test
    public void numSimilarGroups_NoStringsSimilar_ReturnsLength() {
        String[] strs = {"abc", "def", "ghi"};
        assertEquals(3, qa117.numSimilarGroups(strs));
    }

    @Test
    public void numSimilarGroups_MixedSimilarity_ReturnsCorrectGroups() {
        String[] strs = {"abc", "acb", "bac", "bca", "xyz", "zyx"};
        assertEquals(2, qa117.numSimilarGroups(strs));
    }

    @Test
    public void numSimilarGroups_SomeStringsSimilar_ReturnsCorrectGroups() {
        String[] strs = {"abc", "acb", "xyz", "zyx", "bac"};
        assertEquals(2, qa117.numSimilarGroups(strs));
    }
}
