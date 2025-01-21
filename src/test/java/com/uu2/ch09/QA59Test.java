package com.uu2.ch09;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA59Test {

    private QA59 qa59;

    @BeforeEach
    public void setUp() {
        // 使用 k=3 和初始数组 [4, 5, 8, 2] 初始化 QA59
        qa59 = new QA59(3, new int[]{4, 5, 8, 2});
    }

    @Test
    public void add_WhenQueueSizeLessThanK_ShouldAddElement() {
        // 优先队列的初始大小为3，添加一个新元素
        int result = qa59.add(3);
        assertEquals(4, result); // 3 应该被添加，堆顶应为第3大元素
    }

    @Test
    public void add_WhenNewElementGreaterThanTop_ShouldReplaceTop() {
        // 添加一个大于当前堆顶的元素
        int result = qa59.add(9);
        assertEquals(5, result); // 9 应该替换2，堆顶应为第3大元素
    }

    @Test
    public void add_WhenNewElementLessThanOrEqualToTop_ShouldNotReplaceTop() {
        // 添加一个小于或等于当前堆顶的元素
        int result = qa59.add(1);
        assertEquals(4, result); // 堆顶应保持不变
    }

    @Test
    public void add_WhenNewElementEqualToTop_ShouldNotReplaceTop() {
        // 添加一个等于当前堆顶的元素
        int result = qa59.add(2);
        assertEquals(4, result); // 堆顶应保持不变
    }

    @Test
    public void add_WhenNewElementLessThanTop_ShouldNotReplaceTop() {
        // 添加一个小于当前堆顶的元素
        int result = qa59.add(0);
        assertEquals(4, result); // 堆顶应保持不变
    }
}
