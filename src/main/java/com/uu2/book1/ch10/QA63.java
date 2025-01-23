package com.uu2.book1.ch10;

import java.util.List;

public class QA63 {
    /**
     * 替换单词
     */
    public String replaceWords(List<String> dict, String sentence) {
        Trie trie = buildTrie(dict);
        StringBuilder sb = new StringBuilder();

        for (String word : sentence.split("\\s+")) {
            String prefix = findPrefix(trie, word);
            sb.append(prefix.isEmpty() ? word : prefix).append(" ");
        }
        return sb.toString().trim();
    }

    private Trie buildTrie(List<String> dict) {
        Trie trie = new Trie();
        for (String word : dict) {
            trie.insert(word);
        }
        return trie;
    }

    private String findPrefix(Trie trie, String word) {
        Trie.TrieNode cur = trie.root();
        StringBuilder prefix = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (cur.children[c] == null || cur.isWord) {
                break;
            }
            prefix.append(c);
            cur = cur.children[c];
        }
        return cur.isWord ? prefix.toString() : "";
    }
}
