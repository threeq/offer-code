package com.uu2.ch05;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA35Test {

    private QA35 qa35;

    @BeforeEach
    public void setUp() {
        qa35 = new QA35();
    }

    @Test
    public void findMinDifference_MoreThan1440Points_ReturnsZero() {
        String[] timePoints = new String[1441];
        for (int i = 0; i < 1441; i++) {
            timePoints[i] = String.format("%02d:%02d", i / 60, i % 60);
        }
        assertEquals(0, qa35.findMinDifference(timePoints));
    }

    @Test
    public void findMinDifference_DuplicateTimes_ReturnsZero() {
        String[] timePoints = {"00:00", "00:00"};
        assertEquals(0, qa35.findMinDifference(timePoints));
    }

    @Test
    public void findMinDifference_NoDuplicates_ReturnsCorrectDifference() {
        String[] timePoints = {"00:00", "23:59", "12:34", "01:01"};
        assertEquals(1, qa35.findMinDifference(timePoints));
    }

    @Test
    public void findMinDifference_CrossingMidnight_ReturnsCorrectDifference() {
        String[] timePoints = {"23:59", "00:01"};
        assertEquals(2, qa35.findMinDifference(timePoints));
    }

    @Test
    public void findMinDifference_SinglePoint_ReturnsMaxDifference() {
        String[] timePoints = {"12:34"};
        assertEquals(0, qa35.findMinDifference(timePoints));
    }
}
