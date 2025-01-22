package com.uu2.ch12;

public class QA75 {
    /**
     * 数组相对排序你
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2)
    {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return arr1;
        }
        int[] counts = new int[1001];
        for (int n : arr1) {
            counts[n]++;
        }

        int i = 0;
        for (int n : arr2) {
            while (counts[n] > 0) {
                arr1[i++] = n;
                counts[n]--;
            }
        }

        for (int n = 0; n < counts.length; n++) {
            while (counts[n] > 0) {
                arr1[i++] = n;
                counts[n]--;
            }
        }

        return arr1;
    }
}
