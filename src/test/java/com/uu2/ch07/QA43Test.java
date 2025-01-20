package com.uu2.ch07;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA43Test {

    private QA43.CBTInserter cbtInserter;

    @BeforeEach
    public void setUp() {
        // 设置一个初始的完全二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        cbtInserter = new QA43.CBTInserter(root);
    }

    @Test
    public void insert_ParentHasNoLeftChild_InsertsAsLeftChild() {
        int parentValue = cbtInserter.insert(7);
        assertEquals(3, parentValue);
        TreeNode root = cbtInserter.get_root();
        assertEquals(4, root.left.left.val);
    }

    @Test
    public void insert_ParentHasLeftButNoRightChild_InsertsAsRightChild() {
        cbtInserter.insert(7); // 为父节点2插入左子节点
        int parentValue = cbtInserter.insert(8);
        assertEquals(4, parentValue);
        TreeNode root = cbtInserter.get_root();
        assertEquals(8, root.left.left.left.val);
    }

    @Test
    public void insert_ParentHasTwoChildren_ParentIsRemovedFromQueue() {
        cbtInserter.insert(7); // 为父节点2插入左子节点
        cbtInserter.insert(8); // 为父节点2插入右子节点
        int parentValue = cbtInserter.insert(9);
        assertEquals(4, parentValue);
        TreeNode root = cbtInserter.get_root();
        assertEquals(9, root.left.left.right.val);
    }

    @Test
    public void get_root_ReturnsRootNode() {
        TreeNode root = cbtInserter.get_root();
        assertNotNull(root);
        assertEquals(1, root.val);
    }
}
