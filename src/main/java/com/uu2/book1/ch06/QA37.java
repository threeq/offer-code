package com.uu2.book1.ch06;

import java.util.Stack;

public class QA37 {
    /**
     * 小行星碰撞
     */
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int as : asteroids) {
            while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() + as < 0) {
                stack.pop();
            }

            if (stack.isEmpty() || stack.peek() < 0 || as > 0) {
                stack.push(as);
            } else if (!stack.isEmpty() && as<0 && stack.peek()+as==0) {
                stack.pop();
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
