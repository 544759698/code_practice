package com.yang.practice.month202205;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/17
 */
public class HuaweiTest11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input == "" || input == null) {
            return;
        }
        String[] inputStrArr = input.split(" ");
        int[] inputIntArr = new int[inputStrArr.length];
        for (int i = 0; i < inputStrArr.length; i++) {
            inputIntArr[i] = Integer.parseInt(inputStrArr[i]);
        }
        Arrays.sort(inputIntArr);
        for (int i = 0; i < inputIntArr.length; i++) {
            System.out.print(inputIntArr[i] + " ");
        }
    }

}
