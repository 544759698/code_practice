package com.yang.practice.month202201;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/23
 */
public class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        int n = queue.size();
        queue.add(x);
        for (int i = 0; i < n; i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
