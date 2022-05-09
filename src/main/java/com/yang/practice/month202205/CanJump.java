package com.yang.practice.month202205;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/9
 */
public class CanJump {
    public boolean canJump(int[] nums) {
        int target = nums.length;
        int most = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= most) {
                most = Math.max(most, i + nums[i]);
                if (most >= target - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
