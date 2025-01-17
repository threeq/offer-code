package com.uu2.ch04;

public class QA28 {
    /**
     * 展平多级双向链表
     */
    public Node flatten(Node head) {
        flattenGetTail(head);
        return head;
    }

    private Node flattenGetTail(Node head) {
        Node cur = head;
        Node tail = null;
        while (cur != null) {
            Node next = cur.next;
            if (cur.child != null) {
                Node child = cur.child;
                Node childTail = flattenGetTail(child);

                cur.child = null;
                cur.next = child;
                child.prev = cur;
                childTail.next = next;
                if (next != null){
                    next.prev = childTail;
                }
                tail = childTail;
            } else {
                tail = cur;
            }

            cur = next;
        }
        return tail;
    }
}
