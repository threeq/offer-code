package com.uu2.ch13;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA86Test {

    private QA86 qa86;

    @BeforeEach
    public void setUp() {
        qa86 = new QA86();
    }

    @Test
    public void partition_EmptyString_ReturnsEmptyList() {
        List<List<String>> result = qa86.partition("");
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void partition_SingleCharacter_ReturnsSingleCharacterList() {
        List<List<String>> result = qa86.partition("a");
        assertEquals(Collections.singletonList(Collections.singletonList("a")), result);
    }

    @Test
    public void partition_PalindromeString_ReturnsFullString() {
        List<List<String>> result = qa86.partition("racecar");
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("r", "a", "c", "e", "c", "a", "r"),
                Arrays.asList("r", "a", "cec", "a", "r"),
                Arrays.asList("r", "aceca", "r"),
                Arrays.asList("racecar")
        );
        assertEquals(expected, result);
    }

    @Test
    public void partition_NonPalindromeString_ReturnsAllPalindromicPartitions() {
        List<List<String>> result = qa86.partition("aab");
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "a", "b"),
                Arrays.asList("aa", "b")
        );
        assertEquals(expected, result);
    }

    @Test
    public void partition_MixedString_ReturnsAllPalindromicPartitions() {
        List<List<String>> result = qa86.partition("aabba");
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "a", "b", "b", "a"),
                Arrays.asList("a", "a", "bb", "a"),
                Arrays.asList("a", "abba"),
                Arrays.asList("aa", "b", "b", "a"),
                Arrays.asList("aa", "bb", "a")
        );
        assertEquals(expected, result);
    }
}
