package com.uu2.book1.ch15;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA109Test {

    private QA109 qa109;

    @BeforeEach
    public void setUp() {
        qa109 = new QA109();
    }

    @Test
    public void openLock_InitialInDeadends_ReturnsNegativeOne() {
        String[] deadends = {"0000"};
        String target = "8888";
        assertEquals(-1, qa109.openLock(deadends, target));
    }

    @Test
    public void openLock_TargetInDeadends_ReturnsNegativeOne() {
        String[] deadends = {"8888"};
        String target = "8888";
        assertEquals(-1, qa109.openLock(deadends, target));
    }

    @Test
    public void openLock_ValidPathExists_ReturnsSteps() {
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        assertEquals(6, qa109.openLock(deadends, target));
    }

    @Test
    public void openLock_NoValidPath_ReturnsNegativeOne() {
        String[] deadends = {"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"};
        String target = "8888";
        assertEquals(-1, qa109.openLock(deadends, target));
    }

    @Test
    public void openLock_EmptyDeadends_ReturnsSteps() {
        String[] deadends = {};
        String target = "0001";
        assertEquals(1, qa109.openLock(deadends, target));
    }

    @Test
    public void openLock_TargetIsInitial_ReturnsZero() {
        String[] deadends = {};
        String target = "0000";
        assertEquals(0, qa109.openLock(deadends, target));
    }
}
