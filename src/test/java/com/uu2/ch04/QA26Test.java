package com.uu2.ch04;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA26Test {

    private QA26 qa26;

    @BeforeEach
    public void setUp() {
        qa26 = new QA26();
    }

    @Test
    public void reorderList_EmptyList_ShouldRemainEmpty() {
        ListNode head = null;
        qa26.reorderList(head);
        assertEquals(null, head);
    }

    @Test
    public void reorderList_SingleNode_ShouldRemainUnchanged() {
        ListNode head = new ListNode(1);
        qa26.reorderList(head);
        assertEquals(1, head.val);
        assertEquals(null, head.next);
    }

    @Test
    public void reorderList_TwoNodes_ShouldRemainUnchanged() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        qa26.reorderList(head);
        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(null, head.next.next);
    }

    @Test
    public void reorderList_EvenNumberOfNodes_ShouldReorderCorrectly() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        qa26.reorderList(head);
        assertEquals(1, head.val);
        assertEquals(4, head.next.val);
        assertEquals(2, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
        assertEquals(null, head.next.next.next.next);
    }

    @Test
    public void reorderList_OddNumberOfNodes_ShouldReorderCorrectly() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        qa26.reorderList(head);
        assertEquals(1, head.val);
        assertEquals(5, head.next.val);
        assertEquals(2, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(3, head.next.next.next.next.val);
        assertEquals(null, head.next.next.next.next.next);
    }
}
