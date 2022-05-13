package com.yang.practice.month202205;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/13
 */
//public class HuaweiTest1 {
//    public static void main(String[] args) {
//        try {
//            while (true) {
//                Scanner s = new Scanner(System.in);
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                int in = Integer.parseInt(br.readLine());
//                if (in == 0) {
//                    break;
//                }
//                System.out.println(in / 2);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

import java.util.*;

public class HuaweiTest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int bottle = s.nextInt();
            if (bottle == 0) {
                break;
            }
            System.out.println(bottle / 2);
        }
    }
}
