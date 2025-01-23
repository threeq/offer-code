package com.uu2.book1.ch10;

public class Trie {
    public static class TrieNode {
        public boolean isWord;
        public TrieNode[] children = new TrieNode[128];
        public int val;

        public TrieNode() {
        }
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public TrieNode insert(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children[c] == null) {
                cur.children[c] = new TrieNode();
            }
            cur = cur.children[c];
        }
        cur.isWord = true;
        return cur;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children[c] == null) {
                return false;
            }
            cur = cur.children[c];
        }
        return cur.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (char c : prefix.toCharArray()) {
            if (cur.children[c] == null) {
                return false;
            }
            cur = cur.children[c];
        }
        return true;
    }

    public TrieNode root() {
        return root;
    }
}
