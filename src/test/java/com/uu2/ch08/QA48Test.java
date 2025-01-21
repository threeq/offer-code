package com.uu2.ch08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QA48Test {

    private QA48 qa48;

    @BeforeEach
    public void setUp() {
        qa48 = new QA48();
    }

    @Test
    public void serialize_EmptyTree_ReturnsNull() {
        TreeNode root = null;
        String result = qa48.serialize(root);
        assertEquals("#", result);
    }

    @Test
    public void serialize_SingleNodeTree_ReturnsValue() {
        TreeNode root = new TreeNode();
        root.val = 1;
        String result = qa48.serialize(root);
        assertEquals("1,#,#", result);
    }

    @Test
    public void serialize_ComplexTree_ReturnsSerializedString() {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = new TreeNode();
        root.left.val = 2;
        root.right = new TreeNode();
        root.right.val = 3;
        root.right.left = new TreeNode();
        root.right.left.val = 4;
        root.right.right = new TreeNode();
        root.right.right.val = 5;
        String result = qa48.serialize(root);
        assertEquals("1,2,#,#,3,4,#,#,5,#,#", result);
    }

    @Test
    public void deserialize_NullString_ReturnsNull() {
        String data = "#";
        TreeNode result = qa48.deserialize(data);
        assertNull(result);
    }

    @Test
    public void deserialize_SingleNodeString_ReturnsTreeNode() {
        String data = "1,#,#";
        TreeNode result = qa48.deserialize(data);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    public void deserialize_ComplexString_ReturnsTreeNode() {
        String data = "1,2,#,#,3,4,#,#,5,#,#";
        TreeNode result = qa48.deserialize(data);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertNotNull(result.left);
        assertEquals(2, result.left.val);
        assertNull(result.left.left);
        assertNull(result.left.right);
        assertNotNull(result.right);
        assertEquals(3, result.right.val);
        assertNotNull(result.right.left);
        assertEquals(4, result.right.left.val);
        assertNotNull(result.right.right);
        assertEquals(5, result.right.right.val);
        assertNull(result.right.left.left);
        assertNull(result.right.left.right);
        assertNull(result.right.right.left);
        assertNull(result.right.right.right);
    }
}
