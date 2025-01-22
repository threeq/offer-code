package com.uu2.ch12;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QA75Test {

    private QA75 qa76;

    @BeforeEach
    public void setUp() {
        qa76 = new QA75();
    }

    @Test
    public void relativeSortArray_EmptyArrays_ReturnsEmptyArray() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = {};
        assertArrayEquals(expected, qa76.relativeSortArray(arr1, arr2));
    }

    @Test
    public void relativeSortArray_NoOverlap_ReturnsSortedArray() {
        int[] arr1 = {2, 3, 1};
        int[] arr2 = {4, 5, 6};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, qa76.relativeSortArray(arr1, arr2));
    }

    @Test
    public void relativeSortArray_AllElementsInArr2_ReturnsSortedByArr2Order() {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] expected = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        assertArrayEquals(expected, qa76.relativeSortArray(arr1, arr2));
    }

    @Test
    public void relativeSortArray_ElementsNotInArr2_SortedAtEnd() {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9};
        int[] expected = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        assertArrayEquals(expected, qa76.relativeSortArray(arr1, arr2));
    }

    @Test
    public void relativeSortArray_DuplicatesInArr1_ReturnsSortedByArr2Order() {
        int[] arr1 = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        int[] arr2 = {2, 1, 4, 3, 9};
        int[] expected = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        assertArrayEquals(expected, qa76.relativeSortArray(arr1, arr2));
    }

    @Test
    public void relativeSortArray_DuplicatesInArr2_IgnoresDuplicatesInArr2() {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 2, 1, 4, 3, 9};
        int[] expected = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        assertArrayEquals(expected, qa76.relativeSortArray(arr1, arr2));
    }

    @Test
    public void relativeSortArray_MixedDuplicates_ReturnsSortedByArr2Order() {
        int[] arr1 = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 9};
        int[] expected = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        assertArrayEquals(expected, qa76.relativeSortArray(arr1, arr2));
    }
}
