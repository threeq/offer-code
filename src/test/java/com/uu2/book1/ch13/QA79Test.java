package com.uu2.book1.ch13;


import com.uu2.book1.ch13.QA79;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QA79Test {

    private QA79 qa79;

    @BeforeEach
    public void setUp() {
        qa79 = new QA79();
    }

    @Test
    public void subsets_EmptyArray_ReturnsEmptyList() {
        List<List<Integer>> result = qa79.subsets(new int[]{});
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void subsets_SingleElementArray_ReturnsSingleElementAndEmptySet() {
        List<List<Integer>> result = qa79.subsets(new int[]{1});
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>());
        expected.add(Collections.singletonList(1));
        assertEquals(expected, result);
    }

}
