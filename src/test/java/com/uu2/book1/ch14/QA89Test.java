package com.uu2.book1.ch14;


import com.uu2.book1.ch14.QA89;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA89Test {
    private QA89 qa89;

    @BeforeEach
    public void setUp() {
        qa89 = new QA89();
    }

    @Test
    public void rob_NullArray_ReturnsZero() {
        assertEquals(0, qa89.rob(null));
    }

    @Test
    public void rob_EmptyArray_ReturnsZero() {
        assertEquals(0, qa89.rob(new int[]{}));
    }

    @Test
    public void rob_SingleHouse_ReturnsHouseValue() {
        assertEquals(10, qa89.rob(new int[]{10}));
    }

    @Test
    public void rob_TwoHouses_ReturnsMaxValue() {
        assertEquals(15, qa89.rob(new int[]{10, 15}));
    }

    @Test
    public void rob_MultipleHouses_ReturnsMaxSum() {
        assertEquals(12, qa89.rob(new int[]{2, 7, 9, 3, 1}));
    }


    @Test
    public void robOn_NullArray_ReturnsZero() {
        assertEquals(0, qa89.robOn(null));
    }

    @Test
    public void robOn_EmptyArray_ReturnsZero() {
        assertEquals(0, qa89.robOn(new int[]{}));
    }

    @Test
    public void robOn_SingleHouse_ReturnsHouseValue() {
        assertEquals(10, qa89.robOn(new int[]{10}));
    }

    @Test
    public void robOn_TwoHouses_ReturnsMaxValue() {
        assertEquals(15, qa89.robOn(new int[]{10, 15}));
    }

    @Test
    public void robOn_MultipleHouses_ReturnsMaxSum() {
        assertEquals(12, qa89.robOn(new int[]{2, 7, 9, 3, 1}));
    }


    @Test
    public void robO_NullArray_ReturnsZero() {
        assertEquals(0, qa89.robO(null));
    }

    @Test
    public void robO_EmptyArray_ReturnsZero() {
        assertEquals(0, qa89.robO(new int[]{}));
    }

    @Test
    public void robO_SingleHouse_ReturnsHouseValue() {
        assertEquals(10, qa89.robO(new int[]{10}));
    }

    @Test
    public void robO_TwoHouses_ReturnsMaxValue() {
        assertEquals(15, qa89.robO(new int[]{10, 15}));
    }

    @Test
    public void robO_MultipleHouses_ReturnsMaxSum() {
        assertEquals(12, qa89.robO(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    public void rob2_NullArray_ReturnsZero() {
        assertEquals(0, qa89.rob2(null));
    }

    @Test
    public void rob2_EmptyArray_ReturnsZero() {
        assertEquals(0, qa89.rob2(new int[]{}));
    }

    @Test
    public void rob2_SingleHouse_ReturnsHouseValue() {
        assertEquals(10, qa89.rob2(new int[]{10}));
    }

    @Test
    public void rob2_TwoHouses_ReturnsMaxValue() {
        assertEquals(15, qa89.rob2(new int[]{10, 15}));
    }

    @Test
    public void rob2_MultipleHouses_ReturnsMaxSum() {
        assertEquals(12, qa89.rob2(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    public void rob2_AllSameValues_ReturnsCorrectSum() {
        assertEquals(10, qa89.rob2(new int[]{5, 5, 5, 5}));
    }

    @Test
    public void rob2_AllZeroValues_ReturnsZero() {
        assertEquals(0, qa89.rob2(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void rob2_MixedValues_ReturnsMaxSum() {
        assertEquals(30, qa89.rob2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
