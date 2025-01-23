package com.uu2.book1.ch05;


import com.uu2.book1.ch05.QA33;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA33Test {

    private QA33 qa33;

    @BeforeEach
    public void setUp() {
        qa33 = new QA33();
    }

    @Test
    public void groupAnagrams_EmptyInput_ReturnsEmptyList() {
        String[] input = {};
        List<List<String>> result = qa33.groupAnagrams(input);
        assertEquals(0, result.size());
    }

    @Test
    public void groupAnagrams_SingleElement_ReturnsSingleList() {
        String[] input = {"a"};
        List<List<String>> result = qa33.groupAnagrams(input);
        assertEquals(1, result.size());
        assertEquals(Arrays.asList("a"), result.get(0));
    }

    @Test
    public void groupAnagrams_NoAnagrams_ReturnsIndividualLists() {
        String[] input = {"abc", "def", "ghi"};
        List<List<String>> result = qa33.groupAnagrams(input);
        assertEquals(3, result.size());
        assertEquals(Arrays.asList("abc"), result.get(0));
        assertEquals(Arrays.asList("def"), result.get(1));
        assertEquals(Arrays.asList("ghi"), result.get(2));
    }

    @Test
    public void groupAnagrams_AllAnagrams_ReturnsSingleList() {
        String[] input = {"abc", "bca", "cab"};
        List<List<String>> result = qa33.groupAnagrams(input);
        assertEquals(1, result.size());
        assertEquals(Arrays.asList("abc", "bca", "cab"), result.get(0));
    }

    @Test
    public void groupAnagrams_MixedInput_ReturnsGroupedAnagrams() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = qa33.groupAnagrams(input);
        assertEquals(3, result.size());
        assertEquals(Arrays.asList("eat", "tea", "ate"), result.get(0));
        assertEquals(Arrays.asList("tan", "nat"), result.get(2));
        assertEquals(Arrays.asList("bat"), result.get(1));
    }

    @Test
    public void groupAnagrams_CaseSensitive_ReturnsCaseSensitiveGroups() {
        String[] input = {"abc", "ABC", "aBc"};
        List<List<String>> result = qa33.groupAnagrams(input);
        assertEquals(3, result.size());
        assertEquals(Arrays.asList("abc"), result.get(1));
        assertEquals(Arrays.asList("ABC"), result.get(0));
        assertEquals(Arrays.asList("aBc"), result.get(2));
    }

    @Test
    public void groupAnagrams_SpecialCharacters_ReturnsSpecialCharacterGroups() {
        String[] input = {"!abc", "!bca", "!cab"};
        List<List<String>> result = qa33.groupAnagrams(input);
        assertEquals(1, result.size());
        assertEquals(Arrays.asList("!abc", "!bca", "!cab"), result.get(0));
    }
}
