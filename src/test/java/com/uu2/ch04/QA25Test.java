package com.uu2.ch04;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QA25Test {

    private final QA25 qa25 = new QA25();

    @Test
    public void addTwoNumbers_EmptyLists_ReturnsZero() {

        ListNode result = qa25.addTwoNumbers(null, null);

        assertEquals(null, result);
    }

    @Test
    public void addTwoNumbers_SingleDigitNumbers_ReturnsSum() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);

        ListNode expected = new ListNode(5);

        ListNode result = qa25.addTwoNumbers(l1, l2);

        assertEquals(expected.val, result.val);
        assertEquals(null, result.next); // 确保没有多余的节点
    }

    @Test
    public void addTwoNumbers_DifferentLengthLists_ReturnsSum() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);

        ListNode expected = new ListNode(2);
        expected.next = new ListNode(9);
        expected.next.next = new ListNode(9);

        ListNode result = qa25.addTwoNumbers(l1, l2);

        assertEquals(expected.val, result.val);
        assertEquals(expected.next.val, result.next.val);
        assertEquals(expected.next.next.val, result.next.next.val);
        assertEquals(null, result.next.next.next); // 确保没有多余的节点
    }

    @Test
    public void addTwoNumbers_CarryOver_ReturnsSum() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(1);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(0);
        expected.next.next.next = new ListNode(0);

        ListNode result = qa25.addTwoNumbers(l1, l2);

        assertEquals(expected.val, result.val);
        assertEquals(expected.next.val, result.next.val);
        assertEquals(expected.next.next.val, result.next.next.val);
        assertEquals(expected.next.next.next.val, result.next.next.next.val);
        assertNull(result.next.next.next.next); // 确保没有多余的节点
    }
}
