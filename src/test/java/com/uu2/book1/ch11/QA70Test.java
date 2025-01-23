package com.uu2.book1.ch11;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.uu2.book1.ch11.QA70;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA70Test {

    private QA70 qa70;

    @BeforeEach
    public void setUp() {
        qa70 = new QA70();
    }

    @Test
    public void singleNonDuplicate_UniqueNumberAtStart_ReturnsUniqueNumber() {
        int[] nums = {1, 2, 2, 3, 3, 4, 4};
        assertEquals(1, qa70.singleNonDuplicate(nums));
    }

    @Test
    public void singleNonDuplicate_UniqueNumberInMiddle_ReturnsUniqueNumber() {
        int[] nums = {1, 1, 2, 3, 3, 4, 4};
        assertEquals(2, qa70.singleNonDuplicate(nums));
    }

    @Test
    public void singleNonDuplicate_UniqueNumberAtEnd_ReturnsUniqueNumber() {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        assertEquals(4, qa70.singleNonDuplicate(nums));
    }

    @Test
    public void singleNonDuplicate_UniqueNumberInComplexCase_ReturnsUniqueNumber() {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        assertEquals(3, qa70.singleNonDuplicate(nums));
    }

    @Test
    public void singleNonDuplicate_SingleElementArray_ReturnsElement() {
        int[] nums = {1};
        assertEquals(1, qa70.singleNonDuplicate(nums));
    }
}
