package com.yang.practice.day20220119;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/19
 */
public class FindFirstOne {

    public int firstOne(int[] nums) {
        if (nums == null || nums.length == 0 || nums[nums.length - 1] == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] nums2 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] nums3 = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        FindFirstOne f = new FindFirstOne();
        System.out.println(f.firstOne(nums1));
        System.out.println(f.firstOne(nums2));
        System.out.println(f.firstOne(nums3));
    }

}
