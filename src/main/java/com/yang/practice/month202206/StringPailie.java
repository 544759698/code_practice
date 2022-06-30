package com.yang.practice.month202206;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/30
 */
public class StringPailie {
    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        List<String> ret = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[chars.length];
        traceback(0, chars, visited, ret, sb);
        String[] retArr = new String[ret.size()];
        return ret.toArray(retArr);
    }

    public void traceback(int i, char[] chars, boolean[] visited, List<String> ret, StringBuilder sb) {
        if (i == chars.length) {
            ret.add(sb.toString());
            return;
        }
        for (int j = 0; j < chars.length; j++) {
            if (visited[j] || (j > 0 && !visited[j - 1] && chars[j - 1] == chars[j])) {
                continue;
            }
            sb.append(chars[j]);
            visited[j] = true;
            traceback(i + 1, chars, visited, ret, sb);
            sb.deleteCharAt(sb.length() - 1);
            visited[j] = false;
        }
    }

    public static void main(String[] args) {
        StringPailie sp = new StringPailie();
        String[] retArr = sp.permutation("abb");
        for (int i = 0; i < retArr.length; i++) {
            System.out.println(retArr[i]);
        }
    }

}
