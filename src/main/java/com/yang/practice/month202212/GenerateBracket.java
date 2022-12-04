package com.yang.practice.month202212;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/12/4
 */
public class GenerateBracket {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generateOne(ret, new StringBuilder(), n, n);
        return ret;
    }

    public void generateOne(List<String> ret, StringBuilder sb, int leftAvail, int rightAvail) {
        if (leftAvail == 0 && rightAvail == 0) {
            ret.add(sb.toString());
        }
        if (leftAvail > 0) {
            sb.append("(");
            generateOne(ret, sb, leftAvail - 1, rightAvail);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (rightAvail > leftAvail && rightAvail > 0) {
            sb.append(")");
            generateOne(ret, sb, leftAvail, rightAvail - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
