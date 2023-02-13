package com.yang.practice.month202302;

import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2023/2/13
 */
public class MyQueue {

    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        if (!out.isEmpty()) {
            return out.pop();
        }
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        return out.pop();
    }

    public int peek() {
        if (empty()) {
            return -1;
        }
        if (!out.isEmpty()) {
            return out.peek();
        }
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
