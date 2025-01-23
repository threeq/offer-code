package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA114Test {

    private QA114 qa114;

    @BeforeEach
    public void setUp() {
        qa114 = new QA114();
    }

    @Test
    public void alienOrder_EmptyInput_ReturnsEmptyString() {
        String[] words = {};
        assertEquals("", qa114.alienOrder(words));
    }

    @Test
    public void alienOrder_SingleWord_ReturnsWord() {
        String[] words = {"a"};
        assertEquals("a", qa114.alienOrder(words));
    }

    @Test
    public void alienOrder_ValidOrder_ReturnsOrder() {
        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
        assertEquals("wertf", qa114.alienOrder(words));
    }

    @Test
    public void alienOrder_InvalidOrder_ReturnsEmptyString() {
        String[] words = {"z", "x", "z"};
        assertEquals("", qa114.alienOrder(words));
    }

    @Test
    public void alienOrder_PrefixWord_ReturnsEmptyString() {
        String[] words = {"abc", "ab"};
        assertEquals("", qa114.alienOrder(words));
    }

    @Test
    public void alienOrder_AlphabetSize1_ReturnsAlphabet() {
        String[] words = {"a"};
        assertEquals("a", qa114.alienOrder(words));
    }

    @Test
    public void alienOrder_AlphabetSize2_ReturnsOrder() {
        String[] words = {"ba", "ab"};
        assertEquals("ba", qa114.alienOrder(words));
    }

    @Test
    public void alienOrder_AlphabetSize3_ReturnsOrder() {
        String[] words = {"zy", "zx"};
        assertEquals("yzx", qa114.alienOrder(words));
    }

    @Test
    public void alienOrder_DifferentAlphabets_ReturnsOrder() {
        String[] words = {"z", "x", "a", "w", "er", "ett", "rftt"};
        assertEquals("fzxawert", qa114.alienOrder(words));
    }

    @Test
    public void alienOrder_DifferentLengthWords_ReturnsOrder() {
        String[] words = {"a", "b", "ca", "cc"};
        assertEquals("abc", qa114.alienOrder(words));
    }
}
