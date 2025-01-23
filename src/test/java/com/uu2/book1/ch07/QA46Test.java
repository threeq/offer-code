package com.uu2.book1.ch07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.List;

import com.uu2.book1.ch07.QA46;
import com.uu2.book1.ch07.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA46Test {

    private QA46 qa46;

    @BeforeEach
    public void setUp() {
        qa46 = new QA46();
    }

    @Test
    public void rightSideView_EmptyTree_ReturnsNull() {
        TreeNode root = null;
        List<Integer> result = qa46.rightSideView(root);
        assertNull(result);
    }

    @Test
    public void rightSideView_SingleNodeTree_ReturnsSingleNodeValue() {
        TreeNode root = new TreeNode(1);
        List<Integer> expected = Arrays.asList(1);
        List<Integer> result = qa46.rightSideView(root);
        assertEquals(expected, result);
    }

    @Test
    public void rightSideView_FullBinaryTree_ReturnsRightSideView() {
        TreeNode root = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(5)),
            new TreeNode(3, null, new TreeNode(4))
        );
        List<Integer> expected = Arrays.asList(1, 3, 4);
        List<Integer> result = qa46.rightSideView(root);
        assertEquals(expected, result);
    }

    @Test
    public void rightSideView_OnlyLeftChildren_ReturnsRightSideView() {
        TreeNode root = new TreeNode(1,
            new TreeNode(2,
                new TreeNode(3),
                null
            ),
            null
        );
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> result = qa46.rightSideView(root);
        assertEquals(expected, result);
    }

    @Test
    public void rightSideView_OnlyRightChildren_ReturnsRightSideView() {
        TreeNode root = new TreeNode(1,
            null,
            new TreeNode(2,
                null,
                new TreeNode(3)
            )
        );
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> result = qa46.rightSideView(root);
        assertEquals(expected, result);
    }

    @Test
    public void rightSideView_UnbalancedTree_ReturnsRightSideView() {
        TreeNode root = new TreeNode(1,
            null,
            new TreeNode(2,
                new TreeNode(3),
                null
            )
        );
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> result = qa46.rightSideView(root);
        assertEquals(expected, result);
    }
}
