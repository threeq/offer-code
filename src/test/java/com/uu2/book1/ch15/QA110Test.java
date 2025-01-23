package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA110Test {

    private QA110 qa110;

    @BeforeEach
    public void setUp() {
        qa110 = new QA110();
    }

    @Test
    public void allPathsSourceTarget_EmptyGraph_NoPaths() {
        int[][] graph = {};
        List<List<Integer>> expected = Arrays.asList();
        List<List<Integer>> actual = qa110.allPathsSourceTarget(graph);
        assertEquals(expected, actual);
    }

    @Test
    public void allPathsSourceTarget_SingleNodeGraph_SinglePath() {
        int[][] graph = {{}};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0));
        List<List<Integer>> actual = qa110.allPathsSourceTarget(graph);
        assertEquals(expected, actual);
    }

    @Test
    public void allPathsSourceTarget_LinearGraph_SinglePath() {
        int[][] graph = {{1}, {2}, {3}, {}};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 1, 2, 3));
        List<List<Integer>> actual = qa110.allPathsSourceTarget(graph);
        assertEquals(expected, actual);
    }

    @Test
    public void allPathsSourceTarget_BranchingGraph_MultiplePaths() {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 1, 3), Arrays.asList(0, 2, 3));
        List<List<Integer>> actual = qa110.allPathsSourceTarget(graph);
        assertEquals(expected, actual);
    }


    @Test
    public void allPathsSourceTarget_ComplexGraph_MultiplePaths() {
        int[][] graph = {{1, 2}, {3}, {3}, {4}, {}};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 1, 3, 4), Arrays.asList(0, 2, 3, 4));
        List<List<Integer>> actual = qa110.allPathsSourceTarget(graph);
        assertEquals(expected, actual);
    }
}
