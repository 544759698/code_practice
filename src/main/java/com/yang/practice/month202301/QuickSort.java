package com.yang.practice.month202301;

/**
 * @Author: yangguojun01
 * @Date: 2023/1/17
 */
public class QuickSort {

    public void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSortPart(arr, 0, arr.length - 1);
    }

    public void quickSortPart(int[] arr, int start, int end) {
        if (start >= end || start < 0 || end >= arr.length) {
            return;
        }
        int valueIndex = findValueIndex(arr, start, end);
        quickSortPart(arr, start, valueIndex - 1);
        quickSortPart(arr, valueIndex + 1, end);
    }

    public int findValueIndex(int[] arr, int start, int end) {
        int pivot = arr[end];
        // 当前顺序上第一个比pivot大的数，i=start时除外
        int i = start;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                if (i != j) {
                    swap(arr, i, j);
                }
                i++;
            }
        }
        // 这里不能漏
        swap(arr, i, end);
        return i;
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 5, 8, 1, 2, 6};
        QuickSort q = new QuickSort();
        q.quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
