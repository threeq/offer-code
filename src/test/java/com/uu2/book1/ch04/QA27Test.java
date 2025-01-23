package com.uu2.book1.ch04;


import com.uu2.book1.ch04.ListNode;
import com.uu2.book1.ch04.QA27;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA27Test {

    private QA27 qa27;

    @BeforeEach
    public void setUp() {
        qa27 = new QA27();
    }

    @Test
    public void isPalindrome_EmptyList_ReturnsTrue() {
        assertTrue(qa27.isPalindrome(null));
    }

    @Test
    public void isPalindrome_SingleNode_ReturnsTrue() {
        ListNode head = new ListNode(1);
        assertTrue(qa27.isPalindrome(head));
    }

    @Test
    public void isPalindrome_EvenLengthPalindrome_ReturnsTrue() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        assertTrue(qa27.isPalindrome(head));
    }

    @Test
    public void isPalindrome_OddLengthPalindrome_ReturnsTrue() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        assertTrue(qa27.isPalindrome(head));
    }

    @Test
    public void isPalindrome_NotPalindrome_ReturnsFalse() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        assertFalse(qa27.isPalindrome(head));
    }
}
