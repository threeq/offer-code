package com.uu2.ch10;

public class QA64MagicDict {
    /**
     * 神奇的字典
     */
    private Trie trie;

    public QA64MagicDict(String[] dict) {
        trie = new Trie();
        for (String word : dict) {
            trie.insert(word);
        }
    }

    public boolean search(String word) {
        return dfs(trie.root(), word, 0, 0);
    }

    private boolean dfs(Trie.TrieNode root, String word, int i, int edit) {
        if (root == null) {
            return false;
        }
        if (root.isWord && i == word.length() && edit == 1) {
            return true;
        }
        if (i < word.length() && edit <= 1) {
            boolean found = false;
            for (int j = 0; j < 128 && !found; j++) {
                int next = j == word.charAt(i) ? edit : edit + 1;
                found = dfs(root.children[j], word, i + 1, next);
            }

            return found;
        }
        return false;
    }
}
