package com.yang.practice.month202210;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2022/10/4
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        HashMap<Integer, Integer> appeared = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (appeared.containsKey(target - nums[i])) {
                return new int[] {appeared.get(target - nums[i]), i};
            }
            appeared.put(nums[i], i);
        }
        return ret;
    }
}
