package com.uu2.ch01;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTest {

    private Binary binary;

    @BeforeEach
    public void setUp() {
        binary = new Binary();
    }

    @Test
    public void add_EqualLengthNoCarry_CorrectResult() {
        String a = "1010";
        String b = "0101";
        String expected = "1111";
        assertEquals(expected, binary.add(a, b));
    }

    @Test
    public void add_DifferentLengths_CorrectResult() {
        String a = "101";
        String b = "1101";
        String expected = "10010";
        assertEquals(expected, binary.add(a, b));
    }

    @Test
    public void add_WithCarry_CorrectResult() {
        String a = "111";
        String b = "111";
        String expected = "1110";
        assertEquals(expected, binary.add(a, b));
    }

    @Test
    public void add_EmptyStrings_CorrectResult() {
        String a = "";
        String b = "";
        String expected = "";
        assertEquals(expected, binary.add(a, b));
    }

    @Test
    public void add_SingleCharacterStrings_CorrectResult() {
        String a = "1";
        String b = "1";
        String expected = "10";
        assertEquals(expected, binary.add(a, b));
    }

    @Test
    public void countBits_ZeroInput_CorrectResult() {
        int[] expected = {0};
        assertArrayEquals(expected, binary.countBits(0));
    }

    @Test
    public void countBits_OneInput_CorrectResult() {
        int[] expected = {0, 1};
        assertArrayEquals(expected, binary.countBits(1));
    }

    @Test
    public void countBits_TwoInput_CorrectResult() {
        int[] expected = {0, 1, 1};
        assertArrayEquals(expected, binary.countBits(2));
    }

    @Test
    public void countBits_ThreeInput_CorrectResult() {
        int[] expected = {0, 1, 1, 2};
        assertArrayEquals(expected, binary.countBits(3));
    }

    @Test
    public void countBits_TenInput_CorrectResult() {
        int[] expected = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2};
        assertArrayEquals(expected, binary.countBits(10));
    }

    @Test
    public void countBits_LargerInput_CorrectResult() {
        int[] expected = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5};
        assertArrayEquals(expected, binary.countBits(31));
    }

    @Test
    public void singleNumber2_EmptyArray_ReturnsZero() {
        int[] nums = {};
        assertEquals(0, binary.singleNumber2(nums));
    }

    @Test
    public void singleNumber2_SingleElement_ReturnsElement() {
        int[] nums = {42};
        assertEquals(42, binary.singleNumber2(nums));
    }

    @Test
    public void singleNumber2_MultipleElementsSingleUnique_ReturnsUnique() {
        int[] nums = {4, 1, 2, 1, 2};
        assertEquals(4, binary.singleNumber2(nums));
    }

    @Test
    public void singleNumber2_AllPairs_ReturnsZero() {
        int[] nums = {1, 1, 2, 2, 3, 3};
        assertEquals(0, binary.singleNumber2(nums));
    }

    @Test
    public void singleNumber2_MultipleUniqueNumbers_ReturnsXorOfUniqueNumbers() {
        int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        assertEquals(5, binary.singleNumber2(nums));
    }


    @Test
    public void singleNumber3_EmptyArray_ReturnsZero() {
        int[] nums = {};
        assertEquals(0, binary.singleNumber3(nums));
    }

    @Test
    public void singleNumber3_SingleElement_ReturnsElement() {
        int[] nums = {42};
        assertEquals(42, binary.singleNumber3(nums));
    }

    @Test
    public void singleNumber3_AllElementsAppearThreeTimes_ReturnsZero() {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3};
        assertEquals(0, binary.singleNumber3(nums));
    }

    @Test
    public void singleNumber3_OneElementAppearsOnceOthersThreeTimes_ReturnsUniqueElement() {
        int[] nums = {1, 1, 1, 2, 2, 2, 3};
        assertEquals(3, binary.singleNumber3(nums));
    }

    @Test
    public void singleNumber3_MixedElements_ReturnsUniqueElement() {
        int[] nums = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10};
        assertEquals(10, binary.singleNumber3(nums));
    }
}
