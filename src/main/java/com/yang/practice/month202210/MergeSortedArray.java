package com.yang.practice.month202210;

/**
 * @Author: yangguojun01
 * @Date: 2022/10/4
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (m - 1 >= 0 && n - 1 >= 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[i] = nums1[m - 1];
                    m--;
                } else {
                    nums1[i] = nums2[n - 1];
                    n--;
                }
            } else if (m - 1 >= 0) {
                nums1[i] = nums1[m - 1];
                m--;
            } else if (n - 1 >= 0) {
                nums1[i] = nums2[n - 1];
                n--;
            }
        }
    }
}
