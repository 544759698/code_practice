package com.yang.practice.month202209;

/**
 * @Author: yangguojun01
 * @Date: 2022/9/16
 */
public class MostElement {
    public int majorityElement(int[] nums) {
        int ret = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ret = nums[i];
            }
            count += ret == nums[i] ? 1 : -1;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 2};
        MostElement m = new MostElement();
        System.out.println(m.majorityElement(nums));
        ;
    }
}
