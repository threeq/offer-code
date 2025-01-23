package com.uu2.ch14;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA94Test {

    private QA94 qa94;

    @BeforeEach
    public void setUp() {
        qa94 = new QA94();
    }

    @Test
    public void minCut_EmptyString_ReturnsZero() {
        assertEquals(0, qa94.minCut(""));
    }

    @Test
    public void minCut_SingleCharacter_ReturnsZero() {
        assertEquals(0, qa94.minCut("a"));
    }

    @Test
    public void minCut_PalindromeString_ReturnsZero() {
        assertEquals(0, qa94.minCut("racecar"));
    }

    @Test
    public void minCut_NonPalindromeString_ReturnsCorrectCuts() {
        assertEquals(1, qa94.minCut("aab"));
        assertEquals(1, qa94.minCut("abab"));
        assertEquals(1, qa94.minCut("aabb"));
    }

    @Test
    public void minCut_MixedString_ReturnsCorrectCuts() {
        assertEquals(2, qa94.minCut("abbaab"));
        assertEquals(4, qa94.minCut("abcde"));
    }
}
