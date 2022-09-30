package com.yang.practice.month202209;

/**
 * @Author: yangguojun01
 * @Date: 2022/9/30
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (i != ret) {
                    nums[ret] = nums[i];
                    nums[i] = val;
                }
                ret++;
            }
        }
        return ret;
    }
}
