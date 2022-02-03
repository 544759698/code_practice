package com.yang.practice.month202202;

import java.util.PriorityQueue;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/3
 */
public class KthLargest {

    PriorityQueue<Integer> p;
    int capacity;

    public KthLargest(int k, int[] nums) {
        p = new PriorityQueue<>(k);
        capacity = k;
        for (int num : nums) {
            p.add(num);
        }
        while (p.size() > capacity) {
            p.poll();
        }
    }

    public int add(int val) {
        p.add(val);
        if (p.size() > capacity) {
            p.poll();
        }
        return p.peek();
    }
}
