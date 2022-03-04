package com.yang.practice.month202203;

import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/4
 */
public class T03MatchBracket {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
