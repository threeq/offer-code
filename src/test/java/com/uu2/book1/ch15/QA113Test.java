package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QA113Test {

    private QA113 qa113;

    @BeforeEach
    public void setUp() {
        qa113 = new QA113();
    }

    @Test
    public void findOrder_NoPrerequisites_ReturnsOrder() {
        int numCourses = 3;
        int[][] prerequisites = {};
        int[] expected = {0, 1, 2}; // 任何顺序都是有效的
        int[] result = qa113.findOrder(numCourses, prerequisites);
        assertArrayEquals(expected, result);
    }

    @Test
    public void findOrder_AllCoursesHavePrerequisites_ReturnsEmpty() {
        int numCourses = 3;
        int[][] prerequisites = {{0, 1}, {1, 2}, {2, 0}};
        int[] expected = {};
        int[] result = qa113.findOrder(numCourses, prerequisites);
        assertArrayEquals(expected, result);
    }

    @Test
    public void findOrder_LinearDependencies_ReturnsOrder() {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}};
        int[] expected = {0, 1, 2, 3};
        int[] result = qa113.findOrder(numCourses, prerequisites);
        assertArrayEquals(expected, result);
    }

    @Test
    public void findOrder_MixedDependencies_ReturnsOrder() {
        int numCourses = 5;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}, {4, 3}};
        int[] expected = {0, 1, 2, 3, 4}; // 0, 1, 2的顺序可以不同
        int[] result = qa113.findOrder(numCourses, prerequisites);
        assertArrayEquals(expected, result);
    }

    @Test
    public void findOrder_CycleDependency_ReturnsEmpty() {
        int numCourses = 3;
        int[][] prerequisites = {{0, 1}, {1, 2}, {2, 0}};
        int[] expected = {};
        int[] result = qa113.findOrder(numCourses, prerequisites);
        assertArrayEquals(expected, result);
    }
}
