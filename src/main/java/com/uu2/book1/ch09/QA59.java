package com.uu2.book1.ch09;

import java.util.PriorityQueue;

public class QA59 {
    /**
     * 数据流的第K大数字
     */
    private PriorityQueue<Integer> mh;
    private int size;

    public QA59(int k, int[] nums) {
        size = k;
        mh = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int num) {
        if (mh.size() < size) {
            mh.offer(num);
        } else if (mh.peek() < num) {
            mh.poll();
            mh.offer(num);
        }
        return mh.peek();
    }
}
