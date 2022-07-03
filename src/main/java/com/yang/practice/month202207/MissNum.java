package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/3
 */
public class MissNum {
    public int missingNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0] == 0 ? 1 : 0;
        }
        if (nums[nums.length - 1] == nums.length - 1) {
            return nums.length;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else if (nums[mid] > mid && (mid > 0 && nums[mid - 1] > mid - 1)) {
                right = mid - 1;
            } else {
                left = mid;
                right = mid;
            }
        }
        return left;
    }
}
