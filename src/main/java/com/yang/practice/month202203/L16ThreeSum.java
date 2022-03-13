package com.yang.practice.month202203;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/13
 */
public class L16ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        if (nums.length < 3) {
            return ret;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //            if ((i + 1) < nums.length && nums[i] == nums[i + 1]) {
            //                continue;
            //            }
            for (int j = i + 1; j < nums.length; j++) {
                //                if ((j + 1) < nums.length && nums[j] == nums[j + 1]) {
                //                    continue;
                //                }
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int third = nums.length - 1;
                while (third > j) {
                    if (nums[i] + nums[j] + nums[third] == 0) {
                        List<Integer> retItem = new ArrayList<>();
                        retItem.add(nums[i]);
                        retItem.add(nums[j]);
                        retItem.add(nums[third]);
                        ret.add(retItem);
                        break;
                    }
                    if (nums[i] + nums[j] + nums[third] < 0) {
                        break;
                    }
                    third--;
                }
            }
        }
        return ret;
    }
}
