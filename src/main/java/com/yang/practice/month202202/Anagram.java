package com.yang.practice.month202202;

import java.util.HashMap;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/1
 */
public class Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sMap.equals(tMap);
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        System.out.println(a.isAnagram("rat", "tar"));
    }

}
