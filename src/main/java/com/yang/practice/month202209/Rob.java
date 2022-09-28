package com.yang.practice.month202209;

/**
 * @Author: yangguojun01
 * @Date: 2022/9/28
 */
public class Rob {
    public int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int[] memo = new int[nums.length];
        memo[0] = nums[0];
        memo[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            memo[i] = Math.max(memo[i - 1], memo[i - 2] + nums[i]);
        }
        return memo[memo.length - 1];
    }
}
