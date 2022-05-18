package com.yang.practice.month202205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/17
 */
public class HuaweiTest12 {
    static HashSet<Character> charSet = new HashSet<>();
    static HashMap<Character, Character> bracketMap = new HashMap<Character, Character>();

    static {
        charSet.add('a');
        charSet.add('b');
        charSet.add('c');
        charSet.add('d');
        charSet.add('e');
        charSet.add('f');
        charSet.add('g');
        charSet.add('h');
        charSet.add('i');
        charSet.add('j');
        charSet.add('k');
        charSet.add('l');
        charSet.add('m');
        charSet.add('n');
        charSet.add('o');
        charSet.add('p');
        charSet.add('q');
        charSet.add('r');
        charSet.add('s');
        charSet.add('t');
        charSet.add('u');
        charSet.add('v');
        charSet.add('w');
        charSet.add('x');
        charSet.add('y');
        charSet.add('z');
        charSet.add(' ');
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String line = s.nextLine();
            int i = 0;
            int start = 0;
            int end = 0;
            while (i < line.length()) {
                start = i;
                end = i;
                if (bracketMap.containsKey(line.charAt(start))) {
                    char endChar = bracketMap.get(line.charAt(start));
                    int j = start + 1;
                    while (j < line.length()) {
                        if (line.charAt(j) == endChar) {
                            break;
                        }
                        j++;
                    }
                    end = j;
                    String checkStr = line.substring(start + 1, end);
                    if (endChar == ')' || endChar == ']') {
                        if (!checkRule23(checkStr)) {
                            System.out.println(0);
                            break;
                        }
                    }
                    if (endChar == '}') {
                        if (!checkRule4(checkStr)) {
                            System.out.println(0);
                            break;
                        }
                    }
                    i += (end - start + 1);
                } else {
                    int j = start + 1;
                    while (j < line.length()) {
                        if (!charSet.contains(line.charAt(j))) {
                            break;
                        }
                        j++;
                    }
                    end = j;
                    String checkStr = line.substring(start, end);
                    if (!checkRule1(checkStr)) {
                        System.out.println(0);
                        break;
                    }
                    i += (end - start);
                }
            }
            if (i >= line.length()) {
                System.out.println(1);
            }
        }
    }

    public static boolean checkRule1(String str) {
        if (str == null || str == "") {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!charSet.contains(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkRule23(String str) {
        if (str == null || str == "") {
            return false;
        }
        String[] strArr = str.split("\\|");
        for (int i = 0; i < strArr.length; i++) {
            String item = strArr[i].trim();
            if (item.length() == 0) {
                return false;
            }
            if (!checkRule1(item)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkRule4(String str) {
        try {
            if (str == null || str == "") {
                return false;
            }
            String[] strArr = str.split(",");
            if (strArr.length != 2) {
                return false;
            }
            int i1 = Integer.parseInt(strArr[0].trim());
            int i2 = Integer.parseInt(strArr[1].trim());
            return i1 <= i2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
