package com.uu2.book1.ch15;

import java.util.LinkedList;
import java.util.List;

public class QA110 {
    /**
     * 所有路径
     */
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        if (graph == null || graph.length == 0) {
            return result;
        }
        dfs(0, graph, path, result);
        return result;
    }

    private void dfs(int source, int[][] graph, List<Integer> path, List<List<Integer>> result) {
        path.add(source);
        if (source == graph.length - 1) {
            result.add(new LinkedList<>(path));
        } else {
            for (int i : graph[source]) {
                dfs(i, graph, path, result);
            }
        }
        path.remove(path.size() - 1);
    }
}
