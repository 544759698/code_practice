package com.yang.practice.month202307;

import java.util.HashSet;

/**
 * @Author: yangguojun01
 * @Date: 2023/7/29
 */
public class TwoSum {

    public boolean findTarget(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(target - nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        System.out.println(ts.findTarget(new int[]{2, 4, 5, 7, 10}, 12));
        System.out.println(ts.findTarget(new int[]{2, 4, 5, 7, 10}, 9));
        System.out.println(ts.findTarget(new int[]{2, 4, 5, 7, 10}, 8));
    }

    public boolean findTarget1(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(target - nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
