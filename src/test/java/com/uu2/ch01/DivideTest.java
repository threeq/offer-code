package com.uu2.ch01;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTest {

    @Test
    public void divide_IntegerMinValueDividedByMinusOne_ReturnsIntegerMaxValue() {
        assertEquals(Integer.MAX_VALUE, Divide.divide(Integer.MIN_VALUE, -1));
    }

    @Test
    public void divide_PositiveDividendAndPositiveDivisor_ReturnsCorrectQuotient() {
        assertEquals(2, Divide.divide(10, 5));
    }

    @Test
    public void divide_NegativeDividendAndPositiveDivisor_ReturnsCorrectQuotient() {
        assertEquals(-2, Divide.divide(-10, 5));
    }

    @Test
    public void divide_PositiveDividendAndNegativeDivisor_ReturnsCorrectQuotient() {
        assertEquals(-2, Divide.divide(10, -5));
    }

    @Test
    public void divide_NegativeDividendAndNegativeDivisor_ReturnsCorrectQuotient() {
        assertEquals(2, Divide.divide(-10, -5));
    }

    @Test
    public void divide_ZeroDividend_ReturnsZero() {
        assertEquals(0, Divide.divide(0, 5));
    }

    @Test
    public void divide_DivisorIsOne_ReturnsDividend() {
        assertEquals(10, Divide.divide(10, 1));
    }

    @Test
    public void divide_DivisorIsMinusOne_ReturnsNegatedDividend() {
        assertEquals(-10, Divide.divide(10, -1));
    }

    @Test
    public void divide_IntegerMaxValueDividedByIntegerMaxValue_ReturnsOne() {
        assertEquals(1, Divide.divide(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void divide_IntegerMinValueDividedByIntegerMinValue_ReturnsOne() {
        assertEquals(1, Divide.divide(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void divide_IntegerMaxValueDividedByIntegerMinValue_ReturnsZero() {
        assertEquals(0, Divide.divide(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void divide_IntegerMinValueDividedByIntegerMaxValue_ReturnsMinusOne() {
        assertEquals(-1, Divide.divide(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}