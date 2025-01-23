package com.uu2.book1.ch08;

public class QA56 {
    /**
     * 二叉搜索树中两个节点的值之和
     */
    public boolean findTarget(TreeNode root, int k) {
        QA55BSTIterator iterator1 = new QA55BSTIterator(root);
        BSTIteratorReversed iterator2 = new BSTIteratorReversed(root);
        try {
            int left = iterator1.next();
            int right = iterator2.prev();
            while (left != right) {
                if (left + right == k) {
                    return true;
                } else if (left + right < k) {
                    left = iterator1.next();
                } else {
                    right = iterator2.prev();
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
