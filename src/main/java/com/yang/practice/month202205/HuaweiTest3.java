package com.yang.practice.month202205;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/15
 */
public class HuaweiTest3 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String input = s.nextLine();
            int ret = 0;
            for (int i = 2; i < input.length(); i++) {
                Integer ele = map.get(input.charAt(i));
                ret += (ele * Math.pow(16, input.length() - i - 1));
            }
            System.out.println(ret);
        }
    }
}
