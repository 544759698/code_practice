package com.yang.practice.month202203;

import java.util.PriorityQueue;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/11
 */
public class KthLargest {

    PriorityQueue<Integer> queue;
    int[] nums;
    int k;

    public KthLargest(int k, int[] nums) {
        this.queue = new PriorityQueue<>();
        this.nums = nums;
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            this.add(nums[i]);
        }
    }

    public int add(int val) {
        queue.offer(val);
        if (queue.size() > k) {
            queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        int k = 3;
        KthLargest kth = new KthLargest(k, nums);
        System.out.println(kth.add(3));
        System.out.println(kth.add(5));
    }

}
