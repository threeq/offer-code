package com.uu2.book1.ch07;

import java.util.LinkedList;
import java.util.Queue;

public class QA45 {
    /**
     * 二叉树最低层最左边的值
     */
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        if (root==null) {
            throw new RuntimeException("root is null");
        }
        queue1.offer(root);
        int result = root.val;
        while (!queue1.isEmpty()) {
            TreeNode node = queue1.poll();
            if (node.left != null) {
                queue2.offer(node.left);
            }
            if (node.right != null) {
                queue2.offer(node.right);
            }
            if (queue1.isEmpty()) {
                queue1 = queue2;
                queue2 = new LinkedList<>();
                if (!queue1.isEmpty()) {
                    result = queue1.peek().val;
                }
            }
        }

        return result;
    }
}
