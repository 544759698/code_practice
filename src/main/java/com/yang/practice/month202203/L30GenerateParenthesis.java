package com.yang.practice.month202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/15
 */
public class L30GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        getParenthesis(ret, "", n, n);
        return ret;
    }

    public void getParenthesis(List<String> ret, String sub, int left, int right) {
        if (left == 0 && right == 0) {
            ret.add(sub);
        }
        if (left > 0) {
            sub += "(";
            getParenthesis(ret, sub, left - 1, right);
            sub = sub.substring(0, sub.length() - 2);
        }
        if (right > left) {
            sub += ")";
            getParenthesis(ret, sub, left, right - 1);
        }
    }
}
