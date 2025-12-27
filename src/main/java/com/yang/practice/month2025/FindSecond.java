package com.yang.practice.month2025;

public class FindSecond {

    public int get2nd(int[] arr) {
        int first = -1;
        int second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == first) {
                continue;
            }
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 1, 9, 9, 9};
        FindSecond fs = new FindSecond();
        System.out.println(fs.get2nd(arr));
    }

}
