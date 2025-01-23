package com.uu2.book1.ch06;

import java.util.Stack;

public class QA36 {
    /**
     * 36. 后缀表达式
     */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                case "-":
                case "*":
                case "/":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(cal(b, a, token));
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private Integer cal(int b, int a, String token) {
        return switch (token) {
            case "+" -> b + a;
            case "-" -> b - a;
            case "*" -> b * a;
            case "/" -> b / a;
            default -> 0;
        };
    }

}
