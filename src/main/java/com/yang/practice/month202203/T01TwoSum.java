package com.yang.practice.month202203;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/4
 */
public class T01TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer idx = map.get(target - nums[i]);
            if (idx != null) {
                ret[0] = i;
                ret[1] = idx;
                return ret;
            } else {
                map.put(nums[i], i);
            }
        }
        return ret;
    }
}
