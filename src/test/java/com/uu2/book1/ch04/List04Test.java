package com.uu2.book1.ch04;


import com.uu2.book1.ch04.List04;
import com.uu2.book1.ch04.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class List04Test {

    private List04 list04;

    @BeforeEach
    public void setUp() {
        list04 = new List04();
    }

    @Test
    public void removeNthFromEnd_EmptyList_ReturnsNull() {
        ListNode result = list04.removeNthFromEnd(null, 1);
        assertNull(result);
    }

    @Test
    public void removeNthFromEnd_SingleNodeList_RemovesNode() {
        ListNode head = new ListNode(1);
        ListNode result = list04.removeNthFromEnd(head, 1);
        assertNull(result);
    }

    @Test
    public void removeNthFromEnd_RemoveHeadNode_RemovesHead() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = list04.removeNthFromEnd(head, 2);
        assertEquals(2, result.val);
        assertNull(result.next);
    }

    @Test
    public void removeNthFromEnd_RemoveTailNode_RemovesTail() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = list04.removeNthFromEnd(head, 1);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    public void removeNthFromEnd_RemoveMiddleNode_RemovesNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = list04.removeNthFromEnd(head, 2);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(4, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void removeNthFromEnd_InvalidN_NoChange() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = list04.removeNthFromEnd(head, 3);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    public void detectCycle_EmptyList_ReturnsNull() {
        ListNode result = list04.detectCycle(null);
        assertNull(result);
    }

    @Test
    public void detectCycle_NoCycle_ReturnsNull() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode result = list04.detectCycle(head);
        assertNull(result);
    }

    @Test
    public void detectCycle_CycleAtStart_ReturnsStartNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head; // 创建循环
        ListNode result = list04.detectCycle(head);
        assertEquals(head, result);
    }

    @Test
    public void detectCycle_CycleInMiddle_ReturnsCycleStartNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head.next; // 从节点2开始循环
        ListNode result = list04.detectCycle(head);
        assertEquals(head.next, result);
    }

    @Test
    public void detectCycle_CycleAtEnd_ReturnsCycleStartNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next.next; // 从节点3开始循环
        ListNode result = list04.detectCycle(head);
        assertEquals(head.next.next, result);
    }

    @Test
    public void detectCycle1_EmptyList_ReturnsNull() {
        ListNode head = null;
        ListNode result = list04.detectCycle1(head);
        assertNull(result);
    }

    @Test
    public void detectCycle1_SingleNodeNoCycle_ReturnsNull() {
        ListNode head = new ListNode(1);
        ListNode result = list04.detectCycle1(head);
        assertNull(result);
    }

    @Test
    public void detectCycle1_NoCycle_ReturnsNull() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode result = list04.detectCycle1(head);
        assertNull(result);
    }

    @Test
    public void detectCycle1_CycleExists_ReturnsCycleStartNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head.next; // 创建循环

        ListNode result = list04.detectCycle1(head);
        assertEquals(head.next, result);
    }

    @Test
    public void getIntersectionNode_BothListsEmpty_ReturnsNull() {
        ListNode result = list04.getIntersectionNode(null, null);
        assertNull(result);
    }

    @Test
    public void getIntersectionNode_ListAEmpty_ReturnsNull() {
        ListNode headB = new ListNode(1);
        ListNode result = list04.getIntersectionNode(null, headB);
        assertNull(result);
    }

    @Test
    public void getIntersectionNode_ListBEmpty_ReturnsNull() {
        ListNode headA = new ListNode(1);
        ListNode result = list04.getIntersectionNode(headA, null);
        assertNull(result);
    }

    @Test
    public void getIntersectionNode_NoIntersection_ReturnsNull() {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        ListNode headB = new ListNode(3);
        headB.next = new ListNode(4);
        ListNode result = list04.getIntersectionNode(headA, headB);
        assertNull(result);
    }

    @Test
    public void getIntersectionNode_IntersectionExists_ReturnsIntersectionNode() {
        ListNode intersection = new ListNode(8);
        intersection.next = new ListNode(10);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(6);
        headA.next.next = intersection;

        ListNode headB = new ListNode(7);
        headB.next = new ListNode(2);
        headB.next.next = intersection;

        ListNode result = list04.getIntersectionNode(headA, headB);
        assertEquals(intersection, result);
    }

    @Test
    public void getIntersectionNode_DifferentLengths_ReturnsIntersectionNode() {
        ListNode intersection = new ListNode(8);
        intersection.next = new ListNode(10);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(1);
        headA.next.next.next = intersection;

        ListNode headB = new ListNode(7);
        headB.next = new ListNode(2);
        headB.next.next = intersection;

        ListNode result = list04.getIntersectionNode(headA, headB);
        assertEquals(intersection, result);
    }
}
