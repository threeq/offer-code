package com.uu2.ch07;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA42Test {

    private QA42.RecentCounter recentCounter;

    @BeforeEach
    public void setUp() {
        recentCounter = new QA42.RecentCounter();
    }

    @Test
    public void ping_FirstRequest_ShouldReturnOne() {
        assertEquals(1, recentCounter.ping(1));
    }

    @Test
    public void ping_MultipleRequestsInWindow_ShouldReturnCorrectCount() {
        assertEquals(1, recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(100));
        assertEquals(3, recentCounter.ping(3001));
        assertEquals(3, recentCounter.ping(3002));
    }

    @Test
    public void ping_ExpiredRequests_ShouldBeRemoved() {
        assertEquals(1, recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(100));
        assertEquals(3, recentCounter.ping(3001));
        assertEquals(3, recentCounter.ping(3002));
        assertEquals(3, recentCounter.ping(6001)); // 1 and 100 should be expired
    }

    @Test
    public void ping_BoundaryRequests_ShouldHandleCorrectly() {
        assertEquals(1, recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(3000));
        assertEquals(3, recentCounter.ping(3001)); // 1 should be expired
    }
}
