package com.yang.practice.month202210;

import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2022/10/9
 */
public class MatchBracket {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else {
                if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
