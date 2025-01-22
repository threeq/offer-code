package com.uu2.ch12;

import com.uu2.ch04.ListNode;

public class QA77 {
    /**
     * 链表排序
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode h1 = head;
        ListNode h2 = split(head);
        h1 = sortList(h1);
        h2 = sortList(h2);
        
        return merge(h1, h2);
    }

    private ListNode merge(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                cur.next = h1;
                h1 = h1.next;
            } else {
                cur.next = h2;
                h2 = h2.next;
            }
            cur = cur.next;
        }
        cur.next = h1 != null ? h1 : h2;

        return dummy.next;
    }

    private ListNode split(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode h2 = slow.next;
        slow.next = null;
        return h2;
    }
}
