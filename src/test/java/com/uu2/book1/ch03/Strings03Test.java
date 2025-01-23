package com.uu2.book1.ch03;


import com.uu2.book1.ch03.Strings03;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Strings03Test {

    private Strings03 strings03;

    @BeforeEach
    public void setUp() {
        strings03 = new Strings03();
    }

    @Test
    public void checkInclusion_S2ShorterThanS1_False() {
        assertFalse(strings03.checkInclusion("abc", "ab"));
    }

    @Test
    public void checkInclusion_InitialWindowIsPermutation_True() {
        assertTrue(strings03.checkInclusion("abc", "abc"));
    }

    @Test
    public void checkInclusion_SlidingWindowFindsPermutation_True() {
        assertTrue(strings03.checkInclusion("abc", "cbad"));
    }

    @Test
    public void checkInclusion_NoPermutationFound_False() {
        assertFalse(strings03.checkInclusion("abc", "def"));
    }

    @Test
    public void checkInclusion_NoMatchingPermutation_False() {
        assertFalse(strings03.checkInclusion("abc", "xyz"));
    }

    @Test
    public void findAnagrams_EmptyStrings_ReturnsEmptyList() {
        List<Integer> result = strings03.findAnagrams("", "");
        assertEquals(Arrays.asList(0), result);
    }

    @Test
    public void findAnagrams_S2LongerThanS1_ReturnsEmptyList() {
        List<Integer> result = strings03.findAnagrams("abc", "abcd");
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void findAnagrams_S2IsAnAnagramOfS1_ReturnsCorrectIndices() {
        List<Integer> result = strings03.findAnagrams("abab", "ab");
        assertEquals(Arrays.asList(0, 1, 2), result);
    }
    @Test
    public void findAnagrams_S2IsAnAnagramOfS1_ReturnsCorrectIndices2() {
        List<Integer> result = strings03.findAnagrams("abab", "ba");
        assertEquals(Arrays.asList(0, 1, 2), result);
    }

    @Test
    public void findAnagrams_S2IsNotAnAnagramOfS1_ReturnsEmptyList() {
        List<Integer> result = strings03.findAnagrams("abc", "def");
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void findAnagrams_MultipleAnagrams_ReturnsCorrectIndices() {
        List<Integer> result = strings03.findAnagrams("cbadabacg", "abc");
        assertEquals(Arrays.asList(0, 5), result);
    }

    @Test
    public void findAnagrams_PartialAnagram_ReturnsCorrectIndices() {
        List<Integer> result = strings03.findAnagrams("aabbcc", "abc");
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void lengthOfLongestSubstring_EmptyString_ReturnsZero() {
        assertEquals(0, strings03.lengthOfLongestSubstring(""));
    }

    @Test
    public void lengthOfLongestSubstring_AllUniqueCharacters_ReturnsLength() {
        assertEquals(3, strings03.lengthOfLongestSubstring("abc"));
    }

    @Test
    public void lengthOfLongestSubstring_AllSameCharacters_ReturnsOne() {
        assertEquals(1, strings03.lengthOfLongestSubstring("aaa"));
    }

    @Test
    public void lengthOfLongestSubstring_MixedCharacters_ReturnsCorrectLength() {
        assertEquals(3, strings03.lengthOfLongestSubstring("abca"));
    }

    @Test
    public void lengthOfLongestSubstring_RepeatedCharactersInMiddle_ReturnsCorrectLength() {
        assertEquals(3, strings03.lengthOfLongestSubstring("abac"));
    }

    @Test
    public void lengthOfLongestSubstring_RepeatedCharactersAtEnd_ReturnsCorrectLength() {
        assertEquals(3, strings03.lengthOfLongestSubstring("abcabc"));
    }

    @Test
    public void lengthOfLongestSubstring_RepeatedCharactersAtStart_ReturnsCorrectLength() {
        assertEquals(3, strings03.lengthOfLongestSubstring("aabc"));
    }

    @Test
    public void lengthOfLongestSubstring_TypicalString_ReturnsCorrectLength() {
        assertEquals(3, strings03.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void minWindow_EmptyS_ReturnsEmptyString() {
        assertEquals("", strings03.minWindow("", "ABC"));
    }

    @Test
    public void minWindow_EmptyT_ReturnsEmptyString() {
        assertEquals("", strings03.minWindow("ADDBANCAD", ""));
    }

    @Test
    public void minWindow_NoSolution_ReturnsEmptyString() {
        assertEquals("", strings03.minWindow("ADDBANCAD", "XYZ"));
    }

    @Test
    public void minWindow_SingleSolution_ReturnsCorrectSubstring() {
        assertEquals("BANC", strings03.minWindow("ADDBANCAD", "ABC"));
    }

    @Test
    public void minWindow_MultipleSolutions_ReturnsAnyCorrectSubstring() {
        assertEquals("BANC", strings03.minWindow("ADDBANCAD", "ABC"));
    }

    @Test
    public void minWindow_BoundaryCase_ReturnsCorrectSubstring() {
        assertEquals("A", strings03.minWindow("A", "A"));
    }

    @Test
    public void minWindow_BoundaryCaseNoSolution_ReturnsEmptyString() {
        assertEquals("", strings03.minWindow("A", "B"));
    }

    @Test
    public void minWindow_LongString_ReturnsCorrectSubstring() {
        assertEquals("BANC", strings03.minWindow("ADDBANCAD", "ABC"));
    }

    @Test
    public void isPalindrome_EmptyString_ReturnsTrue() {
        assertTrue(strings03.isPalindrome(""));
    }

    @Test
    public void isPalindrome_SingleCharacter_ReturnsTrue() {
        assertTrue(strings03.isPalindrome("a"));
    }

    @Test
    public void isPalindrome_AlphanumericPalindrome_ReturnsTrue() {
        assertTrue(strings03.isPalindrome("racecar"));
    }

    @Test
    public void isPalindrome_AlphanumericNonPalindrome_ReturnsFalse() {
        assertFalse(strings03.isPalindrome("hello"));
    }

    @Test
    public void isPalindrome_MixedCharactersPalindrome_ReturnsTrue() {
        assertTrue(strings03.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void isPalindrome_MixedCharactersNonPalindrome_ReturnsFalse() {
        assertFalse(strings03.isPalindrome("race a car"));
    }

    @Test
    public void isPalindrome_CaseInsensitivePalindrome_ReturnsTrue() {
        assertTrue(strings03.isPalindrome("Noon"));
    }

    @Test
    public void isPalindrome_CaseInsensitiveNonPalindrome_ReturnsFalse() {
        assertFalse(strings03.isPalindrome("Noon1"));
    }

    @Test
    public void validPalindrome_EmptyString_ReturnsTrue() {
        assertTrue(strings03.validPalindrome(""));
    }

    @Test
    public void validPalindrome_AlreadyPalindrome_ReturnsTrue() {
        assertTrue(strings03.validPalindrome("racecar"));
    }

    @Test
    public void validPalindrome_DeleteOneCharToPalindrome_ReturnsTrue() {
        assertTrue(strings03.validPalindrome("abca"));
    }

    @Test
    public void validPalindrome_DeleteMoreThanOneChar_ReturnsFalse() {
        assertFalse(strings03.validPalindrome("abcde"));
    }

    @Test
    public void validPalindrome_SingleCharacter_ReturnsTrue() {
        assertTrue(strings03.validPalindrome("a"));
    }

    @Test
    public void validPalindrome_TwoCharactersSame_ReturnsTrue() {
        assertTrue(strings03.validPalindrome("aa"));
    }

    @Test
    public void validPalindrome_TwoCharactersDifferent_ReturnsTrue() {
        assertTrue(strings03.validPalindrome("ab"));
    }

    @Test
    public void validPalindrome_LongStringWithOneMismatch_ReturnsTrue() {
        assertTrue(strings03.validPalindrome("abccba"));
    }

    @Test
    public void validPalindrome_LongStringWithTwoMismatches_ReturnsFalse() {
        assertFalse(strings03.validPalindrome("abcdeba"));
    }

    @Test
    public void countSubstrings_EmptyString_ReturnsZero() {
        assertEquals(0, strings03.countSubstrings(""));
    }

    @Test
    public void countSubstrings_SingleCharacter_ReturnsOne() {
        assertEquals(1, strings03.countSubstrings("a"));
    }

    @Test
    public void countSubstrings_AllCharactersSame_ReturnsCorrectCount() {
        assertEquals(6, strings03.countSubstrings("aaa"));
    }

    @Test
    public void countSubstrings_MixedCharacters_ReturnsCorrectCount() {
        assertEquals(3, strings03.countSubstrings("abc"));
    }

    @Test
    public void countSubstrings_PalindromeOddLength_ReturnsCorrectCount() {
        assertEquals(4, strings03.countSubstrings("aba"));
    }

    @Test
    public void countSubstrings_PalindromeEvenLength_ReturnsCorrectCount() {
        assertEquals(6, strings03.countSubstrings("abba"));
    }

    @Test
    public void countSubstrings_MixedOddAndEvenPalindromes_ReturnsCorrectCount() {
        assertEquals(9, strings03.countSubstrings("ababa"));
    }

    @Test
    public void countSubstrings_NoPalindromes_ReturnsCorrectCount() {
        assertEquals(6, strings03.countSubstrings("abcdef"));
    }

}
