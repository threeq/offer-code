package com.uu2.ch08;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QA54Test {

    private QA54 qa54;

    @BeforeEach
    public void setUp() {
        qa54 = new QA54();
    }

    @Test
    public void convertBST_EmptyTree_ReturnsNull() {
        TreeNode root = null;
        TreeNode result = qa54.convertBST(root);
        assertNull(result);
    }

    @Test
    public void convertBST_SingleNodeTree_ReturnsSameValue() {
        TreeNode root = new TreeNode(5, null, null);
        TreeNode result = qa54.convertBST(root);
        assertEquals(5, result.val);
    }

    @Test
    public void convertBST_FullTree_CorrectlyConvertsToAccumulatedTree() {
        TreeNode root = new TreeNode(4,
                new TreeNode(1,
                        new TreeNode(0, null, null),
                        new TreeNode(2,
                                null,
                                new TreeNode(3, null, null))),
                new TreeNode(6,
                        new TreeNode(5, null, null),
                        new TreeNode(7,
                                null,
                                new TreeNode(8, null, null))));

        TreeNode result = qa54.convertBST(root);

        assertEquals(30, result.val);
        assertEquals(36, result.left.val);
        assertEquals(35, result.left.right.val);
        assertEquals(33, result.left.right.right.val);
        assertEquals(21, result.right.val);
        assertEquals(26, result.right.left.val);
        assertEquals(15, result.right.right.val);
        assertEquals(8, result.right.right.right.val);
    }

    @Test
    public void convertBST_LeftSkewedTree_CorrectlyConvertsToAccumulatedTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(2,
                        new TreeNode(1,
                                new TreeNode(0, null, null),
                                null),
                        null),
                null);

        TreeNode result = qa54.convertBST(root);

        assertEquals(3, result.val);
        assertEquals(5, result.left.val);
        assertEquals(6, result.left.left.val);
        assertEquals(6, result.left.left.left.val);
    }

    @Test
    public void convertBST_RightSkewedTree_CorrectlyConvertsToAccumulatedTree() {
        TreeNode root = new TreeNode(0,
                null,
                new TreeNode(1,
                        null,
                        new TreeNode(2,
                                null,
                                new TreeNode(3, null, null))));

        TreeNode result = qa54.convertBST(root);

        assertEquals(6, result.val);
        assertEquals(6, result.right.val);
        assertEquals(5, result.right.right.val);
        assertEquals(3, result.right.right.right.val);
    }
}
