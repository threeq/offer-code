package com.uu2.book1.ch14;


import com.uu2.book1.ch14.QA90;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA90Test {

    private QA90 qa90;

    @BeforeEach
    public void setUp() {
        qa90 = new QA90();
    }

    @Test
    public void rob_NullArray_ReturnsZero() {
        assertEquals(0, qa90.rob(null));
    }

    @Test
    public void rob_EmptyArray_ReturnsZero() {
        assertEquals(0, qa90.rob(new int[] {}));
    }

    @Test
    public void rob_SingleHouse_ReturnsAmount() {
        assertEquals(100, qa90.rob(new int[] {100}));
    }

    @Test
    public void rob_TwoHouses_ReturnsMax() {
        assertEquals(3, qa90.rob(new int[] {2, 3}));
    }

    @Test
    public void rob_RegularCase_ReturnsMaxAmount() {
        assertEquals(3, qa90.rob(new int[] {2, 3, 2}));
        assertEquals(4, qa90.rob(new int[] {1, 2, 3, 1}));
        assertEquals(3, qa90.rob(new int[] {3, 2, 1}));
    }

    @Test
    public void rob_AllSameAmounts_ReturnsMaxPossible() {
        assertEquals(6, qa90.rob(new int[] {1, 2, 1, 2, 1, 2}));
    }

    @Test
    public void rob_AllDifferentAmounts_ReturnsMaxPossible() {
        assertEquals(12, qa90.rob(new int[] {1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void rob_MaxAmountAtFirstOrLast_ReturnsMaxPossible() {
        assertEquals(16, qa90.rob(new int[] {6, 3, 10, 8}));
    }
}
