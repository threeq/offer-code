package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA116Test {

    private QA116 qa116;

    @BeforeEach
    public void setUp() {
        qa116 = new QA116();
    }

    @Test
    public void findCircleNum_EmptyMatrix_ReturnsZero() {
        int[][] M = {};
        assertEquals(0, qa116.findCircleNum(M));
    }

    @Test
    public void findCircleNum_SinglePerson_ReturnsOne() {
        int[][] M = {{1}};
        assertEquals(1, qa116.findCircleNum(M));
    }

    @Test
    public void findCircleNum_AllConnected_ReturnsOne() {
        int[][] M = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        assertEquals(1, qa116.findCircleNum(M));
    }

    @Test
    public void findCircleNum_NoConnections_ReturnsN() {
        int[][] M = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        assertEquals(3, qa116.findCircleNum(M));
    }

    @Test
    public void findCircleNum_MultipleDisjointCircles_ReturnsCorrectCount() {
        int[][] M = {
            {1, 0, 0, 0},
            {0, 1, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 1}
        };
        assertEquals(3, qa116.findCircleNum(M));
    }

    @Test
    public void findCircleNum_MixedConnections_ReturnsCorrectCount() {
        int[][] M = {
            {1, 1, 0, 0},
            {1, 1, 0, 0},
            {0, 0, 1, 1},
            {0, 0, 1, 1}
        };
        assertEquals(2, qa116.findCircleNum(M));
    }
}
