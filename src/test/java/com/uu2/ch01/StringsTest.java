package com.uu2.ch01;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsTest {

    private Strings strings;

    @BeforeEach
    public void setUp() {
        strings = new Strings();
    }

    @Test
    public void maxProduct_EmptyArray_ReturnsZero() {
        String[] words = {};
        assertEquals(0, strings.maxProduct(words));
    }

    @Test
    public void maxProduct_SingleWord_ReturnsZero() {
        String[] words = {"abc"};
        assertEquals(0, strings.maxProduct(words));
    }

    @Test
    public void maxProduct_NoCommonCharacters_ReturnsMaxProduct() {
        String[] words = {"abc", "def", "ghi"};
        assertEquals(9, strings.maxProduct(words)); // "abc" * "ghi" = 3 * 3 = 9
    }

    @Test
    public void maxProduct_AllCommonCharacters_ReturnsZero() {
        String[] words = {"abc", "bcd", "cde"};
        assertEquals(0, strings.maxProduct(words));
    }

    @Test
    public void maxProduct_MixedWords_ReturnsMaxProduct() {
        String[] words = {"abc", "de", "fgh", "ij"};
        assertEquals(9, strings.maxProduct(words)); // "abc" * "fgh" = 3 * 2 = 6
    }

    @Test
    public void maxProduct_DifferentLengths_ReturnsMaxProduct() {
        String[] words = {"a", "ab", "abc", "abcd"};
        assertEquals(0, strings.maxProduct(words)); // "ab" * "abcd" = 2 * 4 = 8
    }
}
