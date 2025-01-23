package com.uu2.book1.ch10;

public class QA67 {
    private Trie.TrieNode buildTrie(int[] nums) {
        Trie.TrieNode root = new Trie.TrieNode();
        for (int num : nums) {
            Trie.TrieNode cur = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (cur.children[bit] == null) {
                    cur.children[bit] = new Trie.TrieNode();
                }
                cur = cur.children[bit];
            }
        }
        return root;
    }
    /**
     * 最大的异或
     */
    public int findMaximumXOR(int[] nums) {
        Trie.TrieNode root = buildTrie(nums);
        int max = 0;
        for (int num : nums) {
            Trie.TrieNode cur = root;
            int xor = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (cur.children[bit ^ 1] != null) {
                    xor |= (1 << i);
                    cur = cur.children[bit ^ 1];
                } else {
                    cur = cur.children[bit];
                }
            }
            max = Math.max(max, xor);
        }
        return max;
    }
}
