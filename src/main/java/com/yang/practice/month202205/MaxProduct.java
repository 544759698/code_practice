package com.yang.practice.month202205;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/5
 */
public class MaxProduct {
    public int maxProduct(int[] nums) {
        int[] memoMax = new int[nums.length];
        int[] memoMin = new int[nums.length];
        memoMax[0] = nums[0];
        memoMin[0] = nums[0];
        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            memoMax[i] = Math.max(nums[i], Math.max(memoMax[i - 1] * nums[i], memoMin[i - 1] * nums[i]));
            memoMin[i] = Math.min(nums[i], Math.min(memoMax[i - 1] * nums[i], memoMin[i - 1] * nums[i]));
            ret = Math.max(ret, memoMax[i]);
        }
        return ret;
    }
}
