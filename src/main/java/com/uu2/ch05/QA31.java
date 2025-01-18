package com.uu2.ch05;

import java.util.HashMap;
import java.util.Map;

public class QA31 {
    /**
     * LRU：最近最少使用缓存
     */
    private int capacity;
    private ListNode head;
    private ListNode tail;
    private Map<Integer, ListNode> map;

    public QA31(int capacity) {
        this.capacity = capacity;
        head = new ListNode(-1, -1);
        tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }

    public int get(int key) {
        ListNode node = map.get(key);
        if (node == null) {
            return -1;
        } else {
            moveToTail(node, node.val);
            return node.val;
        }
    }

    public void put(int key, int val) {
        ListNode node = map.get(key);
        if (node == null) {
            node = new ListNode(key, val);
            map.put(key, node);
            insertToTail(node);
            if (map.size() > capacity) {
                removeHead();
            }
        } else {
            moveToTail(map.get(key), val);
        }
    }

    private void insertToTail(ListNode node) {
        tail.prev.next = node;
        node.prev = tail.prev;
        node.next = tail;
        tail.prev = node;
    }

    private void removeHead() {
        ListNode toBeDeleted = head.next;
        deleteNode(toBeDeleted);
        map.remove(toBeDeleted.key);
    }

    private void deleteNode(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToTail(ListNode node, int newVal) {
        deleteNode(node);
        node.val = newVal;
        insertToTail(node);
    }
}
