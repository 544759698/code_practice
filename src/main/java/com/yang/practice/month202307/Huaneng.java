package com.yang.practice.month202307;

/**
 * @Author: yangguojun01
 * @Date: 2023/8/14
 */
public class Huaneng {

    public int get2nd(int[] arr) {
        int first = -1;
        int second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == first) {
                continue;
            }
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 6, 1, 9, 9, 9, 9};
        Huaneng h = new Huaneng();
        System.out.println(h.get2nd(arr));
    }
}
