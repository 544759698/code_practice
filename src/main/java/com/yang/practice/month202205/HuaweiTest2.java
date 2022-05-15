package com.yang.practice.month202205;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/15
 */
public class HuaweiTest2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Scanner s = new Scanner(System.in);
        int rows = -1;
        int currRow = 0;
        while (s.hasNext()) {
            if (rows < 0) {
                rows = s.nextInt();
            } else {
                currRow++;
                int num = s.nextInt();
                set.add(num);
                if (currRow >= rows) {
                    break;
                }
            }
        }
        for (int i : set) {
            System.out.println(i);
        }
    }
}
