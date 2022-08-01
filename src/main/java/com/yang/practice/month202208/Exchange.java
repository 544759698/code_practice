package com.yang.practice.month202208;

/**
 * @Author: yangguojun01
 * @Date: 2022/8/1
 */
public class Exchange {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (i < nums.length && nums[i] % 2 == 1) {
                i++;
            }
            while (j >= 0 && nums[j] % 2 == 0) {
                j--;
            }
            if (j > i) {
                swap(nums, i, j);
            }
        }
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
