package com.uu2.book1.ch12;


import com.uu2.book1.ch04.ListNode;
import com.uu2.book1.ch12.QA78;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QA78Test {

    private QA78 qa78;

    @BeforeEach
    public void setUp() {
        qa78 = new QA78();
    }

    @Test
    public void mergeKLists_NullInput_ReturnsNull() {
        ListNode[] lists = null;
        ListNode result = qa78.mergeKLists(lists);
        assertNull(result);
    }

    @Test
    public void mergeKLists_EmptyArray_ReturnsNull() {
        ListNode[] lists = new ListNode[0];
        ListNode result = qa78.mergeKLists(lists);
        assertNull(result);
    }

    @Test
    public void mergeKLists_SingleList_ReturnsSameList() {
        ListNode[] lists = new ListNode[1];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(2);
        lists[0].next.next = new ListNode(3);

        ListNode result = qa78.mergeKLists(lists);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
    }

    @Test
    public void mergeKLists_MultipleLists_ReturnsMerged() {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode result = qa78.mergeKLists(lists);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.next.val);
        assertEquals(6, result.next.next.next.next.next.next.next.val);
    }

    @Test
    public void mergeKLists_ContainsNull_ReturnsMerged() {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = null;

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode result = qa78.mergeKLists(lists);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(5, result.next.next.next.val);
        assertEquals(6, result.next.next.next.next.val);
    }

    @Test
    public void mergeKLists_AllEmpty_ReturnsNull() {
        ListNode[] lists = new ListNode[3];
        lists[0] = null;
        lists[1] = null;
        lists[2] = null;

        ListNode result = qa78.mergeKLists(lists);
        assertNull(result);
    }

    @Test
    public void mergeKLists2_NullInput_ReturnsNull() {
        ListNode[] lists = null;
        ListNode result = qa78.mergeKLists2(lists);
        assertNull(result);
    }

    @Test
    public void mergeKLists2_EmptyArray_ReturnsNull() {
        ListNode[] lists = new ListNode[0];
        ListNode result = qa78.mergeKLists2(lists);
        assertNull(result);
    }

    @Test
    public void mergeKLists2_SingleList_ReturnsSameList() {
        ListNode[] lists = new ListNode[1];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(2);
        lists[0].next.next = new ListNode(3);

        ListNode result = qa78.mergeKLists2(lists);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
    }

    @Test
    public void mergeKLists2_MultipleLists_ReturnsMerged() {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode result = qa78.mergeKLists2(lists);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.next.val);
        assertEquals(6, result.next.next.next.next.next.next.next.val);
    }

    @Test
    public void mergeKLists2_ContainsNull_ReturnsMerged() {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = null;

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode result = qa78.mergeKLists2(lists);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(5, result.next.next.next.val);
        assertEquals(6, result.next.next.next.next.val);
    }

    @Test
    public void mergeKLists2_AllEmpty_ReturnsNull() {
        ListNode[] lists = new ListNode[3];
        lists[0] = null;
        lists[1] = null;
        lists[2] = null;

        ListNode result = qa78.mergeKLists2(lists);
        assertNull(result);
    }
}
