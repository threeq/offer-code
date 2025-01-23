package com.uu2.book1.ch10;


import com.uu2.book1.ch10.QA64MagicDict;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QA64MagicDictTest {

    private QA64MagicDict magicDict;

    @BeforeEach
    public void setUp() {
        // 在每个测试之前设置一个空的字典
        magicDict = new QA64MagicDict(new String[]{});
    }

    @Test
    public void search_EmptyDict_False() {
        assertFalse(magicDict.search("hello"));
    }

    @Test
    public void search_SingleWordOneEdit_True() {
        magicDict = new QA64MagicDict(new String[]{"hello"});
        assertTrue(magicDict.search("hallo"));
    }

    @Test
    public void search_MultipleWordsOneEdit_True() {
        magicDict = new QA64MagicDict(new String[]{"hello", "world"});
        assertTrue(magicDict.search("hallo"));
    }

    @Test
    public void search_NoMatch_False() {
        magicDict = new QA64MagicDict(new String[]{"hello", "world"});
        assertTrue(magicDict.search("hxllo"));
    }

    @Test
    public void search_ExactMatch_False() {
        magicDict = new QA64MagicDict(new String[]{"hello"});
        assertFalse(magicDict.search("hello"));
    }

    @Test
    public void search_MoreThanOneEdit_False() {
        magicDict = new QA64MagicDict(new String[]{"hello"});
        assertFalse(magicDict.search("hxlle"));
    }
}
