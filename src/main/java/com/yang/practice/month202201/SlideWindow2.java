package com.yang.practice.month202201;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/23
 */
public class SlideWindow2 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ret = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (i - k + 1 > 0 && i + 1 - k > deque.peek()) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.add(i);
            if (i - k + 1 >= 0) {
                ret[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return ret;
    }

}
