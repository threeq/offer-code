package com.uu2.book1.ch08;

public class QA51 {
    /**
     * 节点值之和最大的路径
     */
    public int maxPathSum(TreeNode root) {
        int[] max = {Integer.MIN_VALUE};
        dfs(root, max);
        return max[0];
    }

    private int dfs(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }

        int[] maxSumLeft = {Integer.MIN_VALUE};
        int left = Math.max(0, dfs(root.left, maxSumLeft));
        int[] maxSumRight = {Integer.MIN_VALUE};
        int right = Math.max(0, dfs(root.right, maxSumRight));

        max[0] = Math.max(maxSumLeft[0], maxSumRight[0]);
        max[0] = Math.max(max[0], root.val + left + right);

        return root.val + Math.max(left, right);
    }
}
