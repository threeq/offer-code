package com.uu2.book1.ch11;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.uu2.book1.ch11.QA69;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA69Test {

    private QA69 qa69;

    @BeforeEach
    public void setUp() {
        qa69 = new QA69();
    }

    @Test
    public void peakIndexInMountainArray_PeakInMiddle_ReturnsCorrectIndex() {
        int[] A = {0, 2, 1, 0};
        int expected = 1;
        int result = qa69.peakIndexInMountainArray(A);
        assertEquals(expected, result);
    }

    @Test
    public void peakIndexInMountainArray_PeakAtEnd_ReturnsCorrectIndex() {
        int[] A = {0, 1, 2, 3, 4, 5, 3, 1};
        int expected = 5;
        int result = qa69.peakIndexInMountainArray(A);
        assertEquals(expected, result);
    }

    @Test
    public void peakIndexInMountainArray_PeakAtStart_ReturnsCorrectIndex() {
        int[] A = {5, 4, 3, 2, 1};
        int expected = 0;
        int result = qa69.peakIndexInMountainArray(A);
        assertEquals(expected, result);
    }

    @Test
    public void peakIndexInMountainArray_SmallMountainArray_ReturnsCorrectIndex() {
        int[] A = {0, 1, 0};
        int expected = 1;
        int result = qa69.peakIndexInMountainArray(A);
        assertEquals(expected, result);
    }

    @Test
    public void peakIndexInMountainArray_LargerMountainArray_ReturnsCorrectIndex() {
        int[] A = {1, 3, 5, 7, 9, 11, 10, 8, 6, 4, 2};
        int expected = 5;
        int result = qa69.peakIndexInMountainArray(A);
        assertEquals(expected, result);
    }
}
