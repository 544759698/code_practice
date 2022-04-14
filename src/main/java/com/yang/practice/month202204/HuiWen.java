package com.yang.practice.month202204;

/**
 * @Author: yangguojun01
 * @Date: 2022/4/14
 */
public class HuiWen {
    public String longestPalindrome(String s) {
        char[] fillChars = new char[s.length() * 2 + 1];
        // TODO 要先加空格特殊字符，不然用例abb测试不过
        for (int i = 0; i < fillChars.length; i++) {
            fillChars[i] = i % 2 == 0 ? ' ' : s.charAt(i / 2);
        }
        int start = 0;
        int end = 0;
        int maxRange = 1;
        for (int i = 0; i < fillChars.length; i++) {
            int range = 1;
            while (i - range >= 0 && i + range < fillChars.length && fillChars[i - range] == fillChars[i + range]) {
                range++;
            }
            if (range > maxRange) {
                maxRange = range;
                start = i - range + 1;
                end = i + range - 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = start; j <= end; j++) {
            if (fillChars[j] != ' ') {
                sb.append(fillChars[j]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HuiWen h = new HuiWen();
        System.out.println(h.longestPalindrome("abb"));
    }

}
