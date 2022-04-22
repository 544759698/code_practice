package com.yang.practice.month202204;

import java.util.HashSet;

/**
 * @Author: yangguojun01
 * @Date: 2022/4/22
 */
public class NoRepeatString {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        if (s == null || s.length() == 0) {
            return maxLength;
        }
        HashSet<Character> appeared = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            appeared.clear();
            appeared.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (appeared.contains(s.charAt(j))) {
                    break;
                }
                appeared.add(s.charAt(j));
            }
            maxLength = Math.max(maxLength, appeared.size());
        }
        return maxLength;
    }
}
