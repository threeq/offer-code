package com.uu2.book1.ch07;

import java.util.LinkedList;
import java.util.Queue;

public class QA43 {
    /**
     * 在完全二叉树中添加一个节点
     */
    public static class CBTInserter {
        private TreeNode root;
        private Queue<TreeNode> queue;

        public CBTInserter(TreeNode root) {
            this.root = root;
            queue = new LinkedList<>();
            queue.offer(root);
            while (queue.peek().left != null && queue.peek().right != null) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        public int insert(int val) {
            TreeNode node = new TreeNode(val);
            TreeNode parent = queue.peek();
            if (parent.left == null) {
                parent.left = node;
            } else {
                parent.right = node;
                queue.poll();
                queue.offer(parent.left);
                queue.offer(parent.right);
            }
            return parent.val;
        }

        public TreeNode get_root() {
            return root;
        }
    }
}
