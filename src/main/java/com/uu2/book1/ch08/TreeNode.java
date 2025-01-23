package com.uu2.book1.ch08;


public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode l, TreeNode r) {
        this.val = val;
        this.left = l;
        this.right = r;
    }
}
