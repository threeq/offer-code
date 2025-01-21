package com.uu2.ch08;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA49Test {

    private QA49 qa49;

    @BeforeEach
    public void setUp() {
        qa49 = new QA49();
    }

    @Test
    public void sumNumbers_EmptyTree_ReturnsZero() {
        assertEquals(0, qa49.sumNumbers(null));
    }

    @Test
    public void sumNumbers_SingleNode_ReturnsNodeValue() {
        TreeNode root = new TreeNode(1, null, null);
        assertEquals(1, qa49.sumNumbers(root));
    }

    @Test
    public void sumNumbers_SimpleTree_ReturnsCorrectSum() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, null),
                new TreeNode(3, null, null));
        assertEquals(25, qa49.sumNumbers(root));
    }

    @Test
    public void sumNumbers_ComplexTree_ReturnsCorrectSum() {
        TreeNode root = new TreeNode(4,
                new TreeNode(9,
                        new TreeNode(5, null, null),
                        new TreeNode(1, null, null)),
                new TreeNode(0, null, null));
        assertEquals(1026, qa49.sumNumbers(root));
    }

    @Test
    public void sumNumbers_MixedBranching_ReturnsCorrectSum() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));
        assertEquals(522, qa49.sumNumbers(root));
    }
}
