package com.uu2.ch08;

import java.util.HashMap;
import java.util.Map;

public class QA50 {
    /**
     * 向下的路径节点值之和
     */
    public int pathSum(TreeNode root, int sum)
    {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        return dfs(root, sum, map, 0);
    }

    private int dfs(TreeNode root, int sum, Map<Integer, Integer> map, int path) {
        if(root==null) {
            return 0;
        }
        path = path + root.val;
        int count = map.getOrDefault(path - sum, 0);
        map.put(path, map.getOrDefault(path, 0) + 1);
        count += dfs(root.left, sum, map, path) + dfs(root.right, sum, map, path);
        map.put(path, map.get(path) - 1);
        return count;
    }
}
