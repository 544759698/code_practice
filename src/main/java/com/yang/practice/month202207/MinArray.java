package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/27
 */
public class MinArray {
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] > numbers[high]) {
                low = low + 1;
            } else if (numbers[mid] < numbers[high]) {
                high = mid;
            } else {
                high--;
            }
        }
        return numbers[low];
    }

    public static void main(String[] args) {
        MinArray m = new MinArray();
        System.out.println(m.minArray(new int[]{1,2}));
    }
}
