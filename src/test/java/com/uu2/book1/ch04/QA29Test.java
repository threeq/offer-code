package com.uu2.book1.ch04;


import com.uu2.book1.ch04.Node;
import com.uu2.book1.ch04.QA29;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QA29Test {

    private QA29 qa29;

    @BeforeEach
    public void setUp() {
        qa29 = new QA29();
    }

    @Test
    public void insert_EmptyList_NewNodeBecomesHead() {
        Node head = qa29.insert(null, 10);
        assertEquals(10, head.value);
        assertEquals(head, head.next);
    }

    @Test
    public void insert_SingleNodeList_NewNodeInserted() {
        Node head = new Node(10);
        head.next = head;
        head = qa29.insert(head, 20);
        assertEquals(10, head.value);
        assertEquals(20, head.next.value);
        assertEquals(head, head.next.next);
    }

    @Test
    public void insert_MultipleNodes_InsertInMiddle() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = head;
        head = qa29.insert(head, 15);
        assertEquals(10, head.value);
        assertEquals(15, head.next.value);
        assertEquals(20, head.next.next.value);
        assertEquals(head, head.next.next.next);
    }

    @Test
    public void insert_MultipleNodes_InsertAtHead() {
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = head;
        head = qa29.insert(head, 10);
        assertEquals(10, head.value);
        assertEquals(20, head.next.value);
        assertEquals(30, head.next.next.value);
        assertEquals(head, head.next.next.next);
    }

    @Test
    public void insert_MultipleNodes_InsertAtTail() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = head;
        head = qa29.insert(head, 30);
        assertEquals(10, head.value);
        assertEquals(20, head.next.value);
        assertEquals(30, head.next.next.value);
        assertEquals(head, head.next.next.next);
    }

    @Test
    public void insert_MultipleNodes_InsertAfterMax() {
        Node head = new Node(30);
        head.next = new Node(10);
        head.next.next = head;
        head = qa29.insert(head, 20);
        assertEquals(30, head.value);
        assertEquals(20, head.next.value);
        assertEquals(10, head.next.next.value);
        assertEquals(head, head.next.next.next);
    }
}
