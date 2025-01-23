package com.uu2.book1.ch05;


import com.uu2.book1.ch05.QA34;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA34Test {

    private QA34 qa34;

    @BeforeEach
    public void setUp() {
        qa34 = new QA34();
    }

    @Test
    public void isAlienSorted_EmptyList_ReturnsTrue() {
        String[] words = {};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(qa34.isAlienSorted(words, order));
    }

    @Test
    public void isAlienSorted_SingleWord_ReturnsTrue() {
        String[] words = {"apple"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(qa34.isAlienSorted(words, order));
    }

    @Test
    public void isAlienSorted_TwoWordsInOrder_ReturnsTrue() {
        String[] words = {"apple", "banana"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(qa34.isAlienSorted(words, order));
    }

    @Test
    public void isAlienSorted_TwoWordsOutOfOrder_ReturnsFalse() {
        String[] words = {"banana", "apple"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertFalse(qa34.isAlienSorted(words, order));
    }

    @Test
    public void isAlienSorted_MultipleWordsInOrder_ReturnsTrue() {
        String[] words = {"apple", "banana", "cherry"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(qa34.isAlienSorted(words, order));
    }

    @Test
    public void isAlienSorted_MultipleWordsOutOfOrder_ReturnsFalse() {
        String[] words = {"apple", "cherry", "banana"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertFalse(qa34.isAlienSorted(words, order));
    }

    @Test
    public void isAlienSorted_DifferentLengthWordsInOrder_ReturnsTrue() {
        String[] words = {"app", "apple"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(qa34.isAlienSorted(words, order));
    }

    @Test
    public void isAlienSorted_DifferentLengthWordsOutOfOrder_ReturnsFalse() {
        String[] words = {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertFalse(qa34.isAlienSorted(words, order));
    }

    @Test
    public void isAlienSorted_EmptyStringInList_ReturnsTrue() {
        String[] words = {"", "apple"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(qa34.isAlienSorted(words, order));
    }

    @Test
    public void isAlienSorted_RepeatedWords_ReturnsTrue() {
        String[] words = {"apple", "apple"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(qa34.isAlienSorted(words, order));
    }
}
