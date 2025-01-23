package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA108Test {

    private QA108 qa108;

    @BeforeEach
    public void setUp() {
        qa108 = new QA108();
    }

    @Test
    public void ladderLength_BeginWordEqualsEndWord_Returns1() {
        String beginWord = "hit";
        String endWord = "hit";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int result = qa108.ladderLength(beginWord, endWord, wordList);
        assertEquals(1, result);
    }

    @Test
    public void ladderLength_EndWordNotInWordList_Returns0() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        int result = qa108.ladderLength(beginWord, endWord, wordList);
        assertEquals(0, result);
    }

    @Test
    public void ladderLength_EndWordAccessible_ReturnsLength() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int result = qa108.ladderLength(beginWord, endWord, wordList);
        assertEquals(5, result);
    }

    @Test
    public void ladderLength_EndWordInaccessible_Returns0() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cot");
        int result = qa108.ladderLength(beginWord, endWord, wordList);
        assertEquals(0, result);
    }

    @Test
    public void ladderLength_EmptyWordList_Returns0() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Collections.emptyList();
        int result = qa108.ladderLength(beginWord, endWord, wordList);
        assertEquals(0, result);
    }

    @Test
    public void ladderLength2_BeginWordEqualsEndWord_Returns1() {
        String beginWord = "hit";
        String endWord = "hit";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int result = qa108.ladderLength2(beginWord, endWord, wordList);
        assertEquals(0, result);
    }

    @Test
    public void ladderLength2_EndWordNotInWordList_Returns0() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        int result = qa108.ladderLength2(beginWord, endWord, wordList);
        assertEquals(0, result);
    }

    @Test
    public void ladderLength2_EndWordAccessible_ReturnsLength() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int result = qa108.ladderLength2(beginWord, endWord, wordList);
        assertEquals(5, result);
    }

    @Test
    public void ladderLength2_EndWordInaccessible_Returns0() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cot");
        int result = qa108.ladderLength2(beginWord, endWord, wordList);
        assertEquals(0, result);
    }

    @Test
    public void ladderLength2_EmptyWordList_Returns0() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Collections.emptyList();
        int result = qa108.ladderLength2(beginWord, endWord, wordList);
        assertEquals(0, result);
    }

    @Test
    public void ladderLength2_MultiplePaths_ReturnsShortest() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog", "cot");
        int result = qa108.ladderLength2(beginWord, endWord, wordList);
        assertEquals(4, result);
    }
}
