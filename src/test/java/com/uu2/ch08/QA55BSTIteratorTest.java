package com.qa;


import com.uu2.ch08.QA55BSTIterator;
import com.uu2.ch08.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QA55BSTIteratorTest {

    private QA55BSTIterator iterator;

    @BeforeEach
    public void setUp() {
        // 假设我们有一个方法来创建一个测试用的BST
        TreeNode root = createTestTree();
        iterator = new QA55BSTIterator(root);
    }

    private TreeNode createTestTree() {
        // 创建一个测试用的BST
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);
        return root;
    }

    @Test
    public void next_HasNext_ReturnsCorrectOrder() {
        // 测试用例：验证next()返回正确的顺序
        assertEquals(3, iterator.next());
        assertEquals(7, iterator.next());
        assertEquals(9, iterator.next());
        assertEquals(15, iterator.next());
        assertEquals(20, iterator.next());
    }

    @Test
    public void hasNext_EmptyTree_ReturnsFalse() {
        // 测试用例：验证空树的hasNext()
        iterator = new QA55BSTIterator(null);
        assertFalse(iterator.hasNext());
    }

    @Test
    public void hasNext_SingleNodeTree_ReturnsTrueThenFalse() {
        // 测试用例：验证单节点树的hasNext()
        iterator = new QA55BSTIterator(new TreeNode(1));
        assertTrue(iterator.hasNext());
        iterator.next();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void hasNext_FullyPopulatedTree_ReturnsTrueThenFalse() {
        // 测试用例：验证完全填充的树的hasNext()
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        iterator = new QA55BSTIterator(root);
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertFalse(iterator.hasNext());
    }
}
