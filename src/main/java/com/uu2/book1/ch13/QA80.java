package com.uu2.book1.ch13;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class QA80 {
    /**
     * 包含K个元素的组合
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new LinkedList<>();
        if (k <= 0 || k > n) {
            return res;
        }
        LinkedList<Integer> path = new LinkedList<>();
        dfs(n, k, 1, path, res);
        Collections.reverse(res);
        return res;
    }

    private void dfs(int n, int k, int i, LinkedList<Integer> path, List<List<Integer>> res) {
        if (path.size() == k) {
            res.add(new LinkedList<>(path));
            return;
        }
        if (i <= n) {
            dfs(n, k, i + 1, path, res);
            path.add(i);
            dfs(n, k, i + 1, path, res);
            path.removeLast();
        }
    }
}
