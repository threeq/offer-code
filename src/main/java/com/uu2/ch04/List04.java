package com.uu2.ch04;

public class List04 {

    /**
     * 问题21：删除倒数第k个节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode front = head, back = dummy;
        int i = 0;
        for (; i < n && front != null; i++) {
            front = front.next;
        }

        if (i < n) {
            return dummy.next;
        }

        while (front != null) {
            front = front.next;
            back = back.next;
        }

        if (back.next != null) {
            back.next = back.next.next;
        }
        return dummy.next;
    }

    /**
     * 问题22：链表中环的入口节点
     */
    public ListNode detectCycle(ListNode head) {
        ListNode inLoop = getNodeInLoop(head);
        if (inLoop == null) {
            return null;
        }

        int loopCount = 1;
        for (ListNode n = inLoop; n.next != inLoop; n = n.next) {
            loopCount++;
        }
        ListNode fast = head;
        for (int i = 0; i < loopCount; i++) {
            fast = fast.next;
        }
        ListNode slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode detectCycle1(ListNode head) {
        ListNode inLoop = getNodeInLoop(head);
        if (inLoop == null) {
            return null;
        }

        ListNode node = head;
        while (node != inLoop) {
            node = node.next;
            inLoop = inLoop.next;
        }
        return node;
    }

    private ListNode getNodeInLoop(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head.next;
        ListNode fast = slow.next;
        while (slow != null && fast != null) {
            if (slow == fast) {
                return slow;
            }
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return null;
    }

    /**
     * 问题23：两个链表的第一个重合节点
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = countList(headA), countB = countList(headB);
        if (countA == 0 || countB == 0)
            return null;

        int delta = Math.abs(countA - countB);
        ListNode longer = countA > countB ? headA : headB;
        ListNode shorter = countA > countB ? headB : headA;

        ListNode node1 = longer;
        for (int i = 0; i < delta; i++) {
            node1 = node1.next;
        }
        ListNode node2 = shorter;
        while (node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }

    private int countList(ListNode head) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }

        return count;
    }
}
