package com.uu2.book1.ch08;


import com.uu2.book1.ch08.QA52;
import com.uu2.book1.ch08.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QA52Test {

    private QA52 qa52;

    @BeforeEach
    public void setUp() {
        qa52 = new QA52();
    }

    @Test
    public void increasingBST_EmptyTree_ReturnsNull() {
        TreeNode root = null;
        TreeNode result = qa52.increasingBST(root);
        assertNull(result);
    }

    @Test
    public void increasingBST_SingleNodeTree_ReturnsSameNode() {
        TreeNode root = new TreeNode(1, null, null);
        TreeNode result = qa52.increasingBST(root);
        assertSame(root, result);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    public void increasingBST_BalancedTree_ReturnsFlattenedTree() {
        TreeNode root = new TreeNode(2, 
            new TreeNode(1, null, null), 
            new TreeNode(3, null, null)
        );
        TreeNode result = qa52.increasingBST(root);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertEquals(2, result.right.val);
        assertNull(result.right.left);
        assertEquals(3, result.right.right.val);
        assertNull(result.right.right.left);
        assertNull(result.right.right.right);
    }

    @Test
    public void increasingBST_UnbalancedTree_ReturnsFlattenedTree() {
        TreeNode root = new TreeNode(1, 
            null, 
            new TreeNode(2, 
                null, 
                new TreeNode(3, null, null)
            )
        );
        TreeNode result = qa52.increasingBST(root);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertEquals(2, result.right.val);
        assertNull(result.right.left);
        assertEquals(3, result.right.right.val);
        assertNull(result.right.right.left);
        assertNull(result.right.right.right);
    }

    @Test
    public void increasingBST_AlreadyFlattenedTree_ReturnsSameStructure() {
        TreeNode root = new TreeNode(1, 
            null, 
            new TreeNode(2, 
                null, 
                new TreeNode(3, null, null)
            )
        );
        TreeNode result = qa52.increasingBST(root);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertEquals(2, result.right.val);
        assertNull(result.right.left);
        assertEquals(3, result.right.right.val);
        assertNull(result.right.right.left);
        assertNull(result.right.right.right);
    }

    @Test
    public void increasingBST_CompleteBinaryTree_ReturnsFlattenedTree() {
        TreeNode root = new TreeNode(4, 
            new TreeNode(2, 
                new TreeNode(1, null, null), 
                new TreeNode(3, null, null)
            ), 
            new TreeNode(5, null, null)
        );
        TreeNode result = qa52.increasingBST(root);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertEquals(2, result.right.val);
        assertNull(result.right.left);
        assertEquals(3, result.right.right.val);
        assertNull(result.right.right.left);
        assertEquals(4, result.right.right.right.val);
        assertNull(result.right.right.right.left);
        assertEquals(5, result.right.right.right.right.val);
        assertNull(result.right.right.right.right.left);
        assertNull(result.right.right.right.right.right);
    }
}
