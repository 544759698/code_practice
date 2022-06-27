package com.yang.practice.month202206;

/**
 * @Author: yangguojun01
 * @Date: 2022/6/27
 */
public class TreePost {

    public boolean verifyPostorder(int[] postorder) {
        return checkPost(postorder, 0, postorder.length - 1);
    }

    public boolean checkPost(int[] post, int start, int end) {
        if (start >= end) {
            return true;
        }
        int idx = start;
        while (idx <= end && post[idx] < post[end]) {
            idx++;
        }
        int mid = idx;
        while (idx <= end && post[idx] > post[end]) {
            idx++;
        }
        if (idx != end) {
            return false;
        }
        return checkPost(post, start, mid - 1) && checkPost(post, mid, end - 1);
    }

}
