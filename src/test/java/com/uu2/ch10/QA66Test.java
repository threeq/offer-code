package com.uu2.ch10;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA66Test {

    private QA66 qa66;

    @BeforeEach
    public void setUp() {
        qa66 = new QA66();
    }

    @Test
    public void sum_EmptyPrefix_ReturnsTotalSum() {
        qa66.trie.insert("apple").val = 3;
        qa66.trie.insert("app").val = 5;
        qa66.trie.insert("apricot").val = 2;
        assertEquals(10, qa66.sum(""));
    }

    @Test
    public void sum_PrefixDoesNotExist_ReturnsZero() {
        qa66.trie.insert("apple").val = 3;
        qa66.trie.insert("app").val = 5;
        assertEquals(0, qa66.sum("xyz"));
    }

    @Test
    public void sum_PrefixExists_ReturnsSumOfWordsWithPrefix() {
        qa66.trie.insert("apple").val = 3;
        qa66.trie.insert("app").val = 5;
        qa66.trie.insert("apricot").val = 2;
        assertEquals(10, qa66.sum("ap"));
    }

    @Test
    public void sum_PrefixIsPartOfWord_ReturnsSumOfWordsWithPrefix() {
        qa66.trie.insert("apple").val = 3;
        qa66.trie.insert("app").val = 5;
        qa66.trie.insert("apricot").val = 2;
        assertEquals(3, qa66.sum("appl"));
    }

    @Test
    public void sum_PrefixIsCompleteWord_ReturnsSumIncludingWord() {
        qa66.trie.insert("apple").val = 3;
        qa66.trie.insert("app").val = 5;
        qa66.trie.insert("apricot").val = 2;
        assertEquals(3, qa66.sum("apple"));
    }
}
