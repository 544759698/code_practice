package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/3
 */
public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dpMax = new int[nums.length];
        int[] dpMin = new int[nums.length];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        int max = dpMax[0];
        for (int i = 1; i < nums.length; i++) {
            dpMax[i] = Math.max(dpMax[i - 1] * nums[i], Math.max(dpMin[i - 1] * nums[i], nums[i]));
            dpMin[i] = Math.min(dpMax[i - 1] * nums[i], Math.min(dpMin[i - 1] * nums[i], nums[i]));
            max = Math.max(dpMax[i], max);
        }
        return max;
    }
}
