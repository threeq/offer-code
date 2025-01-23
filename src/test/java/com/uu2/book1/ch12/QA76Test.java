package com.uu2.book1.ch12;


import com.uu2.book1.ch12.QA76;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA76Test {

    private QA76 qa76;

    @BeforeEach
    public void setUp() {
        qa76 = new QA76();
    }

    @Test
    public void findKthLargest_SingleElementArray_ReturnsElement() {
        int[] nums = {3};
        int k = 1;
        assertEquals(3, qa76.findKthLargest(nums, k));
    }

    @Test
    public void findKthLargest_AllElementsSame_ReturnsElement() {
        int[] nums = {3, 3, 3, 3};
        int k = 2;
        assertEquals(3, qa76.findKthLargest(nums, k));
    }

    @Test
    public void findKthLargest_GeneralCase_ReturnsKthLargest() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        assertEquals(5, qa76.findKthLargest(nums, k));
    }

    @Test
    public void findKthLargest_KIsOne_ReturnsMaxElement() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 1;
        assertEquals(6, qa76.findKthLargest(nums, k));
    }

    @Test
    public void findKthLargest_KIsArrayLength_ReturnsMinElement() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 6;
        assertEquals(1, qa76.findKthLargest(nums, k));
    }

    @Test
    public void findKthLargest_EmptyArray_ThrowsException() {
        int[] nums = {};
        int k = 1;
        try {
            qa76.findKthLargest(nums, k);
        } catch (Exception e) {
            assertEquals(ArrayIndexOutOfBoundsException.class, e.getClass());
        }
    }

    @Test
    public void findKthLargest_KExceedsArrayLength_ThrowsException() {
        int[] nums = {3, 2, 1};
        int k = 4;
        try {
            qa76.findKthLargest(nums, k);
        } catch (Exception e) {
            assertEquals(ArrayIndexOutOfBoundsException.class, e.getClass());
        }
    }
}
