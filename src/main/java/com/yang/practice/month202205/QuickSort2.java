package com.yang.practice.month202205;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/13
 */
public class QuickSort2 {
    public int[] sortArray(int[] nums) {
        partitionSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void partitionSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIdx = getPivot(nums, left, right);
        partitionSort(nums, left, pivotIdx - 1);
        partitionSort(nums, pivotIdx + 1, right);
    }

    public int getPivot(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                if (i != j) {
                    swap(nums, i, j);
                }
                i++;
            }
        }
        swap(nums, i, right);
        return i;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
