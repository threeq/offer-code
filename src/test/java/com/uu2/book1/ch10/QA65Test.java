package com.uu2.book1.ch10;


import com.uu2.book1.ch10.QA65;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA65Test {

    private QA65 qa65;

    @BeforeEach
    public void setUp() {
        qa65 = new QA65();
    }

    @Test
    public void minimumLengthEncoding_EmptyInput_ReturnsZero() {
        String[] words = {};
        int result = qa65.minimumLengthEncoding(words);
        assertEquals(1, result);
    }

    @Test
    public void minimumLengthEncoding_SingleWord_ReturnsWordLengthPlusOne() {
        String[] words = {"time"};
        int result = qa65.minimumLengthEncoding(words);
        assertEquals(5, result); // "time#" = 5
    }

    @Test
    public void minimumLengthEncoding_NoSharedSuffix_ReturnsSumOfWordLengthsPlusOne() {
        String[] words = {"time", "me", "bell"};
        int result = qa65.minimumLengthEncoding(words);
        assertEquals(10, result); // "time#bell#me#"
    }

    @Test
    public void minimumLengthEncoding_SharedSuffix_ReturnsCorrectEncodingLength() {
        String[] words = {"time", "me", "bell", "tell"};
        int result = qa65.minimumLengthEncoding(words);
        assertEquals(15, result); // "time#bell#tell#"
    }

    @Test
    public void minimumLengthEncoding_DuplicateWords_IgnoresDuplicates() {
        String[] words = {"time", "time", "me", "bell"};
        int result = qa65.minimumLengthEncoding(words);
        assertEquals(10, result); // "time#bell#me#"
    }

    @Test
    public void minimumLengthEncoding_MixedWords_ReturnsCorrectEncodingLength() {
        String[] words = {"time", "me", "bell", "tell", "tim"};
        int result = qa65.minimumLengthEncoding(words);
        assertEquals(19, result); // "time#bell#tell#tim#"
    }
}
