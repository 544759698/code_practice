package com.yang.practice.month202206;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/13
 */
public class MoreElement {
    public int majorityElement(int[] nums) {
        int ret = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ret = nums[i];
                count += 1;
            } else {
                count = count + (ret == nums[i] ? 1 : -1);
            }
        }
        return ret;
    }
}
