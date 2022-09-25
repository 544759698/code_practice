package com.yang.practice.month202209;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2022/9/25
 */
public class NoRepeatSubString {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ret = 0;
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
