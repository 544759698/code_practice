package com.yang.practice.month202205;

import java.util.Arrays;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/30
 */
public class NextBigger {

    public static void main(String[] args) {
        //        int[] nums = {1, 2, 1, 3, 5, 2, 1};
        int[] nums = {5, 4, 3, 2, 1};
        NextBigger nb = new NextBigger();
        int[] ret = nb.nextBigger(nums);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i] + " ");
        }
    }

    public int[] nextBigger(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new int[] {-1};
        }
        int[] ret = new int[nums.length];
        Arrays.fill(ret, -1);
        for (int i = 0; i < ret.length; i++) {
            int idx = i + 1;
            while (idx != i) {
                if (idx == ret.length) {
                    idx = 0;
                    if (i == 0) {
                        break;
                    }
                }
                if (nums[idx] > nums[i]) {
                    ret[i] = nums[idx];
                    break;
                }
                idx++;
            }
        }
        return ret;
    }

}
