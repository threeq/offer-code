package com.uu2.book1.ch14;


import com.uu2.book1.ch14.QA97;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA97Test {

    private QA97 qa97;

    @BeforeEach
    public void setUp() {
        qa97 = new QA97();
    }

    @Test
    public void numDistinct_EmptySAndT_Returns1() {
        assertEquals(1, qa97.numDistinct("", ""));
    }

    @Test
    public void numDistinct_EmptySNonEmptyT_Returns0() {
        assertEquals(0, qa97.numDistinct("", "a"));
    }

    @Test
    public void numDistinct_NonEmptySEmptyT_Returns1() {
        assertEquals(1, qa97.numDistinct("a", ""));
    }

    @Test
    public void numDistinct_SameString_Returns1() {
        assertEquals(1, qa97.numDistinct("abc", "abc"));
    }

    @Test
    public void numDistinct_SubsequenceExists_ReturnsCorrectCount() {
        assertEquals(3, qa97.numDistinct("rabbbit", "rabbit"));
    }

    @Test
    public void numDistinct_NoSubsequence_Returns0() {
        assertEquals(0, qa97.numDistinct("abc", "d"));
    }

    @Test
    public void numDistinct_MultipleOccurrences_ReturnsCorrectCount() {
        assertEquals(5, qa97.numDistinct("babgbag", "bag"));
    }

    @Test
    public void numDistinct2_EmptySAndT_Returns1() {
        assertEquals(1, qa97.numDistinct2("", ""));
    }

    @Test
    public void numDistinct2_EmptySNonEmptyT_Returns0() {
        assertEquals(0, qa97.numDistinct2("", "a"));
    }

    @Test
    public void numDistinct2_NonEmptySEmptyT_Returns1() {
        assertEquals(1, qa97.numDistinct2("a", ""));
    }

    @Test
    public void numDistinct2_SameString_Returns1() {
        assertEquals(1, qa97.numDistinct2("abc", "abc"));
    }

    @Test
    public void numDistinct2_SubsequenceExists_ReturnsCorrectCount() {
        assertEquals(3, qa97.numDistinct2("rabbbit", "rabbit"));
    }

    @Test
    public void numDistinct2_NoSubsequence_Returns0() {
        assertEquals(0, qa97.numDistinct2("abc", "d"));
    }

    @Test
    public void numDistinct2_MultipleOccurrences_ReturnsCorrectCount() {
        assertEquals(5, qa97.numDistinct2("babgbag", "bag"));
    }
}
