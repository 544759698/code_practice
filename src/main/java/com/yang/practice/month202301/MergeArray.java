package com.yang.practice.month202301;

/**
 * @Author: yangguojun01
 * @Date: 2023/1/31
 */
public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m = m - 1;
        n = n - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[m + n + 1] = nums1[m];
                m--;
            } else {
                nums1[m + n + 1] = nums2[n];
                n--;
            }
        }
        while (n >= 0) {
            nums1[n] = nums2[n];
            n--;
        }
    }
}
