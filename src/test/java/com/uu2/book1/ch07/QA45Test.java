package com.uu2.book1.ch07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.uu2.book1.ch07.QA45;
import com.uu2.book1.ch07.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA45Test {

    private QA45 qa45;

    @BeforeEach
    public void setUp() {
        qa45 = new QA45();
    }

    @Test
    public void findBottomLeftValue_NullRoot_ThrowsException() {
        assertThrows(RuntimeException.class, () -> qa45.findBottomLeftValue(null));
    }

    @Test
    public void findBottomLeftValue_SingleNode_ReturnsRootValue() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, qa45.findBottomLeftValue(root));
    }

    @Test
    public void findBottomLeftValue_FullBinaryTree_ReturnsBottomLeftValue() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        assertEquals(4, qa45.findBottomLeftValue(root));
    }

    @Test
    public void findBottomLeftValue_NonFullBinaryTree_ReturnsBottomLeftValue() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(7);
        assertEquals(7, qa45.findBottomLeftValue(root));
    }

    @Test
    public void findBottomLeftValue_OnlyLeftChildren_ReturnsBottomLeftValue() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        assertEquals(4, qa45.findBottomLeftValue(root));
    }

    @Test
    public void findBottomLeftValue_OnlyRightChildren_ReturnsBottomLeftValue() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(7);
        assertEquals(7, qa45.findBottomLeftValue(root));
    }
}
