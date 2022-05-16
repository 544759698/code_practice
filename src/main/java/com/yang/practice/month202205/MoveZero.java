package com.yang.practice.month202205;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/16
 */
public class MoveZero {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        if (j == nums.length - 1) {
                            return;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }
}
