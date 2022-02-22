package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/22
 */
public class LengthLIS {
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        lis[0] = 1;
        int max = lis[0];
        for (int i = 1; i < nums.length; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
            max = Math.max(max, lis[i]);
        }
        return max;
    }
}
