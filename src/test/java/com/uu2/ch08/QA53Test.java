package com.uu2.ch08;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QA53Test {

    private QA53 qa53;

    @BeforeEach
    public void setUp() {
        qa53 = new QA53();
    }

    @Test
    public void inorderSuccessor_NodeWithSuccessor_SuccessorFound() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2, new TreeNode(1, null, null), null),
                        new TreeNode(4, null, null)),
                new TreeNode(6, null, null));
        TreeNode p = root.left; // 节点 3
        TreeNode expectedSuccessor = root.left.right; // 节点 5
        assertEquals(expectedSuccessor, qa53.inorderSuccessor(root, p));
    }

    @Test
    public void inorderSuccessor_NodeWithoutSuccessor_NoSuccessor() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2, new TreeNode(1, null, null), null),
                        new TreeNode(4, null, null)),
                new TreeNode(6, null, null));
        TreeNode p = root.right; // 节点 6
        assertNull(qa53.inorderSuccessor(root, p));
    }

    @Test
    public void inorderSuccessor_NodeWithSuccessorInRightSubtree_SuccessorFound() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2, new TreeNode(1, null, null), null),
                        new TreeNode(4, null, null)),
                new TreeNode(6, null, new TreeNode(7, null, null)));
        TreeNode p = root.left.right; // 节点 4
        TreeNode expectedSuccessor = root; // 节点 5
        assertEquals(expectedSuccessor, qa53.inorderSuccessor(root, p));
    }

    @Test
    public void inorderSuccessor_NodeWithSuccessorInLeftSubtree_SuccessorFound() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2, new TreeNode(1, null, null), null),
                        new TreeNode(4, null, null)),
                new TreeNode(6, null, null));
        TreeNode p = root.left.left; // 节点 2
        TreeNode expectedSuccessor = root.left; // 节点 3
        assertEquals(expectedSuccessor, qa53.inorderSuccessor(root, p));
    }
}
