package com.uu2.book1.ch05;


import com.uu2.book1.ch05.QA32;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA32Test {

    private QA32 qa32;

    @BeforeEach
    public void setUp() {
        qa32 = new QA32();
    }

    @Test
    public void isAnagram_StringsAreAnagrams_ReturnsTrue() {
        assertTrue(qa32.isAnagram("listen", "silent"));
        assertTrue(qa32.isAnagramASCII("listen", "silent"));
    }

    @Test
    public void isAnagram_StringsAreNotAnagrams_ReturnsFalse() {
        assertFalse(qa32.isAnagram("hello", "world"));
        assertFalse(qa32.isAnagramASCII("hello", "world"));
    }

    @Test
    public void isAnagram_DifferentLengths_ReturnsFalse() {
        assertFalse(qa32.isAnagram("hello", "worlds"));
        assertFalse(qa32.isAnagramASCII("hello", "worlds"));
    }

    @Test
    public void isAnagram_EmptyStrings_ReturnsTrue() {
        assertTrue(qa32.isAnagram("", ""));
        assertTrue(qa32.isAnagramASCII("", ""));
    }

    @Test
    public void isAnagram_SingleCharacterSame_ReturnsTrue() {
        assertTrue(qa32.isAnagram("a", "a"));
        assertTrue(qa32.isAnagramASCII("a", "a"));
    }

    @Test
    public void isAnagram_SingleCharacterDifferent_ReturnsFalse() {
        assertFalse(qa32.isAnagram("a", "b"));
        assertFalse(qa32.isAnagramASCII("a", "b"));
    }
}
