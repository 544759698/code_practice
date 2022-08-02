package com.yang.practice.month202208;

/**
 * @Author: yangguojun01
 * @Date: 2022/8/2
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String xStr = x + "";
        int i = 0;
        int j = xStr.length() - 1;
        while (j - i > 0) {
            if (xStr.charAt(i) != xStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
