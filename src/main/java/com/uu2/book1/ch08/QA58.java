package com.uu2.book1.ch08;

import java.util.Map;
import java.util.TreeMap;

public class QA58 {
    /**
     * 日程表
     */
    private TreeMap<Integer, Integer> events;
    public QA58() {
        events = new TreeMap<>();
    }
    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> event = events.floorEntry(start);
        if (event != null && event.getValue() >= start) {
            return false;
        }
        event = events.ceilingEntry(start);
        if (event != null && event.getKey() <= end) {
            return false;
        }
        events.put(start, end);
        return true;
    }
}
