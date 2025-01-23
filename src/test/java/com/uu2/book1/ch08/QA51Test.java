package com.uu2.book1.ch08;


import com.uu2.book1.ch08.QA51;
import com.uu2.book1.ch08.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA51Test {

    private QA51 qa51;

    @BeforeEach
    public void setUp() {
        qa51 = new QA51();
    }

    @Test
    public void maxPathSum_EmptyTree_ReturnsMinValue() {
        assertEquals(Integer.MIN_VALUE, qa51.maxPathSum(null));
    }

    @Test
    public void maxPathSum_SingleNode_ReturnsNodeValue() {
        TreeNode root = new TreeNode(1, null, null);
        assertEquals(1, qa51.maxPathSum(root));
    }

    @Test
    public void maxPathSum_AllPositiveValues_ReturnsMaxPathSum() {
        TreeNode root = new TreeNode(10, 
            new TreeNode(2, null, null), 
            new TreeNode(10, null, null));
        assertEquals(22, qa51.maxPathSum(root));
    }

    @Test
    public void maxPathSum_ContainsNegativeValues_ReturnsMaxPathSum() {
        TreeNode root = new TreeNode(-10, 
            new TreeNode(9, null, null), 
            new TreeNode(20, 
                new TreeNode(15, null, null), 
                new TreeNode(7, null, null)));
        assertEquals(42, qa51.maxPathSum(root));
    }

    @Test
    public void maxPathSum_MaxPathDoesNotPassRoot_ReturnsMaxPathSum() {
        TreeNode root = new TreeNode(2, 
            new TreeNode(-1, 
                new TreeNode(-2, null, null), 
                new TreeNode(-3, null, null)), 
            new TreeNode(-4, null, null));
        assertEquals(2, qa51.maxPathSum(root));
    }

    @Test
    public void maxPathSum_AllNegativeValues_ReturnsMaxNodeValue() {
        TreeNode root = new TreeNode(-10, 
            new TreeNode(-20, null, null), 
            new TreeNode(-30, null, null));
        assertEquals(-10, qa51.maxPathSum(root));
    }

    @Test
    public void maxPathSum_BalancedTree_ReturnsMaxPathSum() {
        TreeNode root = new TreeNode(1, 
            new TreeNode(2, 
                new TreeNode(4, null, null), 
                new TreeNode(5, null, null)), 
            new TreeNode(3, 
                new TreeNode(6, null, null), 
                new TreeNode(7, null, null)));
        assertEquals(18, qa51.maxPathSum(root));
    }

    @Test
    public void maxPathSum_UnbalancedTree_ReturnsMaxPathSum() {
        TreeNode root = new TreeNode(1, 
            new TreeNode(2, 
                new TreeNode(3, 
                    new TreeNode(4, null, null), 
                    null), 
                null), 
            null);
        assertEquals(10, qa51.maxPathSum(root));
    }
}
