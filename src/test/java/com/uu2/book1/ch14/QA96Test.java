package com.uu2.book1.ch14;


import com.uu2.book1.ch14.QA96;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA96Test {

    private QA96 qa96;

    @BeforeEach
    public void setUp() {
        qa96 = new QA96();
    }

    @Test
    public void interleave_EmptyStrings_True() {
        assertTrue(qa96.interleave("", "", ""));
    }

    @Test
    public void interleave_S1EmptyS2EqualsS3_True() {
        assertTrue(qa96.interleave("", "abc", "abc"));
    }

    @Test
    public void interleave_S2EmptyS1EqualsS3_True() {
        assertTrue(qa96.interleave("abc", "", "abc"));
    }

    @Test
    public void interleave_S1AndS2Interleave_True() {
        assertTrue(qa96.interleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void interleave_S1AndS2DoNotInterleave_False() {
        assertFalse(qa96.interleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    public void interleave_DifferentLengths_False() {
        assertFalse(qa96.interleave("abc", "def", "abcdefg"));
    }

    @Test
    public void interleave2_EmptyStrings_True() {
        assertTrue(qa96.interleave2("", "", ""));
    }

    @Test
    public void interleave2_S1EmptyS2EqualsS3_True() {
        assertTrue(qa96.interleave2("", "abc", "abc"));
    }

    @Test
    public void interleave2_S2EmptyS1EqualsS3_True() {
        assertTrue(qa96.interleave2("abc", "", "abc"));
    }

    @Test
    public void interleave2_S1AndS2Interleave_True() {
        assertTrue(qa96.interleave2("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void interleave2_S1AndS2DoNotInterleave_False() {
        assertFalse(qa96.interleave2("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    public void interleave2_DifferentLengths_False() {
        assertFalse(qa96.interleave2("abc", "def", "abcdefg"));
    }

    @Test
    public void interleave2_S1ShorterThanS2_True() {
        assertFalse(qa96.interleave2("abc", "ab", "aabc"));
    }

    @Test
    public void interleave2_S1ShorterThanS2_False() {
        assertFalse(qa96.interleave2("abc", "ab", "abac"));
    }
}
