package com.uu2.book1.ch13;


import com.uu2.book1.ch13.QA80;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA80Test {

    private QA80 qa80;

    @BeforeEach
    public void setUp() {
        qa80 = new QA80();
    }

    @Test
    public void combine_ValidInput_ReturnsCombinations() {
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(1, 4),
                Arrays.asList(2, 3),
                Arrays.asList(2, 4),
                Arrays.asList(3, 4)
        );
        List<List<Integer>> result = qa80.combine(4, 2);
        assertEquals(expected, result);
    }

    @Test
    public void combine_KGreaterThanN_ReturnsEmptyList() {
        List<List<Integer>> result = qa80.combine(5, 6);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void combine_KLessThanOrEqualToZero_ReturnsEmptyList() {
        List<List<Integer>> result = qa80.combine(5, 0);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void combine_SingleElement_ReturnsSingleElementCombination() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1));
        List<List<Integer>> result = qa80.combine(1, 1);
        assertEquals(expected, result);
    }

    @Test
    public void combine_SingleElementWithZeroK_ReturnsEmptyList() {
        List<List<Integer>> result = qa80.combine(1, 0);
        assertEquals(Collections.emptyList(), result);
    }
}
