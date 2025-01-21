package com.uu2.ch08;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA56Test {

    private QA56 qa56;

    @BeforeEach
    public void setUp() {
        qa56 = new QA56();
    }

    @Test
    public void findTarget_EmptyTree_ReturnsFalse() {
        TreeNode root = null;
        assertFalse(qa56.findTarget(root, 10));
    }

    @Test
    public void findTarget_SingleNode_ReturnsFalse() {
        TreeNode root = new TreeNode(5);
        assertFalse(qa56.findTarget(root, 10));
    }

    @Test
    public void findTarget_TwoNodes_SumEqualsK_ReturnsTrue() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        assertTrue(qa56.findTarget(root, 8));
    }

    @Test
    public void findTarget_TwoNodes_SumNotEqualsK_ReturnsFalse() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        assertFalse(qa56.findTarget(root, 10));
    }

    @Test
    public void findTarget_MultipleNodes_FoundTarget_ReturnsTrue() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        assertTrue(qa56.findTarget(root, 9));
    }

    @Test
    public void findTarget_MultipleNodes_NoTarget_ReturnsFalse() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        assertFalse(qa56.findTarget(root, 28));
    }

    @Test
    public void findTarget_BoundaryCase_ReturnsFalse() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        assertFalse(qa56.findTarget(root, 4));
    }
}
