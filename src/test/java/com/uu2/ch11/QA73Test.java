package com.uu2.ch11;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA73Test {

    private QA73 qa73;

    @BeforeEach
    public void setUp() {
        qa73 = new QA73();
    }

    @Test
    public void minEatingSpeed_EmptyPiles_ReturnsMinusOne() {
        int[] piles = {};
        int H = 5;
        int result = qa73.minEatingSpeed(piles, H);
        assertEquals(-1, result);
    }

    @Test
    public void minEatingSpeed_SinglePile_ReturnsCeilingOfDivision() {
        int[] piles = {10};
        int H = 3;
        int result = qa73.minEatingSpeed(piles, H);
        assertEquals(4, result);
    }

    @Test
    public void minEatingSpeed_MultiplePiles_ReturnsMinimumSpeed() {
        int[] piles = {3, 6, 7, 11};
        int H = 8;
        int result = qa73.minEatingSpeed(piles, H);
        assertEquals(4, result);
    }

    @Test
    public void minEatingSpeed_HEqualsPiles_ReturnsMaxPile() {
        int[] piles = {30, 11, 23, 4, 20};
        int H = 5;
        int result = qa73.minEatingSpeed(piles, H);
        assertEquals(30, result);
    }

    @Test
    public void minEatingSpeed_HGreaterThanPiles_ReturnsOne() {
        int[] piles = {30, 11, 23, 4, 20};
        int H = 11;
        int result = qa73.minEatingSpeed(piles, H);
        assertEquals(10, result);
    }
}
