package com.yang.practice.sie;

import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/1
 */
public class CodeSolution {

    public int longest(String s) {
        if (s == null || s == "") {
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        int ret = 0;
        int idx = 0;
        while (idx < s.length()) {
            int tmp = 0;
            for (int i = idx; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == ')' && !stack.isEmpty()) {
                    tmp += 2;
                    stack.pop();
                    ret = Math.max(ret, tmp);
                } else {
                    idx = i + 1;
                    break;
                }
                idx = i + 1;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        CodeSolution cs = new CodeSolution();
        System.out.println(cs.longest(")(()())"));
    }

}
