package com.yang.practice.month202208;

/**
 * @Author: yangguojun01
 * @Date: 2022/8/5
 */
public class TrapRain {
    public int trap(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    area += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    area += rightMax - height[right];
                }
                right--;
            }
        }
        return area;
    }
}
