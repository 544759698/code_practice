package com.yang.practice.month202206;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/26
 */
public class SubTree2 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return checkSub(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean checkSub(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null) {
            return false;
        }
        if (a.val != b.val) {
            return false;
        }
        return checkSub(a.left, b.left) && checkSub(a.right, b.right);
    }

}
