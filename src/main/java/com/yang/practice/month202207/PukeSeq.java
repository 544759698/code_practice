package com.yang.practice.month202207;

import java.util.HashSet;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/18
 */
public class PukeSeq {
    public boolean isStraight(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min = 14;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (set.contains(nums[i])) {
                return false;
            }
            set.add(nums[i]);
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return max - min < 5;
    }
}
