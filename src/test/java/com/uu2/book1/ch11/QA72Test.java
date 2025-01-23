package com.uu2.book1.ch11;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.uu2.book1.ch11.QA72;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA72Test {

    private QA72 qa72;

    @BeforeEach
    public void setUp() {
        qa72 = new QA72();
    }

    @Test
    public void mySqrt_ZeroInput_ReturnsZero() {
        assertEquals(0, qa72.mySqrt(0));
    }

    @Test
    public void mySqrt_OneInput_ReturnsOne() {
        assertEquals(1, qa72.mySqrt(1));
    }

    @Test
    public void mySqrt_PerfectSquare_ReturnsCorrectRoot() {
        assertEquals(2, qa72.mySqrt(4));
    }

    @Test
    public void mySqrt_NonPerfectSquare_ReturnsFloorRoot() {
        assertEquals(2, qa72.mySqrt(8));
    }

    @Test
    public void mySqrt_LargeValue_ReturnsCorrectRoot() {
        assertEquals(46340, qa72.mySqrt(2147395600));
    }

    @Test
    public void mySqrt_MaxIntegerValue_ReturnsCorrectRoot() {
        assertEquals(46340, qa72.mySqrt(Integer.MAX_VALUE));
    }
}
