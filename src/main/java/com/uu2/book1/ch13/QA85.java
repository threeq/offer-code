package com.uu2.book1.ch13;

import java.util.LinkedList;
import java.util.List;

public class QA85 {
    /**
     * 生成匹配的括号
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        helper(n, n, "", result);
        return result;
    }

    private void helper(int left, int right, String s, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }
        if (left > 0) {
            helper(left - 1, right, s + "(", result);
        }
        if (right > left) {
            helper(left, right - 1, s + ")", result);
        }
    }
}
