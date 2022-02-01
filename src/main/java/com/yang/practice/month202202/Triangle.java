package com.yang.practice.month202202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/1
 */
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] minDp = new int[n][n];
        minDp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            minDp[i][0] = minDp[i - 1][0] + triangle.get(i).get(0);
            minDp[i][i] = minDp[i - 1][i - 1] + triangle.get(i).get(i);
            for (int j = 1; j < triangle.get(i).size() - 1; j++) {
                minDp[i][j] = Math.min(minDp[i - 1][j - 1], minDp[i - 1][j]) + triangle.get(i).get(j);
            }
        }
        int minPath = minDp[n - 1][0];
        for (int i = 1; i < n; i++) {
            minPath = Math.min(minPath, minDp[n - 1][i]);
        }
        return minPath;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<Integer>() {{
            add(2);
        }});
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        Triangle t = new Triangle();
        System.out.println(t.minimumTotal(triangle));
    }

}
