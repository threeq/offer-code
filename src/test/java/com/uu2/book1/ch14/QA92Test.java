package com.uu2.book1.ch14;


import com.uu2.book1.ch14.QA92;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA92Test {

    private QA92 qa92;

    @BeforeEach
    public void setUp() {
        qa92 = new QA92();
    }

    @Test
    public void minFlips_EmptyString_ReturnsZero() {
        assertEquals(0, qa92.minFlips(""));
    }

    @Test
    public void minFlips_SingleCharacter_ReturnsZero() {
        assertEquals(0, qa92.minFlips("0"));
        assertEquals(0, qa92.minFlips("1"));
    }

    @Test
    public void minFlips_EvenLengthAlternatingString_ReturnsZero() {
        assertEquals(1, qa92.minFlips("0101"));
        assertEquals(2, qa92.minFlips("1010"));
    }

    @Test
    public void minFlips_EvenLengthNonAlternatingString_ReturnsCorrectValue() {
        assertEquals(0, qa92.minFlips("0000"));
        assertEquals(0, qa92.minFlips("1111"));
    }

    @Test
    public void minFlips_OddLengthAlternatingString_ReturnsZero() {
        assertEquals(2, qa92.minFlips("01010"));
        assertEquals(2, qa92.minFlips("10101"));
    }


    @Test
    public void minFlips_MixedCharacters_ReturnsCorrectValue() {
        assertEquals(0, qa92.minFlips("001"));
        assertEquals(1, qa92.minFlips("110"));
        assertEquals(1, qa92.minFlips("0101"));
    }
}