package com.yang.practice.month202205;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/5/5
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generateOne(ret, n, n, new StringBuilder());
        return ret;
    }

    public void generateOne(List<String> ret, int leftAvail, int rightAvail, StringBuilder sb) {
        if (leftAvail == 0 && rightAvail == 0) {
            ret.add(sb.toString());
            return;
        }
        if (leftAvail > 0) {
            sb.append("(");
            generateOne(ret, leftAvail - 1, rightAvail, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (rightAvail > leftAvail) {
            sb.append(")");
            generateOne(ret, leftAvail, rightAvail - 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
