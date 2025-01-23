package com.uu2.book1.ch15;

import java.util.*;

public class QA111 {
    /**
     * 计算除法
     */
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        double[] res = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            String from = queries.get(i).get(0);
            String to = queries.get(i).get(1);

            if (!graph.containsKey(from) || !graph.containsKey(to)) {
                res[i] = -1.0;
            } else {
                res[i] = dfs(graph, from, to, new HashSet<>());
            }
        }
        return res;
    }

    private double dfs(Map<String, Map<String, Double>> graph, String from, String to, HashSet<String> visited) {
        if (from.equals(to)) {
            return 1.0;
        }
        visited.add(from);
        for (Map.Entry<String, Double> entry : graph.get(from).entrySet()) {
            String next = entry.getKey();
            if (!visited.contains(next)) {
                double res = dfs(graph, next, to, visited);
                if (res > 0) {
                    return res * entry.getValue();
                }
            }
        }
        return -1.0;
    }

    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String var1 = equations.get(i).get(0);
            String var2 = equations.get(i).get(1);

            graph.putIfAbsent(var1, new HashMap<>());
            graph.get(var1).put(var2, values[i]);

            graph.putIfAbsent(var2, new HashMap<>());
            graph.get(var2).put(var1, 1.0 / values[i]);
        }
        return graph;
    }
}
