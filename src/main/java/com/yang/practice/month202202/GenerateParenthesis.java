package com.yang.practice.month202202;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/1
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generateByOne(n, n, "", ret);
        return ret;
    }

    public void generateByOne(int leftAvail, int rightAvail, String ans, List<String> ret) {
        if (leftAvail == 0 && rightAvail == 0) {
            ret.add(ans);
            return;
        }
        if (leftAvail > 0) {
            generateByOne(leftAvail - 1, rightAvail, ans + "(", ret);
        }
        if (rightAvail > leftAvail) {
            generateByOne(leftAvail, rightAvail - 1, ans + ")", ret);
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis g = new GenerateParenthesis();
        List<String> ret = g.generateParenthesis(1);
        System.out.println(ret);
    }

}
