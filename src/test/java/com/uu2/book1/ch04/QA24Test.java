package com.uu2.book1.ch04;


import com.uu2.book1.ch04.ListNode;
import com.uu2.book1.ch04.QA24;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QA24Test {

    private QA24 qa24;

    @BeforeEach
    public void setUp() {
        qa24 = new QA24();
    }

    @Test
    public void reverseList_EmptyList_ReturnsNull() {
        assertNull(qa24.reverseList(null));
    }

    @Test
    public void reverseList_SingleNode_ReturnsSameNode() {
        ListNode node = new ListNode(1);
        ListNode reversed = qa24.reverseList(node);
        assertSame(node, reversed);
        assertNull(reversed.next);
    }

    @Test
    public void reverseList_MultipleNodes_ReversesList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode reversed = qa24.reverseList(head);

        assertEquals(4, reversed.val);
        assertEquals(3, reversed.next.val);
        assertEquals(2, reversed.next.next.val);
        assertEquals(1, reversed.next.next.next.val);
        assertNull(reversed.next.next.next.next);
    }

    @Test
    public void reverseList_TwoNodes_ReversesList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode reversed = qa24.reverseList(head);

        assertEquals(2, reversed.val);
        assertEquals(1, reversed.next.val);
        assertNull(reversed.next.next);
    }
}
