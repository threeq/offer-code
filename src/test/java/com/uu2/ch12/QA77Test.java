package com.uu2.ch12;


import com.uu2.ch04.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA77Test {

    private QA77 qa77;

    @BeforeEach
    public void setUp() {
        qa77 = new QA77();
    }

    @Test
    public void sortList_EmptyList_ReturnsNull() {
        ListNode head = null;
        ListNode sorted = qa77.sortList(head);
        assertEquals(null, sorted);
    }

    @Test
    public void sortList_SingleNode_ReturnsSameNode() {
        ListNode head = new ListNode(1);
        ListNode sorted = qa77.sortList(head);
        assertEquals(1, sorted.val);
        assertEquals(null, sorted.next);
    }

    @Test
    public void sortList_TwoNodes_SortsCorrectly() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        ListNode sorted = qa77.sortList(head);
        assertEquals(1, sorted.val);
        assertEquals(2, sorted.next.val);
        assertEquals(null, sorted.next.next);
    }

    @Test
    public void sortList_MultipleNodes_SortsCorrectly() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode sorted = qa77.sortList(head);
        assertEquals(1, sorted.val);
        assertEquals(2, sorted.next.val);
        assertEquals(3, sorted.next.next.val);
        assertEquals(4, sorted.next.next.next.val);
        assertEquals(null, sorted.next.next.next.next);
    }

    @Test
    public void sortList_DuplicateValues_SortsCorrectly() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        ListNode sorted = qa77.sortList(head);
        assertEquals(1, sorted.val);
        assertEquals(2, sorted.next.val);
        assertEquals(2, sorted.next.next.val);
        assertEquals(3, sorted.next.next.next.val);
        assertEquals(4, sorted.next.next.next.next.val);
        assertEquals(null, sorted.next.next.next.next.next);
    }

    @Test
    public void sortList_NegativeValues_SortsCorrectly() {
        ListNode head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);
        ListNode sorted = qa77.sortList(head);
        assertEquals(-1, sorted.val);
        assertEquals(0, sorted.next.val);
        assertEquals(3, sorted.next.next.val);
        assertEquals(4, sorted.next.next.next.val);
        assertEquals(5, sorted.next.next.next.next.val);
        assertEquals(null, sorted.next.next.next.next.next);
    }
}
