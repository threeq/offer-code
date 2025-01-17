package com.uu2.ch04;

public class QA27 {
    /**
     * 回文链表
     */
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = slow.next;
        if(fast.next != null){
            right = slow.next.next;
        }
        slow.next = null;
        QA24 reverse = new QA24();
        return equals(head, reverse.reverseList(right));
    }

    private boolean equals(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}
