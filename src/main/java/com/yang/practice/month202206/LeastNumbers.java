package com.yang.practice.month202206;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/14
 */
public class LeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                queue.offer(arr[i]);
            } else if (!queue.isEmpty() && arr[i] < queue.peek()) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll();
        }
        return ret;
    }
}
