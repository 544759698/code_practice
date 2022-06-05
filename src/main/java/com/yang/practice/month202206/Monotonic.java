package com.yang.practice.month202206;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/5
 */
public class Monotonic {
    public boolean isMonotonic(int[] nums) {
        boolean isIncrease = true;
        boolean isDecrease = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isIncrease = false;
            }
            if (nums[i] < nums[i + 1]) {
                isDecrease = false;
            }
        }
        return isIncrease || isDecrease;
    }
}
