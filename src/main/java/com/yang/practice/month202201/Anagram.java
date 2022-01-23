package com.yang.practice.month202201;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2022/1/23
 */
public class Anagram {

    public boolean isAnagram(String s, String t) {
        if (s == t) {
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            sMap.put(sChars[i], sMap.getOrDefault(sChars[i], 0) + 1);
            tMap.put(tChars[i], tMap.getOrDefault(tChars[i], 0) + 1);
        }
        return sMap.equals(tMap);
    }

}
