package com.yang.practice.month202203;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/4
 */
public class T02MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = m - 1;
        int idx2 = n - 1;
        while (idx1 >= 0 && idx2 >= 0) {
            if (nums1[idx1] > nums2[idx2]) {
                nums1[idx1 + idx2 + 1] = nums1[idx1];
                idx1--;
            } else {
                nums1[idx1 + idx2 + 1] = nums2[idx2];
                idx2--;
            }
        }
        while (idx2 >= 0) {
            nums1[idx2] = nums2[idx2];
            idx2--;
        }
    }
}
