package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/4
 */
public class MergeSorted {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode(-1);
        ListNode dump = pre;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        pre.next = list1 != null ? list1 : list2;
        return dump.next;
    }
}
