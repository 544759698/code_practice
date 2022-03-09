package com.yang.practice.month202203;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/9
 */
public class L06ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }
}
