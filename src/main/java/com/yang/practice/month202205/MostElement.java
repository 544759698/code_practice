package com.yang.practice.month202205;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/16
 */
public class MostElement {
    public int majorityElement(int[] nums) {
        int ret = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ret = nums[i];
            }
            count += (ret == nums[i] ? 1 : -1);
        }
        return ret;
    }
}
