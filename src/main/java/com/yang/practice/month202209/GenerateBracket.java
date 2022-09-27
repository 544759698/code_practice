package com.yang.practice.month202209;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/9/27
 */
public class GenerateBracket {

    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generateOne(n, n, new StringBuilder(), ret);
        return ret;
    }

    public void generateOne(int leftAvail, int rightAvail, StringBuilder ans, List<String> ret) {
        if (leftAvail == 0 && rightAvail == 0) {
            ret.add(ans.toString());
            return;
        }
        if (leftAvail > 0) {
            ans = ans.append("(");
            generateOne(leftAvail - 1, rightAvail, ans, ret);
            ans = ans.deleteCharAt(ans.length() - 1);
        }
        if (rightAvail > leftAvail && rightAvail > 0) {
            ans = ans.append(")");
            generateOne(leftAvail, rightAvail - 1, ans, ret);
            ans = ans.deleteCharAt(ans.length() - 1);
        }
    }
}
