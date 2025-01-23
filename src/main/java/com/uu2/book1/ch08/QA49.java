package com.uu2.book1.ch08;

public class QA49 {
    /**
     * 从根节点到叶节点的路径数字之和
     */
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int path) {
        if(root==null) {
            return 0;
        }

        path = path * 10 + root.val;
        if(root.left==null && root.right==null) {
            return path;
        }
        return dfs(root.left, path) + dfs(root.right, path);
    }
}
