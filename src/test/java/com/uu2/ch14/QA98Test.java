package com.uu2.ch14;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA98Test {

    private QA98 qa98;

    @BeforeEach
    public void setUp() {
        qa98 = new QA98();
    }

    @Test
    public void uniquePaths_1x1Grid_Returns1() {
        assertEquals(1, qa98.uniquePaths(1, 1));
    }

    @Test
    public void uniquePaths_1x2Grid_Returns1() {
        assertEquals(1, qa98.uniquePaths(1, 2));
    }

    @Test
    public void uniquePaths_2x1Grid_Returns1() {
        assertEquals(1, qa98.uniquePaths(2, 1));
    }

    @Test
    public void uniquePaths_2x2Grid_Returns2() {
        assertEquals(2, qa98.uniquePaths(2, 2));
    }

    @Test
    public void uniquePaths_3x3Grid_Returns6() {
        assertEquals(6, qa98.uniquePaths(3, 3));
    }

    @Test
    public void uniquePaths_3x2Grid_Returns3() {
        assertEquals(3, qa98.uniquePaths(3, 2));
    }

    @Test
    public void uniquePaths_10x10Grid_ReturnsCorrectValue() {
        assertEquals(48620, qa98.uniquePaths(10, 10));
    }

    @Test
    public void uniquePaths2_1x1Grid_Returns1() {
        assertEquals(1, qa98.uniquePaths2(1, 1));
    }

    @Test
    public void uniquePaths2_1x2Grid_Returns1() {
        assertEquals(1, qa98.uniquePaths2(1, 2));
    }

    @Test
    public void uniquePaths2_2x1Grid_Returns1() {
        assertEquals(1, qa98.uniquePaths2(2, 1));
    }

    @Test
    public void uniquePaths2_2x2Grid_Returns2() {
        assertEquals(2, qa98.uniquePaths2(2, 2));
    }

    @Test
    public void uniquePaths2_3x3Grid_Returns6() {
        assertEquals(6, qa98.uniquePaths2(3, 3));
    }

    @Test
    public void uniquePaths2_3x2Grid_Returns3() {
        assertEquals(3, qa98.uniquePaths2(3, 2));
    }

    @Test
    public void uniquePaths2_10x10Grid_ReturnsCorrectValue() {
        assertEquals(48620, qa98.uniquePaths2(10, 10));
    }

    @Test
    public void uniquePaths2_20x20Grid_ReturnsCorrectValue() {
        assertEquals(985525432, qa98.uniquePaths2(20, 20));
    }

    @Test
    public void uniquePaths3_1x1Grid_Returns1() {
        assertEquals(1, qa98.uniquePaths3(1, 1));
    }

    @Test
    public void uniquePaths3_1x2Grid_Returns1() {
        assertEquals(1, qa98.uniquePaths3(1, 2));
    }

    @Test
    public void uniquePaths3_2x1Grid_Returns1() {
        assertEquals(1, qa98.uniquePaths3(2, 1));
    }

    @Test
    public void uniquePaths3_2x2Grid_Returns2() {
        assertEquals(2, qa98.uniquePaths3(2, 2));
    }

    @Test
    public void uniquePaths3_3x3Grid_Returns6() {
        assertEquals(6, qa98.uniquePaths3(3, 3));
    }

    @Test
    public void uniquePaths3_3x2Grid_Returns3() {
        assertEquals(3, qa98.uniquePaths3(3, 2));
    }

    @Test
    public void uniquePaths3_10x10Grid_ReturnsCorrectValue() {
        assertEquals(48620, qa98.uniquePaths3(10, 10));
    }
}
