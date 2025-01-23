package com.uu2.book1.ch08;


import com.uu2.book1.ch08.QA58;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA58Test {

    private QA58 qa58;

    @BeforeEach
    public void setUp() {
        qa58 = new QA58();
    }

    @Test
    public void book_NoOverlap_ReturnsTrue() {
        assertTrue(qa58.book(10, 20));
        assertTrue(qa58.book(30, 40));
    }

    @Test
    public void book_OverlapWithPreviousEvent_ReturnsFalse() {
        assertTrue(qa58.book(10, 20));
        assertFalse(qa58.book(15, 25));
    }

    @Test
    public void book_OverlapWithNextEvent_ReturnsFalse() {
        assertTrue(qa58.book(10, 20));
        assertFalse(qa58.book(5, 15));
    }

    @Test
    public void book_OverlapWithExistingEvent_ReturnsFalse() {
        assertTrue(qa58.book(10, 20));
        assertFalse(qa58.book(10, 20));
    }

    @Test
    public void book_EventCompletelyWithinExistingEvent_ReturnsFalse() {
        assertTrue(qa58.book(10, 20));
        assertFalse(qa58.book(12, 18));
    }

    @Test
    public void book_EventCompletelyContainsExistingEvent_ReturnsFalse() {
        assertTrue(qa58.book(10, 20));
        assertFalse(qa58.book(5, 25));
    }

    @Test
    public void book_BoundaryOverlap_ReturnsFalse() {
        assertTrue(qa58.book(10, 20));
        assertFalse(qa58.book(20, 30));
    }

}
