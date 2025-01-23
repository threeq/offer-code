package com.uu2.book1.ch13;


import com.uu2.book1.ch13.QA82;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA82Test {

    private QA82 qa82;

    @BeforeEach
    public void setUp() {
        qa82 = new QA82();
    }

    @Test
    public void combine_EmptyArray_EmptyResult() {
        List<List<Integer>> result = qa82.combine(new int[]{}, 5);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void combine_SingleElementArray_NoValidCombination() {
        List<List<Integer>> result = qa82.combine(new int[]{1}, 5);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void combine_MultipleElementsArray_ValidCombinations() {
        List<List<Integer>> result = qa82.combine(new int[]{1, 2, 3, 4}, 5);
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(1, 4),
            Arrays.asList(2, 3)
        );
        assertEquals(expected, result);
    }

    @Test
    public void combine_TargetZero_EmptyCombination() {
        List<List<Integer>> result = qa82.combine(new int[]{1, 2, 3}, 0);
        List<List<Integer>> expected = Collections.singletonList(Collections.emptyList());
        assertEquals(expected, result);
    }

    @Test
    public void combine_TargetNegative_NoValidCombination() {
        List<List<Integer>> result = qa82.combine(new int[]{1, 2, 3}, -1);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void combine_RepeatedElements_DistinctCombinations() {
        List<List<Integer>> result = qa82.combine(new int[]{1, 2, 2, 3}, 4);
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(1, 3),
            Arrays.asList(2, 2)
        );
        assertEquals(expected, result);
    }

    @Test
    public void combine_NoValidCombination_EmptyResult() {
        List<List<Integer>> result = qa82.combine(new int[]{1, 2, 3}, 10);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void combine_AllElementsSumToTarget_SingleCombination() {
        List<List<Integer>> result = qa82.combine(new int[]{1, 2, 3}, 6);
        List<List<Integer>> expected = Collections.singletonList(Arrays.asList(1, 2, 3));
        assertEquals(expected, result);
    }
}
