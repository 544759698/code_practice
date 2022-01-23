package com.yang.practice.month202201;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/23
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> appeared = new HashMap<>();
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (appeared.containsKey(target - nums[i])) {
                ret[0] = i;
                ret[1] = appeared.get(target - nums[i]);
                return ret;
            }
            appeared.put(nums[i], i);
        }
        return ret;
    }

}
