package com.uu2.book1.ch12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QA74 {
    /**
     * 合并区间
     */
    public int[][] merge(int[][] intervals)
    {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new LinkedList<>();
        int i=0;
        while (i < intervals.length)
        {
            int[] temp = new int[]{intervals[i][0], intervals[i][1]};
            int j=i+1;
            while (j < intervals.length && intervals[j][0] <= temp[1])
            {
                temp[1] = Math.max(temp[1], intervals[j][1]);
                j++;
            }
            merged.add(temp);
            i = j;
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
