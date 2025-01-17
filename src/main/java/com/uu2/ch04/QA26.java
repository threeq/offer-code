package com.uu2.ch04;

public class QA26 {
    /**
     * 重排链表
     */
    public void reorderList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode right = slow.next;
        slow.next = null;
        QA24 reverse = new QA24();
        link(head, reverse.reverseList(right), dummy);
    }

    private void link(ListNode l1, ListNode l2, ListNode head) {
        ListNode prev = head;
        while (l1 != null && l2 != null) {
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;
            prev.next = l1;
            l1.next = l2;
            l2.next = next1;
            prev = l2;
            l1 = next1;
            l2 = next2;
        }
        if (l1 !=null){
            prev.next = l1;
        }
        if(l2 != null){
            prev.next = l2;
        }
    }

}
