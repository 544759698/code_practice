package com.yang.practice.month202205;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/8
 */
public class CombineSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(candidates);
        traceback(ret, ans, 0, candidates, target);
        return ret;
    }

    public void traceback(List<List<Integer>> ret, List<Integer> ans, int idx, int[] candidates, int targetLeft) {
        if (idx >= candidates.length) {
            return;
        }
        if (targetLeft == 0) {
            ret.add(new ArrayList<>(ans));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (targetLeft >= candidates[i]) {
                ans.add(candidates[i]);
                traceback(ret, ans, i, candidates, targetLeft - candidates[i]);
                ans.remove(ans.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        CombineSum c = new CombineSum();
        List<List<Integer>> ret = c.combinationSum(candidates, target);
        System.out.println(ret);
    }

}
