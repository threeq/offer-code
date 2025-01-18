package com.uu2.ch06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA40Test {

    private QA40 qa40;

    @BeforeEach
    public void setUp() {
        qa40 = new QA40();
    }

    @Test
    public void maximalRectangle_NullMatrix_ReturnsZero() {
        char[][] matrix = null;
        assertEquals(0, qa40.maximalRectangle(matrix));
    }

    @Test
    public void maximalRectangle_EmptyMatrix_ReturnsZero() {
        char[][] matrix = new char[0][0];
        assertEquals(0, qa40.maximalRectangle(matrix));
    }

    @Test
    public void maximalRectangle_SingleRowMatrix_ReturnsCorrectArea() {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'}
        };
        assertEquals(1, qa40.maximalRectangle(matrix));
    }

    @Test
    public void maximalRectangle_SingleColumnMatrix_ReturnsCorrectArea() {
        char[][] matrix = {
            {'1'},
            {'0'},
            {'1'}
        };
        assertEquals(1, qa40.maximalRectangle(matrix));
    }

    @Test
    public void maximalRectangle_MixedMatrix_ReturnsCorrectArea() {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        assertEquals(6, qa40.maximalRectangle(matrix));
    }

    @Test
    public void maximalRectangle_AllZeroMatrix_ReturnsZero() {
        char[][] matrix = {
            {'0', '0', '0'},
            {'0', '0', '0'}
        };
        assertEquals(0, qa40.maximalRectangle(matrix));
    }

    @Test
    public void maximalRectangle_AllOneMatrix_ReturnsCorrectArea() {
        char[][] matrix = {
            {'1', '1'},
            {'1', '1'}
        };
        assertEquals(4, qa40.maximalRectangle(matrix));
    }
}
