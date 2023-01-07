package com.yang.practice.month202301;

/**
 * @Author: yangguojun01
 * @Date: 2023/1/7
 */
public class Search {
    public int search(int[] nums, int target) {
        int ret = -1;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (target > nums[mid]) {
                i = mid + 1;
            } else if (target < nums[mid]) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return ret;
    }
}
