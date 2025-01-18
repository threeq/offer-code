package com.uu2.ch06;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QA36Test {

    private QA36 qa36;

    @BeforeEach
    public void setUp() {
        qa36 = new QA36();
    }

    @Test
    public void evalRPN_SimpleAddition_ReturnsCorrectResult() {
        String[] tokens = {"2", "1", "+"};
        assertEquals(3, qa36.evalRPN(tokens));
    }

    @Test
    public void evalRPN_SimpleSubtraction_ReturnsCorrectResult() {
        String[] tokens = {"3", "1", "-"};
        assertEquals(2, qa36.evalRPN(tokens));
    }

    @Test
    public void evalRPN_SimpleMultiplication_ReturnsCorrectResult() {
        String[] tokens = {"2", "3", "*"};
        assertEquals(6, qa36.evalRPN(tokens));
    }

    @Test
    public void evalRPN_SimpleDivision_ReturnsCorrectResult() {
        String[] tokens = {"6", "3", "/"};
        assertEquals(2, qa36.evalRPN(tokens));
    }

    @Test
    public void evalRPN_ComplexExpression_ReturnsCorrectResult() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        assertEquals(9, qa36.evalRPN(tokens));
    }

    @Test
    public void evalRPN_InvalidExpression_ThrowsException() {
        String[] tokens = {"+"};
        assertThrows(EmptyStackException.class, () -> qa36.evalRPN(tokens));
    }

    @Test
    public void evalRPN_EmptyExpression_ThrowsException() {
        String[] tokens = {};
        assertThrows(EmptyStackException.class, () -> qa36.evalRPN(tokens));
    }

    @Test
    public void evalRPN_SingleOperand_ReturnsOperand() {
        String[] tokens = {"42"};
        assertEquals(42, qa36.evalRPN(tokens));
    }
}
