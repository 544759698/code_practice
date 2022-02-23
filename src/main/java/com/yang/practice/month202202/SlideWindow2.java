package com.yang.practice.month202202;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/23
 */
public class SlideWindow2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ret = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && (i - deque.peekFirst() >= k)) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i - k + 1 >= 0) {
                ret[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2, 0, 5};
        SlideWindow2 s = new SlideWindow2();
        int[] ret = s.maxSlidingWindow(nums, 3);
        System.out.println(ret);
    }

}
