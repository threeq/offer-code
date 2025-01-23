package com.uu2.book1.ch08;

import java.util.Stack;

public class BSTIteratorReversed {
    TreeNode cur;
    Stack<TreeNode> stack;

    public BSTIteratorReversed(TreeNode root) {
        cur = root;
        stack = new Stack<>();
    }

    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }

    public int prev() {
        if (cur == null) {
            throw new RuntimeException("no more elements");
        }
        while (cur != null) {
            stack.push(cur);
            cur = cur.right;
        }
        cur = stack.pop();
        int val = cur.val;
        cur = cur.left;
        return val;
    }
}
