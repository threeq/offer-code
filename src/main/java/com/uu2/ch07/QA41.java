package com.uu2.ch07;

import java.util.LinkedList;
import java.util.Queue;

public class QA41 {
    /**
     * 41. 滑动窗口的平均值
     */
    public static class MovingAverage {
        private int capacity;
        private Queue<Integer> nums = new LinkedList<>();
        private int sum = 0;


        public MovingAverage(int capacity) {
            this.capacity = capacity;
        }

        public double next(int val) {
            if(capacity <= 0) {
                return 0;
            }
            nums.offer(val);
            sum += val;
            if (nums.size() > capacity) {
                sum -= nums.poll();
            }
            return sum * 1.0 / nums.size();
        }
    }
}
