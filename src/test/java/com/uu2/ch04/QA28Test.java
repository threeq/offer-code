package com.uu2.ch04;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QA28Test {

    private QA28 qa28;

    @BeforeEach
    public void setUp() {
        qa28 = new QA28();
    }

    @Test
    public void flatten_EmptyList_ReturnsNull() {
        Node result = qa28.flatten(null);
        assertNull(result);
    }

    @Test
    public void flatten_SingleLevelList_ReturnsSameList() {
        Node head = createNode(1);
        head.next = createNode(2);
        head.next.prev = head;

        Node result = qa28.flatten(head);

        assertEquals(head, result);
        assertEquals(1, result.value);
        assertEquals(2, result.next.value);
        assertNull(result.next.next);
    }

    @Test
    public void flatten_MultiLevelList_FlattensCorrectly() {
        Node head = createNode(1);
        head.next = createNode(2);
        head.next.prev = head;

        Node child = createNode(3);
        head.child = child;

        Node result = qa28.flatten(head);

        assertEquals(1, result.value);
        assertEquals(3, result.next.value);
        assertEquals(2, result.next.next.value);
        assertNull(result.next.next.next);
    }

    @Test
    public void flatten_ComplexNestedList_FlattensCorrectly() {
        Node head = createNode(1);
        head.next = createNode(2);
        head.next.prev = head;

        Node child1 = createNode(3);
        head.child = child1;

        Node child2 = createNode(4);
        child1.next = child2;
        child2.prev = child1;

        Node result = qa28.flatten(head);

        assertEquals(1, result.value);
        assertEquals(3, result.next.value);
        assertEquals(4, result.next.next.value);
        assertEquals(2, result.next.next.next.value);
        assertNull(result.next.next.next.next);
    }

    private Node createNode(int value) {
        return new Node(value);
    }
}
