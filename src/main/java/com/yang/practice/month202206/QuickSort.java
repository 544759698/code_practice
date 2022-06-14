package com.yang.practice.month202206;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/14
 */
public class QuickSort {

    public int[] sortArray(int[] nums) {
        sortArray(nums, 0, nums.length - 1);
        return nums;
    }

    public void sortArray(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(nums, start, end);
        sortArray(nums, start, pivot - 1);
        sortArray(nums, pivot + 1, end);
    }

    public int partition(int[] nums, int start, int end) {
        int value = nums[end];
        int idx = start;
        for (int i = start; i < end; i++) {
            if (nums[i] < value) {
                if (idx != i) {
                    swap(nums, idx, i);
                }
                idx++;
            }
        }
        swap(nums, idx, end);
        return idx;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
