package com.uu2.ch02;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {

    private Array array;

    @BeforeEach
    public void setUp() {
        array = new Array();
    }

    @Test
    public void twoSum_FoundTargetSum_ReturnsIndices() {
        int[] nums = {1, 2, 3, 4, 7};
        int target = 7;
        int[] expected = {2, 3}; // nums[2] + nums[3] = 3 + 4 = 7
        int[] result = array.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void twoSum_FoundTargetSum_ReturnsIndices2() {
        int[] nums = {1, 2, 3, 4, 7};
        int target = 8;
        int[] expected = {0, 4}; // nums[1] + nums[5] = 3 + 4 = 7
        int[] result = array.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
    @Test
    public void twoSum_NoTargetSum_ReturnsLastIndices() {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 15;
        int[] expected = {4, 4}; // 指针未找到目标和，返回最后的索引
        int[] result = array.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void twoSum_SingleElementArray_ReturnsSameIndices() {
        int[] nums = {5};
        int target = 10;
        int[] expected = {0, 0}; // 未找到目标和，返回相同的索引
        int[] result = array.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void twoSum_EmptyArray_ReturnsSameIndices() {
        int[] nums = {};
        int target = 0;
        int[] expected = {0, -1}; // 未找到目标和，返回默认的索引
        int[] result = array.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void twoSum_TwoElementsExactTarget_ReturnsIndices() {
        int[] nums = {3, 5};
        int target = 8;
        int[] expected = {0, 1}; // nums[0] + nums[1] = 3 + 5 = 8
        int[] result = array.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }


    @Test
    public void threeSum_EmptyArray_ReturnsEmptyList() {
        int[] nums = {};
        List<List<Integer>> expected = Collections.emptyList();
        assertEquals(expected, array.threeSum(nums));
    }

    @Test
    public void threeSum_SingleElementArray_ReturnsEmptyList() {
        int[] nums = {1};
        List<List<Integer>> expected = Collections.emptyList();
        assertEquals(expected, array.threeSum(nums));
    }

    @Test
    public void threeSum_TwoElementsArray_ReturnsEmptyList() {
        int[] nums = {1, 2};
        List<List<Integer>> expected = Collections.emptyList();
        assertEquals(expected, array.threeSum(nums));
    }

    @Test
    public void threeSum_ThreeElementsArray_ReturnsValidTriplets() {
        int[] nums = {-1, 0, 1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, 1));
        assertEquals(expected, array.threeSum(nums));
    }

    @Test
    public void threeSum_MultipleValidTriplets_ReturnsAll() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected, array.threeSum(nums));
    }

    @Test
    public void threeSum_AllZeroElements_ReturnsZeroTriplet() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        assertEquals(expected, array.threeSum(nums));
    }

    @Test
    public void threeSum_NoValidTriplets_ReturnsEmptyList() {
        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> expected = Collections.emptyList();
        assertEquals(expected, array.threeSum(nums));
    }

    @Test
    public void threeSum_AllNegativeElements_ReturnsEmptyList() {
        int[] nums = {-1, -2, -3, -4};
        List<List<Integer>> expected = Collections.emptyList();
        assertEquals(expected, array.threeSum(nums));
    }

    @Test
    public void threeSum_AllPositiveElements_ReturnsEmptyList() {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> expected = Collections.emptyList();
        assertEquals(expected, array.threeSum(nums));
    }

    @Test
    public void minSubArrayLen_EmptyArray_ReturnsZero() {
        int[] nums = {};
        int k = 7;
        int expected = 0;
        int result = array.minSubArrayLen(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void minSubArrayLen_SingleElementLessThanK_ReturnsZero() {
        int[] nums = {5};
        int k = 7;
        int expected = 0;
        int result = array.minSubArrayLen(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void minSubArrayLen_SingleElementEqualToK_ReturnsOne() {
        int[] nums = {7};
        int k = 7;
        int expected = 1;
        int result = array.minSubArrayLen(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void minSubArrayLen_SingleElementGreaterThanK_ReturnsOne() {
        int[] nums = {10};
        int k = 7;
        int expected = 1;
        int result = array.minSubArrayLen(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void minSubArrayLen_AllElementsSumLessThanK_ReturnsZero() {
        int[] nums = {1, 2, 3};
        int k = 7;
        int expected = 0;
        int result = array.minSubArrayLen(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void minSubArrayLen_ValidSubarrayExists_ReturnsLength() {
        int[] nums = {5, 1, 4, 3};
        int k = 7;
        int expected = 2;
        int result = array.minSubArrayLen(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void minSubArrayLen_NoValidSubarray_ReturnsZero() {
        int[] nums = {1, 1, 1, 1};
        int k = 10;
        int expected = 0;
        int result = array.minSubArrayLen(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void minSubArrayLen_MultipleValidSubarrays_ReturnsShortest() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int k = 7;
        int expected = 2;
        int result = array.minSubArrayLen(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void numSubarrayProductLessThanK_KLessThanOne_ReturnsZero() {
        int[] nums = {10, 5, 2, 6};
        int k = 0;
        int expected = 0;
        int result = array.numSubarrayProductLessThanK(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void numSubarrayProductLessThanK_EmptyArray_ReturnsZero() {
        int[] nums = {};
        int k = 100;
        int expected = 0;
        int result = array.numSubarrayProductLessThanK(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void numSubarrayProductLessThanK_SingleElementLessThanK_ReturnsOne() {
        int[] nums = {5};
        int k = 10;
        int expected = 1;
        int result = array.numSubarrayProductLessThanK(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void numSubarrayProductLessThanK_SingleElementEqualToK_ReturnsZero() {
        int[] nums = {5};
        int k = 5;
        int expected = 0;
        int result = array.numSubarrayProductLessThanK(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void numSubarrayProductLessThanK_SingleElementGreaterThanK_ReturnsZero() {
        int[] nums = {10};
        int k = 5;
        int expected = 0;
        int result = array.numSubarrayProductLessThanK(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void numSubarrayProductLessThanK_MultipleElements_ReturnsCorrectCount() {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int expected = 8;
        int result = array.numSubarrayProductLessThanK(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void numSubarrayProductLessThanK_KEqualToProductOfMinimum_ReturnsCorrectCount() {
        int[] nums = {1, 2, 3, 4};
        int k = 4;
        int expected = 4;
        int result = array.numSubarrayProductLessThanK(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void subarraySum_EmptyArray_ReturnsZero() {
        int[] nums = {};
        int k = 0;
        int expected = 0;
        int result = array.subarraySum(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void subarraySum_SingleElementArray_ReturnsCorrectCount() {
        int[] nums = {1};
        int k = 1;
        int expected = 1;
        int result = array.subarraySum(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void subarraySum_MultipleElementsArray_ReturnsCorrectCount() {
        int[] nums = {1, 1, 1};
        int k = 2;
        int expected = 2;
        int result = array.subarraySum(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void subarraySum_ArrayWithNegativeNumbers_ReturnsCorrectCount() {
        int[] nums = {1, -1, 0};
        int k = 0;
        int expected = 3;
        int result = array.subarraySum(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void subarraySum_ArrayWithAllSameElements_ReturnsCorrectCount() {
        int[] nums = {1, 1, 1, 1, 1};
        int k = 2;
        int expected = 4;
        int result = array.subarraySum(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void subarraySum_NoValidSubarray_ReturnsZero() {
        int[] nums = {1, 2, 3};
        int k = 7;
        int expected = 0;
        int result = array.subarraySum(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void findMaxLength_EmptyArray_ReturnsZero() {
        int[] nums = {};
        int expected = 0;
        int result = array.findMaxLength(nums);
        assertEquals(expected, result);
    }

    @Test
    public void findMaxLength_SingleElementArray_ReturnsZero() {
        int[] nums = {0};
        int expected = 0;
        int result = array.findMaxLength(nums);
        assertEquals(expected, result);
    }

    @Test
    public void findMaxLength_AllZeros_ReturnsZero() {
        int[] nums = {0, 0, 0};
        int expected = 0;
        int result = array.findMaxLength(nums);
        assertEquals(expected, result);
    }

    @Test
    public void findMaxLength_AllOnes_ReturnsZero() {
        int[] nums = {1, 1, 1};
        int expected = 0;
        int result = array.findMaxLength(nums);
        assertEquals(expected, result);
    }

    @Test
    public void findMaxLength_MixedArray_ReturnsCorrectLength() {
        int[] nums = {0, 1, 0, 1, 0};
        int expected = 4;
        int result = array.findMaxLength(nums);
        assertEquals(expected, result);
    }

    @Test
    public void findMaxLength_MultipleSolutions_ReturnsLongest() {
        int[] nums = {0, 1, 0, 1, 0, 1};
        int expected = 6;
        int result = array.findMaxLength(nums);
        assertEquals(expected, result);
    }

    @Test
    public void findMaxLength_AlternatingArray_ReturnsFullLength() {
        int[] nums = {0, 1, 0, 1, 0, 1, 0, 1};
        int expected = 8;
        int result = array.findMaxLength(nums);
        assertEquals(expected, result);
    }

    @Test
    public void pivotIndex_EmptyArray_ReturnsMinusOne() {
        int[] nums = {};
        assertEquals(-1, array.pivotIndex(nums));
    }

    @Test
    public void pivotIndex_SingleElementArray_ReturnsMinusOne() {
        int[] nums = {1};
        assertEquals(0, array.pivotIndex(nums));
    }

    @Test
    public void pivotIndex_PivotExists_ReturnsPivotIndex() {
        int[] nums = {1, 7, 3, 6, 2, 9};
        assertEquals(3, array.pivotIndex(nums));
    }

    @Test
    public void pivotIndex_NoPivot_ReturnsMinusOne() {
        int[] nums = {1, 2, 3};
        assertEquals(-1, array.pivotIndex(nums));
    }

    @Test
    public void pivotIndex_MultiplePivots_ReturnsLeftmostPivot() {
        int[] nums = {1, 2, 3, 3, 2, 1};
        assertEquals(-1, array.pivotIndex(nums));
    }
}
