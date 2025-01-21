package com.uu2.ch08;

public class QA48 {
    /**
     * 序列化和反序列化二叉树
     */
    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        String[] dataArr = data.split(",");
        int[] i={0};
        return dfs(dataArr, i);
    }

    private TreeNode dfs(String[] dataArr, int[] i) {
        String str = dataArr[i[0]];
        i[0]++;
        if (str.equals("#")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(str));
        node.left = dfs(dataArr, i);
        node.right = dfs(dataArr, i);
        return node;
    }

}
