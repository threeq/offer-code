package com.uu2.book1.ch04;

public class QA29 {
    /**
     * 排序的循环链表
     */
    public Node insert(Node head, int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            head.next = head;
        } else if (head.next == head) {
            head.next = node;
            node.next = head;
        } else {
            return insertCore(head, node);
        }
        return head;
    }

    private Node insertCore(Node head, Node node) {
        Node cur = head;
        Node next = head.next;
        Node limit = head;

        while (next != head) {
            if ((cur.value <= node.value && node.value <= next.value)
                    || (cur.value >= node.value && node.value >= next.value)) {
                break;
            }
            cur = next;
            next = next.next;
            if (cur.value > limit.value) {
                limit = cur;
            }
        }
        if ((cur.value <= node.value && node.value <= next.value)
                || (cur.value >= node.value && node.value >= next.value)) {
            cur.next = node;
            node.next = next;
        } else {
            node.next = limit.next;
            limit.next = node;
        }

        if((head.value<limit.value && node.value<head.value) || (head.value>limit.value && node.value>head.value)) {
            return node;
        }
        return head;
    }
}
