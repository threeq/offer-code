package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA106Test {

    private QA106 qa106;

    @BeforeEach
    public void setUp() {
        qa106 = new QA106();
    }

    @Test
    public void isBipartite_EmptyGraph_ShouldReturnTrue() {
        int[][] graph = {};
        assertTrue(qa106.isBipartite(graph));
    }

    @Test
    public void isBipartite_SingleVertex_ShouldReturnTrue() {
        int[][] graph = {{}};
        assertTrue(qa106.isBipartite(graph));
    }

    @Test
    public void isBipartite_TwoVerticesNoEdge_ShouldReturnTrue() {
        int[][] graph = {{}, {}};
        assertTrue(qa106.isBipartite(graph));
    }

    @Test
    public void isBipartite_TwoVerticesWithEdge_ShouldReturnTrue() {
        int[][] graph = {{1}, {0}};
        assertTrue(qa106.isBipartite(graph));
    }

    @Test
    public void isBipartite_EvenCycle_ShouldReturnTrue() {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        assertTrue(qa106.isBipartite(graph));
    }

    @Test
    public void isBipartite_OddCycle_ShouldReturnFalse() {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        assertFalse(qa106.isBipartite(graph));
    }

    @Test
    public void isBipartite_CompleteBipartite_ShouldReturnTrue() {
        int[][] graph = {{1, 2}, {0}, {0}};
        assertTrue(qa106.isBipartite(graph));
    }

    @Test
    public void isBipartite_K33_ShouldReturnTrue() {
        int[][] graph = {{1, 2, 3}, {0, 4, 5}, {0, 4, 5}, {0, 4, 5}, {1, 2, 3}, {1, 2, 3}};
        assertTrue(qa106.isBipartite(graph));
    }

    @Test
    public void isBipartite_K3_ShouldReturnFalse() {
        int[][] graph = {{1, 2}, {0, 2}, {0, 1}};
        assertFalse(qa106.isBipartite(graph));
    }
}
