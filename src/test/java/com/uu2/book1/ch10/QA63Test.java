package com.uu2.book1.ch10;


import com.uu2.book1.ch10.QA63;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA63Test {

    private QA63 qa63;

    @BeforeEach
    public void setUp() {
        qa63 = new QA63();
    }

    @Test
    public void replaceWords_EmptyDict_ReturnsSameSentence() {
        List<String> dict = Collections.emptyList();
        String sentence = "the quick brown fox";
        String result = qa63.replaceWords(dict, sentence);
        assertEquals("the quick brown fox", result);
    }

    @Test
    public void replaceWords_EmptySentence_ReturnsEmptyString() {
        List<String> dict = Arrays.asList("cat", "bat", "rat");
        String sentence = "";
        String result = qa63.replaceWords(dict, sentence);
        assertEquals("", result);
    }

    @Test
    public void replaceWords_NoPrefixInSentence_ReturnsSameSentence() {
        List<String> dict = Arrays.asList("cat", "bat", "rat");
        String sentence = "the quick brown fox";
        String result = qa63.replaceWords(dict, sentence);
        assertEquals("the quick brown fox", result);
    }

    @Test
    public void replaceWords_PrefixExists_ReplacesWithPrefix() {
        List<String> dict = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        String result = qa63.replaceWords(dict, sentence);
        assertEquals("the cat was rat by the bat", result);
    }

    @Test
    public void replaceWords_MultiplePrefixes_UsesShortestPrefix() {
        List<String> dict = Arrays.asList("cat", "ca", "bat");
        String sentence = "cattle";
        String result = qa63.replaceWords(dict, sentence);
        assertEquals("ca", result);
    }

    @Test
    public void replaceWords_WordMatchesDictWord_ReplacesWithDictWord() {
        List<String> dict = Arrays.asList("cat", "bat", "rat");
        String sentence = "cat";
        String result = qa63.replaceWords(dict, sentence);
        assertEquals("cat", result);
    }
}
