package com.yang.practice.month202201;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/19
 */
public class SlideWindow {

    public List<Integer> getMaxSlideWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length < k || k <= 0) {
            return null;
        }
        List<Integer> ret = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= k && i + 1 - k > deque.peek()) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.add(i);
            if (i + 1 - k >= 0) {
                ret.add(nums[deque.peekFirst()]);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, -1, 4, 5, 2, 1, 6, 9, 0};
        SlideWindow s = new SlideWindow();
        // 2 4 5 5 5 6 9 9
        List<Integer> ret = s.getMaxSlideWindow(nums, 3);
        for (int r : ret) {
            System.out.print(r + " ");
        }
    }

}
