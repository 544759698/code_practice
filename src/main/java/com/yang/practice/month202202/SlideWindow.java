package com.yang.practice.month202202;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/1
 */
public class SlideWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ret = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && (i - deque.peekFirst()) >= k) {
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

    public static void main(String[] args) {
        int[] nums = {7, 2, 4};
        int k = 2;
        SlideWindow s = new SlideWindow();
        int[] ret = s.maxSlidingWindow(nums, k);
        for (int r : ret) {
            System.out.print(r + " ");
        }
    }

}
