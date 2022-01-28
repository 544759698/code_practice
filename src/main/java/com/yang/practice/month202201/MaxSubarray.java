package com.yang.practice.month202201;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/28
 */
public class MaxSubarray {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] maxF = Arrays.copyOf(nums, nums.length);
        int[] minF = Arrays.copyOf(nums, nums.length);
        int maxValue = maxF[0];
        for (int i = 1; i < nums.length; i++) {
            maxF[i] = Math.max(maxF[i - 1] * nums[i], Math.max(nums[i], minF[i - 1] * nums[i]));
            minF[i] = Math.min(maxF[i - 1] * nums[i], Math.min(nums[i], minF[i - 1] * nums[i]));
            maxValue = Math.max(maxValue, maxF[i]);
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        MaxSubarray m = new MaxSubarray();
        int ret = m.maxProduct(nums);
        System.out.println(ret);
    }

}
