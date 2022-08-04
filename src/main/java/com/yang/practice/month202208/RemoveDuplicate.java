package com.yang.practice.month202208;

/**
 * @Author: yangguojun01
 * @Date: 2022/8/4
 */
public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                if (j - i > 1) {
                    nums[i + 1] = nums[j];
                }
                i++;
            }
            j++;
        }
        return i + 1;
    }
}
