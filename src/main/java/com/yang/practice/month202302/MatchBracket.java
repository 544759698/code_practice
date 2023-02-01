package com.yang.practice.month202302;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2023/2/1
 */
public class MatchBracket {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(map.get(s.charAt(i)));
            } else {
                if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
