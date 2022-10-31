package com.yang.practice.month202210;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2022/10/31
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int ret = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)));
                //                left = i;
            }
            map.put(s.charAt(i), i);
            ret = Math.max(ret, i - left);
        }
        return ret;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        LongestSubstring l = new LongestSubstring();
        int ret = l.lengthOfLongestSubstring(s);
        System.out.println(ret);
    }
}
