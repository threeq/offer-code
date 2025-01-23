package com.uu2.book1.ch12;

import com.uu2.book1.ch04.ListNode;

import java.util.PriorityQueue;

public class QA78 {
    /**
     * 合并排序链表
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode head : lists) {
            if (head != null) {
                minHeap.offer(head);
            }
        }
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            cur.next = node;
            cur = cur.next;
            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }
        return dummy.next;
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKLists2(lists, 0, lists.length);
    }

    private ListNode mergeKLists2(ListNode[] lists, int start, int end) {
        if (start + 1 == end) {
            return lists[start];
        }

        int mid = start + (end - start) / 2;
        return merge(
                mergeKLists2(lists, start, mid),
                mergeKLists2(lists, mid, end)
        );
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
}
