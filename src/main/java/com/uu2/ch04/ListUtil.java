package com.uu2.ch04;

public class ListUtil {
    public ListNode append(ListNode head, int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
        } else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
        return head;
    }

    public ListNode appendDummy(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode newNode = new ListNode(val);
        ListNode node = dummy;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
        return dummy.next;
    }

    public ListNode delete(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        if (head.val == val) {
            return head.next;
        }

        ListNode node = head;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
                break;
            } else {
                node = node.next;
            }
        }

        return head;
    }

    public ListNode deleteDummy(ListNode head, int val ) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode node = dummy;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
                break;
            } else {
                node = node.next;
            }
        }

        return dummy.next;
    }
}
