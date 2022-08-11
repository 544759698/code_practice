package com.yang.practice.month202208;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/8/11
 */
public class CombineSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> ans = new ArrayList<>();
        dfs(candidates, target, ret, ans, 0);
        return ret;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> ret, List<Integer> ans, int begin) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            ret.add(new ArrayList<>(ans));
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            ans.add(candidates[i]);
            dfs(candidates, target - candidates[i], ret, ans, i);
            ans.remove(ans.size() - 1);
        }
    }

}
