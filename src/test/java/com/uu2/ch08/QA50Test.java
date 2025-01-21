package com.uu2.ch08;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA50Test {

    private QA50 qa50;

    @BeforeEach
    public void setUp() {
        qa50 = new QA50();
    }

    @Test
    public void pathSum_EmptyTree_ShouldReturnZero() {
        assertEquals(0, qa50.pathSum(null, 10));
    }

    @Test
    public void pathSum_SingleNodeEqualsSum_ShouldReturnOne() {
        TreeNode root = new TreeNode(10, null, null);
        assertEquals(1, qa50.pathSum(root, 10));
    }

    @Test
    public void pathSum_SingleNodeNotEqualsSum_ShouldReturnZero() {
        TreeNode root = new TreeNode(5, null, null);
        assertEquals(0, qa50.pathSum(root, 10));
    }

    @Test
    public void pathSum_MultiplePaths_ShouldReturnCorrectCount() {
        TreeNode root = new TreeNode(10, new TreeNode(5, new TreeNode(3, new TreeNode(3, null, null), new TreeNode(-2, null, null)), new TreeNode(2, null, new TreeNode(1, null, null))), new TreeNode(-3, null, new TreeNode(11, null, null)));
        assertEquals(3, qa50.pathSum(root, 8));
    }

    @Test
    public void pathSum_NoPathEqualsSum_ShouldReturnZero() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), null), new TreeNode(4, null, new TreeNode(5, null, null)));
        assertEquals(0, qa50.pathSum(root, 15));
    }

    @Test
    public void pathSum_NegativeValues_ShouldHandleCorrectly() {
        TreeNode root =
                new TreeNode(1,
                        new TreeNode(-2,
                                new TreeNode(1,
                                        new TreeNode(-1),
                                        null),
                                new TreeNode(3)),
                        new TreeNode(-3,
                                new TreeNode(-2),
                                null));
        assertEquals(4, qa50.pathSum(root, -1));
    }

    @Test
    public void pathSum_ZeroValues_ShouldHandleCorrectly() {
        TreeNode root = new TreeNode(0, new TreeNode(0, new TreeNode(0, null, null), null), new TreeNode(0, null, new TreeNode(0, null, null)));
        assertEquals(11, qa50.pathSum(root, 0));
    }
}
