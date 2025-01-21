package com.uu2.ch10;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTest {

    private Trie trie;

    @BeforeEach
    public void setUp() {
        trie = new Trie();
    }

    @Test
    public void insertSearchWordExists_ReturnsTrue() {
        trie.insert("apple");
        assertTrue(trie.search("apple"));
    }

    @Test
    public void insertSearchWordDoesNotExist_ReturnsFalse() {
        trie.insert("apple");
        assertFalse(trie.search("app"));
    }

    @Test
    public void insertStartsWithPrefixExists_ReturnsTrue() {
        trie.insert("apple");
        assertTrue(trie.startsWith("app"));
    }

    @Test
    public void insertStartsWithPrefixDoesNotExist_ReturnsFalse() {
        trie.insert("apple");
        assertFalse(trie.startsWith("bat"));
    }

    @Test
    public void insertSearchWordWithDifferentCase_ReturnsFalse() {
        trie.insert("apple");
        assertFalse(trie.search("APPLE"));
    }

    @Test
    public void insertStartsWithWord_ReturnsTrue() {
        trie.insert("apple");
        assertTrue(trie.startsWith("apple"));
    }

    @Test
    public void insertSearchWordWithExtraCharacters_ReturnsFalse() {
        trie.insert("apple");
        assertFalse(trie.search("apples"));
    }

    @Test
    public void insertStartsWithLongerPrefix_ReturnsFalse() {
        trie.insert("apple");
        assertFalse(trie.startsWith("apples"));
    }
}
