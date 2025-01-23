package com.uu2.book1.ch07;


import com.uu2.book1.ch07.QA41;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA41Test {

    private QA41.MovingAverage movingAverage;

    @BeforeEach
    public void setUp() {
        // 在每个测试之前重置移动平均对象
    }

    @Test
    public void next_QueueNotFull_CorrectAverage() {
        movingAverage = new QA41.MovingAverage(3);
        assertEquals(1.0, movingAverage.next(1), 0.001);
        assertEquals(5.5, movingAverage.next(10), 0.001);
        assertEquals(4.666, movingAverage.next(3), 0.001);
    }

    @Test
    public void next_QueueFull_CorrectAverage() {
        movingAverage = new QA41.MovingAverage(3);
        movingAverage.next(1);
        movingAverage.next(10);
        movingAverage.next(3);
        assertEquals(6.0, movingAverage.next(5), 0.001);
    }

    @Test
    public void next_QueueOverflow_CorrectAverage() {
        movingAverage = new QA41.MovingAverage(3);
        movingAverage.next(1);
        movingAverage.next(10);
        movingAverage.next(3);
        movingAverage.next(5);
        assertEquals(5.0, movingAverage.next(7), 0.001);
    }

    @Test
    public void next_CapacityZero_NoAverage() {
        movingAverage = new QA41.MovingAverage(0);
        assertEquals(0.0, movingAverage.next(1), 0.001);
    }

    @Test
    public void next_CapacityNegative_NoAverage() {
        movingAverage = new QA41.MovingAverage(-1);
        assertEquals(0.0, movingAverage.next(1), 0.001);
    }

    @Test
    public void next_NegativeValues_CorrectAverage() {
        movingAverage = new QA41.MovingAverage(3);
        assertEquals(-1.0, movingAverage.next(-1), 0.001);
        assertEquals(-5.5, movingAverage.next(-10), 0.001);
        assertEquals(-4.667, movingAverage.next(-3), 0.001);
    }

    @Test
    public void next_ZeroValues_CorrectAverage() {
        movingAverage = new QA41.MovingAverage(3);
        assertEquals(0.0, movingAverage.next(0), 0.001);
        assertEquals(0.0, movingAverage.next(0), 0.001);
        assertEquals(0.0, movingAverage.next(0), 0.001);
    }
}
