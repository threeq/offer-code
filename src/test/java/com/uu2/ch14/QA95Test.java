package com.uu2.ch14;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA95Test {

    private QA95 qa95;

    @BeforeEach
    public void setUp() {
        qa95 = new QA95();
    }

    @Test
    public void longestCommonSub_EmptyStrings_ReturnsZero() {
        assertEquals(0, qa95.longestCommonSub("", ""));
    }

    @Test
    public void longestCommonSub_OneEmptyString_ReturnsZero() {
        assertEquals(0, qa95.longestCommonSub("abc", ""));
        assertEquals(0, qa95.longestCommonSub("", "abc"));
    }

    @Test
    public void longestCommonSub_IdenticalStrings_ReturnsLength() {
        assertEquals(3, qa95.longestCommonSub("abc", "abc"));
    }

    @Test
    public void longestCommonSub_NoCommonCharacters_ReturnsZero() {
        assertEquals(0, qa95.longestCommonSub("abc", "xyz"));
    }

    @Test
    public void longestCommonSub_PartialCommonCharacters_ReturnsCorrectLength() {
        assertEquals(2, qa95.longestCommonSub("abc", "abx"));
    }

    @Test
    public void longestCommonSub_DifferentLengths_ReturnsCorrectLength() {
        assertEquals(2, qa95.longestCommonSub("abc", "axc"));
    }

    @Test
    public void longestCommonSub_SingleCharacterMatch_ReturnsOne() {
        assertEquals(1, qa95.longestCommonSub("abc", "xyzc"));
    }

    @Test
    public void longestCommonSub2_EmptyStrings_ReturnsZero() {
        assertEquals(0, qa95.longestCommonSub2("", ""));
    }

    @Test
    public void longestCommonSub2_OneEmptyString_ReturnsZero() {
        assertEquals(0, qa95.longestCommonSub2("abc", ""));
        assertEquals(0, qa95.longestCommonSub2("", "abc"));
    }

    @Test
    public void longestCommonSub2_IdenticalStrings_ReturnsLength() {
        assertEquals(3, qa95.longestCommonSub2("abc", "abc"));
    }

    @Test
    public void longestCommonSub2_NoCommonCharacters_ReturnsZero() {
        assertEquals(0, qa95.longestCommonSub2("abc", "xyz"));
    }

    @Test
    public void longestCommonSub2_PartialCommonCharacters_ReturnsCorrectLength() {
        assertEquals(2, qa95.longestCommonSub2("abc", "abx"));
    }

    @Test
    public void longestCommonSub2_DifferentLengths_ReturnsCorrectLength() {
        assertEquals(2, qa95.longestCommonSub2("abc", "axc"));
    }

    @Test
    public void longestCommonSub2_SingleCharacterMatch_ReturnsOne() {
        assertEquals(1, qa95.longestCommonSub2("abc", "xyzc"));
    }

    @Test
    public void longestCommonSub3_EmptyStrings_ReturnsZero() {
        assertEquals(0, qa95.longestCommonSub3("", ""));
    }

    @Test
    public void longestCommonSub3_OneEmptyString_ReturnsZero() {
        assertEquals(0, qa95.longestCommonSub3("abc", ""));
        assertEquals(0, qa95.longestCommonSub3("", "abc"));
    }

    @Test
    public void longestCommonSub3_IdenticalStrings_ReturnsLength() {
        assertEquals(3, qa95.longestCommonSub3("abc", "abc"));
    }

    @Test
    public void longestCommonSub3_NoCommonCharacters_ReturnsZero() {
        assertEquals(0, qa95.longestCommonSub3("abc", "xyz"));
    }

    @Test
    public void longestCommonSub3_PartialCommonCharacters_ReturnsCorrectLength() {
        assertEquals(2, qa95.longestCommonSub3("abc", "abx"));
    }

    @Test
    public void longestCommonSub3_DifferentLengths_ReturnsCorrectLength() {
        assertEquals(2, qa95.longestCommonSub3("abc", "axc"));
    }

    @Test
    public void longestCommonSub3_SingleCharacterMatch_ReturnsOne() {
        assertEquals(1, qa95.longestCommonSub3("abc", "xyzc"));
    }
}
