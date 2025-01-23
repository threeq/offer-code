package com.uu2.book1.ch05;

public class QA35 {
    /**
     * 最小时间差
     */
    public int findMinDifference(String[] timePoints) {
        if (timePoints.length > 1440 || timePoints.length == 0 || timePoints.length == 1) {
            return 0;
        }
        boolean[] minutes = new boolean[24 * 60];
        for (String time : timePoints) {
            String[] t = time.split(":");
            int minute = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
            if (minutes[minute]) {
                return 0;
            }
            minutes[minute] = true;
        }

        return helper(minutes);
    }

    private int helper(boolean[] minutes) {
        int minDiff = minutes.length - 1;
        int prev = -1;
        int first = minutes.length - 1;
        int last = -1;
        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i]) {
                if (prev >= 0) {
                    minDiff = Math.min(minDiff, i - prev);
                }
                prev = i;
                first = Math.min(first, i);
                last = Math.max(last, i);
            }
        }
        return Math.min(minDiff, first + minutes.length - last);
    }
}
