package com.yang.practice.month202212;

import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2022/12/6
 */
public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ret = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int top = stack.pop();
                ret[top] = i - top;
            }
            stack.push(i);
        }
        return ret;
    }
}
