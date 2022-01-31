package com.yang.practice.month202201;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/30
 */
public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ret = new ArrayList<>();
        HashSet<Integer> col = new HashSet<>();
        HashSet<Integer> pie = new HashSet<>();
        HashSet<Integer> na = new HashSet<>();
        List<String> oneAns = new ArrayList<>();
        dfs(n, 0, col, pie, na, oneAns, ret);
        return ret;
    }

    public void dfs(int n, int row, HashSet<Integer> col, HashSet<Integer> pie, HashSet<Integer> na,
                    List<String> oneAns, List<List<String>> ret) {
        if (row >= n) {
            ret.add(new ArrayList<>(oneAns));
            return;
        }
        for (int j = 0; j < n; j++) {
            if (col.contains(j) || pie.contains(row + j) || na.contains(row - j)) {
                continue;
            }
            String ansItem = genAnsOneRow(j, n);
            oneAns.add(ansItem);
            col.add(j);
            pie.add(row + j);
            na.add(row - j);
            dfs(n, row + 1, col, pie, na, oneAns, ret);
            oneAns.remove(ansItem);
            col.remove(j);
            pie.remove(row + j);
            na.remove(row - j);
        }
    }

    private String genAnsOneRow(int j, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i == j ? "Q" : ".");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        NQueens n = new NQueens();
        System.out.println(n.solveNQueens(4));
    }

}
