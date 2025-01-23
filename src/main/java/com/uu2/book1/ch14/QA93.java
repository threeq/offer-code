package com.uu2.book1.ch14;

import java.util.HashMap;
import java.util.Map;

public class QA93 {
    /**
     * 最长费波拉切数列
     */
    public int lenLongestFib(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], i);
        }
        int[][] dp = new int[A.length][A.length];
        int result = 2;
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                int k = map.getOrDefault(A[i] - A[j], -1);
                dp[i][j] = k >= 0 && k < j ? dp[j][k] + 1 : 2;

                result = Math.max(result, dp[i][j]);
            }
        }
        return result > 2 ? result : 0;
    }
}
