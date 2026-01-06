package com.yang.practice.month202307;

import java.util.HashMap;

public class TwoSum2 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        TwoSum2 ts = new TwoSum2();
        int[] ret = ts.twoSum(nums, 6);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(target - nums[i])) {
                ret[0] = indexMap.get(target - nums[i]);
                ret[1] = i;
                break;
            }
            indexMap.put(nums[i], i);
        }
        return ret;
    }

}
