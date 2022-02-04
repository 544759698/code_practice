package com.yang.practice.month202202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/4
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        int third;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                third = nums.length - 1;
                while (third > j && nums[j] + nums[third] > -nums[i]) {
                    third--;
                }
                if (third == j) {
                    break;
                }
                if (nums[j] + nums[third] == -nums[i]) {
                    List<Integer> item = new ArrayList<>();
                    item.add(nums[i]);
                    item.add(nums[j]);
                    item.add(nums[third]);
                    ret.add(item);
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 2, 3, 0, 1, 2, 3, -1, -4, 2};
        ThreeSum t = new ThreeSum();
        System.out.println(t.threeSum(nums));
    }

}
