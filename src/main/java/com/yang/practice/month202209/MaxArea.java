package com.yang.practice.month202209;

/**
 * @Author: yangguojun01
 * @Date: 2022/9/26
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ret = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            ret = Math.max(ret, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ret;
    }
}
