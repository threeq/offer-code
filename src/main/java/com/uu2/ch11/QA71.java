package com.uu2.ch11;

public class QA71 {
    /**
     * 按权重生成随机数
     */
    public int pickIndex(int[] w) {
        if (w == null || w.length == 0) {
            return -1;
        }

        int total = 0;
        int[] sums = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            total += w[i];
            sums[i] = total;
        }

        int target = (int) (Math.random() * total);
        int left = 0;
        int right = sums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (sums[mid] > target) {
                if (mid == 0 || sums[mid - 1] <= target) {
                    return mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }
}
