package com.uu2.book1.ch09;


import com.uu2.book1.ch09.QA60;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA60Test {

    private QA60 qa60;

    @BeforeEach
    public void setUp() {
        qa60 = new QA60();
    }

    @Test
    public void topK_EmptyArray_ReturnsEmptyList() {
        int[] nums = {};
        int k = 1;
        List<Integer> result = qa60.topK(nums, k);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void topK_SingleElement_ReturnsElement() {
        int[] nums = {1};
        int k = 1;
        List<Integer> result = qa60.topK(nums, k);
        assertEquals(Arrays.asList(1), result);
    }

    @Test
    public void topK_AllSameElements_ReturnsElement() {
        int[] nums = {1, 1, 1, 1};
        int k = 1;
        List<Integer> result = qa60.topK(nums, k);
        assertEquals(Arrays.asList(1), result);
    }

    @Test
    public void topK_AllDifferentElements_ReturnsAllElements() {
        int[] nums = {1, 2, 3, 4};
        int k = 2;
        List<Integer> result = qa60.topK(nums, k);
        assertEquals(Arrays.asList(4,2), result);
    }

    @Test
    public void topK_MixedFrequencies_ReturnsTopKElements() {
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 5, 5};
        int k = 2;
        List<Integer> result = qa60.topK(nums, k);
        assertEquals(Arrays.asList(2, 5), result);
    }

    @Test
    public void topK_KGreaterThanUniqueElements_ReturnsAllUniqueElements() {
        int[] nums = {1, 2, 3};
        int k = 5;
        List<Integer> result = qa60.topK(nums, k);
        assertEquals(Arrays.asList(1,3,2), result);
    }

    @Test
    public void topK_KEqualsUniqueElements_ReturnsAllUniqueElements() {
        int[] nums = {1, 2, 3};
        int k = 3;
        List<Integer> result = qa60.topK(nums, k);
        assertEquals(Arrays.asList(1,3,2), result);
    }

    @Test
    public void topK_KLessThanUniqueElements_ReturnsTopKElements() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        List<Integer> result = qa60.topK(nums, k);
        assertEquals(Arrays.asList(5,3,2), result);
    }
}
