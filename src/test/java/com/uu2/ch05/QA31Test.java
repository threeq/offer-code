package com.uu2.ch05;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA31Test {
    private QA31 cache;

    @BeforeEach
    public void setUp() {
        cache = new QA31(2); // 初始化容量为2的缓存
    }

    @Test
    public void put_KeyDoesNotExist_CacheNotFull_AddsToCache() {
        cache.put(1, 1);
        assertEquals(1, cache.get(1)); // 验证键1存在并返回正确的值
    }

    @Test
    public void put_KeyDoesNotExist_CacheFull_RemovesLRU() {
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3); // 超过容量，应移除键1
        assertEquals(-1, cache.get(1)); // 验证键1已被移除
        assertEquals(2, cache.get(2)); // 验证键2仍然存在
        assertEquals(3, cache.get(3)); // 验证键3存在
    }

    @Test
    public void put_KeyExists_UpdatesValueAndMovesToTail() {
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 10); // 更新键1的值
        assertEquals(10, cache.get(1)); // 验证键1的值已更新
        cache.put(3, 3); // 超过容量，应移除键2
        assertEquals(-1, cache.get(2)); // 验证键2已被移除
    }

    @Test
    public void get_KeyExists_ReturnsValueAndMovesToTail() {
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1)); // 验证键1存在并返回正确的值
        cache.put(3, 3); // 超过容量，应移除键2
        assertEquals(-1, cache.get(2)); // 验证键2已被移除
    }

    @Test
    public void get_KeyDoesNotExist_ReturnsNegativeOne() {
        assertEquals(-1, cache.get(1)); // 验证键1不存在时返回-1
    }
}
