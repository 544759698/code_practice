package com.yang.practice.month202203;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/12
 */
public class L12SlideWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length - k + 1 < 1) {
            return null;
        }
        int[] ret = new int[nums.length - k + 1];
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!queue.isEmpty() && (i - k) >= queue.getFirst()) {
                queue.removeFirst();
            }
            while (!queue.isEmpty() && nums[i] > nums[queue.getLast()]) {
                queue.removeLast();
            }
            queue.add(i);
            if (i + 1 - k >= 0) {
                ret[i + 1 - k] = nums[queue.getFirst()];
            }
        }
        return ret;
    }

}
