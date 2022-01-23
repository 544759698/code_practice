package com.yang.practice.month202201;

import java.util.PriorityQueue;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/23
 */
public class KthLargest {

    PriorityQueue<Integer> queue;
    int capacity;

    public KthLargest(int k, int[] nums) {
        // initialCapacity只是初始容量，超过会再增长
        queue = new PriorityQueue<>();
        capacity = k;
        for (int i = 0; i < nums.length; i++) {
            if (i < capacity) {
                queue.add(nums[i]);
            } else if (nums[i] > queue.peek()) {
                queue.poll();
                queue.add(nums[i]);
            }
        }
    }

    public int add(int val) {
        if (queue.size() < capacity) {
            queue.add(val);
        } else if (val > queue.peek()) {
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, nums);
        System.out.println();
    }

}
