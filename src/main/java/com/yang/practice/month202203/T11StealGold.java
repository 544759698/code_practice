package com.yang.practice.month202203;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/6
 */
public class T11StealGold {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] maxGold = new int[nums.length];
        maxGold[0] = nums[0];
        maxGold[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            maxGold[i] = Math.max(maxGold[i - 1], maxGold[i - 2] + nums[i]);
        }
        return maxGold[maxGold.length - 1];
    }
}
