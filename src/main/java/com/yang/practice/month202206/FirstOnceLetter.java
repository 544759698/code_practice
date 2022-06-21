package com.yang.practice.month202206;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/21
 */
public class FirstOnceLetter {

    public char firstUniqChar(String s) {
        HashMap<Character, Integer> posMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (posMap.containsKey(s.charAt(i))) {
                posMap.put(s.charAt(i), -1);
            } else {
                posMap.put(s.charAt(i), i);
            }
        }
        int first = -1;
        for (Map.Entry<Character, Integer> entry : posMap.entrySet()) {
            if (entry.getValue() > -1) {
                first = first == -1 ? entry.getValue() : Math.min(first, entry.getValue());
            }
        }
        return first != -1 ? s.charAt(first) : ' ';
    }

}
