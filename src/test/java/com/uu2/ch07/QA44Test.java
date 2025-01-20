package com.uu2.ch07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QA44Test {

    private QA44 qa44;

    @BeforeEach
    public void setUp() {
        qa44 = new QA44();
    }

    @Test
    public void largestValues_EmptyTree_ReturnsEmptyList() {
        List<Integer> result = qa44.largestValues(null);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void largestValues_SingleNodeTree_ReturnsSingleValue() {
        TreeNode root = new TreeNode(1);
        List<Integer> result = qa44.largestValues(root);
        assertEquals(Arrays.asList(1), result);
    }

    @Test
    public void largestValues_FullBinaryTree_ReturnsCorrectMaxValues() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        List<Integer> result = qa44.largestValues(root);
        assertEquals(Arrays.asList(1, 3, 9), result);
    }

    @Test
    public void largestValues_IncompleteBinaryTree_ReturnsCorrectMaxValues() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        List<Integer> result = qa44.largestValues(root);
        assertEquals(Arrays.asList(1, 3, 5), result);
    }

    @Test
    public void largestValues_AllNodesSameValue_ReturnsSameValue() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(5);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(5);

        List<Integer> result = qa44.largestValues(root);
        assertEquals(Arrays.asList(5, 5, 5), result);
    }

    @Test
    public void largestValues_MixedValues_ReturnsCorrectMaxValues() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(30);

        List<Integer> result = qa44.largestValues(root);
        assertEquals(Arrays.asList(10, 20, 30), result);
    }

    @Test
    public void largestValues2_EmptyTree_ReturnsEmptyList() {
        List<Integer> result = qa44.largestValues2(null);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void largestValues2_SingleNodeTree_ReturnsSingleValue() {
        TreeNode root = new TreeNode(1);
        List<Integer> result = qa44.largestValues2(root);
        assertEquals(Arrays.asList(1), result);
    }

    @Test
    public void largestValues2_FullBinaryTree_ReturnsCorrectMaxValues() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        List<Integer> result = qa44.largestValues2(root);
        assertEquals(Arrays.asList(1, 3, 9), result);
    }

    @Test
    public void largestValues2_IncompleteBinaryTree_ReturnsCorrectMaxValues() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        List<Integer> result = qa44.largestValues2(root);
        assertEquals(Arrays.asList(1, 3, 5), result);
    }

    @Test
    public void largestValues2_AllNodesSameValue_ReturnsSameValue() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(5);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(5);

        List<Integer> result = qa44.largestValues2(root);
        assertEquals(Arrays.asList(5, 5, 5), result);
    }

    @Test
    public void largestValues2_MixedValues_ReturnsCorrectMaxValues() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(30);

        List<Integer> result = qa44.largestValues2(root);
        assertEquals(Arrays.asList(10, 20, 30), result);
    }
}
