package com.yang.practice.month202207;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/24
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generateOne(ret, new StringBuilder(), n, n);
        return ret;
    }

    public void generateOne(List<String> ret, StringBuilder sb, int leftAvail, int rightAvail) {
        if (leftAvail == 0 && rightAvail == 0) {
            ret.add(sb.toString());
            return;
        }
        if (leftAvail > 0) {
            sb.append("(");
            generateOne(ret, sb, leftAvail - 1, rightAvail);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (rightAvail > leftAvail) {
            sb.append(")");
            generateOne(ret, sb, leftAvail, rightAvail - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
