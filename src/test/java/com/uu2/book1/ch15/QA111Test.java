package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QA111Test {

    private QA111 qa111;

    @BeforeEach
    public void setUp() {
        qa111 = new QA111();
    }

    @Test
    public void calcEquation_AllValidQueries_ShouldReturnCorrectResults() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));

        double[] values = {2.0, 3.0};

        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));

        double[] expected = {6.0, 0.5, -1.0, 1.0, -1.0};

        double[] result = qa111.calcEquation(equations, values, queries);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    public void calcEquation_NoPath_ShouldReturnMinusOne() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));

        double[] values = {2.0, 3.0};

        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "d"));

        double[] expected = {-1.0};

        double[] result = qa111.calcEquation(equations, values, queries);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    public void calcEquation_SingleVariableQuery_ShouldReturnOne() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));

        double[] values = {2.0};

        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "a"));

        double[] expected = {1.0};

        double[] result = qa111.calcEquation(equations, values, queries);

        assertArrayEquals(expected, result, 0.0001);
    }

    @Test
    public void calcEquation_UnknownVariable_ShouldReturnMinusOne() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));

        double[] values = {2.0};

        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("x", "y"));

        double[] expected = {-1.0};

        double[] result = qa111.calcEquation(equations, values, queries);

        assertArrayEquals(expected, result, 0.0001);
    }
}
