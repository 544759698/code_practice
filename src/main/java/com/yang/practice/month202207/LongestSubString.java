package com.yang.practice.month202207;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/2
 */
public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int ret = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i), i);
            ret = Math.max(ret, i - left);
        }
        return ret;
    }
}
