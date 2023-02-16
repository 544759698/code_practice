package com.yang.practice.month202302;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2023/2/16
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generate(ret, new StringBuilder(), n, n);
        return ret;
    }

    public void generate(List<String> ret, StringBuilder sb, int leftAvail, int rightAvail) {
        if (leftAvail == 0 && rightAvail == 0) {
            ret.add(sb.toString());
            return;
        }
        if (leftAvail > 0) {
            sb.append("(");
            generate(ret, sb, leftAvail - 1, rightAvail);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (rightAvail > leftAvail) {
            sb.append(")");
            generate(ret, sb, leftAvail, rightAvail - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
