package com.yang.practice.month202208;

/**
 * @Author: yangguojun01
 * @Date: 2022/8/7
 */
public class MaxArea {

    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            area = Math.max(area, Math.min(height[left], height[right]) * (right - left));
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return area;
    }

}
