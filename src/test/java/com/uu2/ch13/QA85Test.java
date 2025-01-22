package com.uu2.ch13;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA85Test {

    private QA85 qa85;

    @BeforeEach
    public void setUp() {
        qa85 = new QA85();
    }

    @Test
    public void generateParenthesis_N0_ShouldReturnEmptyString() {
        List<String> result = qa85.generateParenthesis(0);
        assertEquals(1, result.size());
        assertEquals("", result.get(0));
    }

    @Test
    public void generateParenthesis_N1_ShouldReturnSinglePair() {
        List<String> result = qa85.generateParenthesis(1);
        assertEquals(1, result.size());
        assertEquals("()", result.get(0));
    }

    @Test
    public void generateParenthesis_N2_ShouldReturnTwoCombinations() {
        List<String> result = qa85.generateParenthesis(2);
        assertEquals(2, result.size());
        assertEquals("()()", result.get(1));
        assertEquals("(())", result.get(0));
    }

    @Test
    public void generateParenthesis_N3_ShouldReturnFiveCombinations() {
        List<String> result = qa85.generateParenthesis(3);
        assertEquals(5, result.size());
        assertEquals("((()))", result.get(0));
        assertEquals("(()())", result.get(1));
        assertEquals("(())()", result.get(2));
        assertEquals("()(())", result.get(3));
        assertEquals("()()()", result.get(4));
    }

    @Test
    public void generateParenthesis_N4_ShouldReturnAllCombinations() {
        List<String> result = qa85.generateParenthesis(4);
        assertEquals(14, result.size());
        assertEquals("(((())))", result.get(0));
        assertEquals("((()()))", result.get(1));
        assertEquals("((())())", result.get(2));
        assertEquals("((()))()", result.get(3));
        assertEquals("(()(()))", result.get(4));
        assertEquals("(()()())", result.get(5));
        assertEquals("(()())()", result.get(6));
        assertEquals("(())(())", result.get(7));
        assertEquals("(())()()", result.get(8));
        assertEquals("()((()))", result.get(9));
        assertEquals("()(()())", result.get(10));
        assertEquals("()(())()", result.get(11));
        assertEquals("()()(())", result.get(12));
        assertEquals("()()()()", result.get(13));
    }
}
