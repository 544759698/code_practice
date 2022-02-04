package com.yang.practice.month202202;

import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/4
 */
public class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        if (output.isEmpty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int peek() {
        if (empty()) {
            return -1;
        }
        if (output.isEmpty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

}
