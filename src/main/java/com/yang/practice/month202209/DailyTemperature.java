package com.yang.practice.month202209;

import java.util.Stack;

/**
 * @Author: yangguojun01
 * @Date: 2022/9/21
 */
public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                int topIdx = s.pop();
                ans[topIdx] = i - topIdx;
            }
            s.push(i);
        }
        return ans;
    }
}
