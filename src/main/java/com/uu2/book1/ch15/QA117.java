package com.uu2.book1.ch15;

public class QA117 {
    /**
     * 相似的字符串
     */
    public int numSimilarGroups(String[] strs) {
        int[] fathers = new int[strs.length];
        for (int i = 0; i < fathers.length; i++) {
            fathers[i] = i;
        }

        int n = strs.length;
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (isSimilar(strs[i], strs[j]) && union(fathers, i, j)) {
                    n--;
                }
            }
        }

        return n;
    }

    private boolean isSimilar(String str, String str1) {
        int diffCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str1.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount <= 2;
    }

    private boolean union(int[] fathers, int i, int j) {
        int rootI = findRoot(fathers, i);
        int rootJ = findRoot(fathers, j);
        if (rootI == rootJ) {
            return false;
        }
        fathers[rootI] = rootJ;
        return true;
    }

    private int findRoot(int[] fathers, int i) {
        if (fathers[i] != i) {
            fathers[i] = findRoot(fathers, fathers[i]);
        }
        return fathers[i];
    }
}
