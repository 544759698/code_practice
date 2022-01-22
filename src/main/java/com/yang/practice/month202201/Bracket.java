package com.yang.practice.month202201;

import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/23
 */
public class Bracket {

    public boolean isValid(String s) {
        if (s == null || s == "") {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(')');
            } else if (chars[i] == '[') {
                stack.push(']');
            } else if (chars[i] == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || stack.pop() != chars[i]) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
