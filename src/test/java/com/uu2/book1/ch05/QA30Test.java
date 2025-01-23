package com.uu2.book1.ch05;

import com.uu2.book1.ch05.QA30;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QA30Test {

    private QA30 qa30;

    @BeforeEach
    public void setUp() {
        qa30 = new QA30();
    }

    @Test
    public void insert_ValueNotPresent_InsertsSuccessfully() {
        assertTrue(qa30.insert(1));
        assertTrue(qa30.insert(2));
        assertTrue(qa30.insert(3));
    }

    @Test
    public void insert_ValueAlreadyPresent_ReturnsTrue() {
        qa30.insert(1);
        assertTrue(qa30.insert(1)); // 尝试插入相同的值
    }

    @Test
    public void remove_ValuePresent_RemovesSuccessfully() {
        qa30.insert(1);
        qa30.insert(2);
        assertTrue(qa30.remove(1));
    }

    @Test
    public void remove_ValueNotPresent_ReturnsFalse() {
        assertFalse(qa30.remove(1)); // 尝试移除不存在的值
    }

    @Test
    public void getRandom_ReturnsValidRandomValue() {
        qa30.insert(1);
        qa30.insert(2);
        qa30.insert(3);
        int randomValue = qa30.getRandom();
        assertTrue(randomValue == 1 || randomValue == 2 || randomValue == 3);
    }
}
