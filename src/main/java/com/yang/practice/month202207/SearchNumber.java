package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/3
 */
public class SearchNumber {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int first = searchFirst(nums, target, 0, nums.length - 1);
        if (first == -1) {
            return 0;
        }
        int last = searchLast(nums, target, first, nums.length - 1);
        return last - first + 1;
    }

    public int searchFirst(int[] nums, int target, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] == target && (mid > 0 && nums[mid - 1] == target)) {
                end = mid - 1;
            } else {
                start = mid;
                end = mid;
            }
        }
        return nums[start] == target ? start : -1;
    }

    public int searchLast(int[] nums, int target, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] == target && (mid < nums.length - 1 && nums[mid + 1] == target)) {
                start = mid + 1;
            } else {
                start = mid;
                end = mid;
            }
        }
        return nums[end] == target ? end : -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        SearchNumber s = new SearchNumber();
        System.out.println(s.search(nums, target));
    }

}
