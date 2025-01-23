package com.uu2.book1.ch07;

import java.util.LinkedList;
import java.util.Queue;

public class QA42 {
    /**
     * 42. 最近请求次数
     */
    public static class RecentCounter {
        private Queue<Integer> times = new LinkedList<>();
        private int windowSize;

        public RecentCounter() {
            windowSize = 3000;
        }

        public int ping(int t) {
            times.offer(t);
            while (times.peek() < t - windowSize) {
                times.poll();
            }
            return times.size();
        }
    }
}
