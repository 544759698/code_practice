package com.yang.practice.month202203;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/11
 */
public class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        int size = queue.size();
        queue.offer(x);
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                int first = queue.poll();
                queue.offer(first);
            }
        }
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        return queue.poll();
    }

    public int top() {
        if (empty()) {
            return -1;
        }
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
