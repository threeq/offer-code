package com.uu2.book1.ch10;

public class QA66 {
    /**
     * 单词之和
     */
    public Trie trie;

    public QA66() {
        trie = new Trie();
    }

    public void insert(String word, int val) {
        Trie.TrieNode node = trie.insert(word);
        node.val = val;
    }

    public int sum(String prefix) {
        Trie.TrieNode node = trie.root();
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (node.children[ch] == null) {
                return 0;
            }
            node = node.children[ch];
        }
        return getSum(node);
    }

    private int getSum(Trie.TrieNode node) {
        if (node == null) {
            return 0;
        }
        int sum = node.val;
        for (Trie.TrieNode ch : node.children) {
            sum += getSum(ch);
        }
        return sum;
    }

}
