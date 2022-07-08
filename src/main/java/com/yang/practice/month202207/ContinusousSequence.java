package com.yang.practice.month202207;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/8
 */
public class ContinusousSequence {
    public int[][] findContinuousSequence(int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= target / 2 + 1; i++) {
            int j = i;
            int sum = i;
            while (sum < target) {
                j++;
                sum += j;
            }
            if (sum == target) {
                List<Integer> ans = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    ans.add(k);
                }
                list.add(ans);
            }
        }

        int[][] ret = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            int[] arr = new int[list.get(i).size()];
            for (int j = 0; j < list.get(i).size(); j++) {
                arr[j] = list.get(i).get(j);
            }
            ret[i] = arr;
        }
        return ret;
    }
}
