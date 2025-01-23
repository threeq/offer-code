package com.uu2.book1.ch10;

public class QA65 {
    /**
     * 最短单词编码
     */
    public int minimumLengthEncoding(String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            // word 反正
            String reverse = new StringBuilder(word).reverse().toString();
            trie.insert(reverse);
        }
        int[] total = {0};
        dfs(trie.root(), 1, total);
        return total[0];
    }

    private void dfs(Trie.TrieNode root, int length, int[] total) {
        boolean isLeaf = true;
        for (Trie.TrieNode child : root.children) {
            if (child != null) {
                isLeaf = false;
                dfs(child, length + 1, total);
            }
        }
        if (isLeaf) {
            total[0] += length;
        }
    }
}
