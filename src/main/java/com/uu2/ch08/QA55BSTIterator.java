package com.uu2.ch08;

import java.util.Stack;

public class QA55BSTIterator {
    /**
     * 二叉搜索树迭代器
     */
    TreeNode cur;
    Stack<TreeNode> stack;
    public QA55BSTIterator(TreeNode root) {
        cur = root;
        stack = new Stack<>();
    }
    public boolean hasNext() {
        return !stack.isEmpty() || cur != null;
    }

    public int next() {
        if (cur == null) {
            throw new RuntimeException("no more elements");
        }
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        int val = cur.val;
        cur = cur.right;
        return val;
    }
}
