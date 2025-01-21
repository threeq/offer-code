package com.uu2.ch08;

public class QA53 {
    /**
     * 二叉搜索树的下一个节点
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p)
    {
        TreeNode cur = root;
        TreeNode result = null;
        while (cur!=null) {
            if (cur.val > p.val) {
                result = cur;
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return result;
    }
}
