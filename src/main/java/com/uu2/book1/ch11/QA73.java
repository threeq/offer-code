package com.uu2.book1.ch11;

public class QA73 {
    /**
     * 猩猩吃香蕉
     */
    public int minEatingSpeed(int[] piles, int H) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int left = 1;
        int right = max;
        while (left <= right) {
            int mid = (left + right) / 2;
            int hours = getHours(piles, mid);
            if (hours <= H) {
                if (mid == 1 || getHours(piles, mid - 1) > H) {
                    return mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int getHours(int[] piles, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
        }
        return hours;
    }
}
