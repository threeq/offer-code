package com.uu2.book1.ch08;


import com.uu2.book1.ch08.QA47;
import com.uu2.book1.ch08.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QA47Test {

    private QA47 qa47;

    @BeforeEach
    public void setUp() {
        qa47 = new QA47();
    }

    @Test
    public void pruneTree_EmptyTree_ReturnsNull() {
        TreeNode root = null;
        TreeNode result = qa47.pruneTree(root);
        assertNull(result);
    }

    @Test
    public void pruneTree_SingleZeroLeafNode_ReturnsNull() {
        TreeNode root = new TreeNode();
        root.val = 0;
        TreeNode result = qa47.pruneTree(root);
        assertNull(result);
    }

    @Test
    public void pruneTree_SingleNonZeroLeafNode_ReturnsNode() {
        TreeNode root = new TreeNode();
        root.val = 1;
        TreeNode result = qa47.pruneTree(root);
        assertNotNull(result);
        assertEquals(1, result.val);
    }

    @Test
    public void pruneTree_ZeroLeafWithNonZeroParent_ReturnsParent() {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = new TreeNode();
        root.left.val = 0;
        TreeNode result = qa47.pruneTree(root);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.left);
    }

    @Test
    public void pruneTree_ComplexTree_RemovesZeroLeaves() {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = new TreeNode();
        root.left.val = 0;
        root.right = new TreeNode();
        root.right.val = 1;
        root.right.left = new TreeNode();
        root.right.left.val = 0;
        root.right.right = new TreeNode();
        root.right.right.val = 0;
        TreeNode result = qa47.pruneTree(root);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNotNull(result.right);
        assertEquals(1, result.right.val);
        assertNull(result.right.left);
        assertNull(result.right.right);
    }
}
