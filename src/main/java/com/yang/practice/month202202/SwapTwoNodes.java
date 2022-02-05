package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/5
 */
public class SwapTwoNodes {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(-1);
        ListNode dump = pre;
        ListNode first = head;
        ListNode second = head.next;
        while (first != null && second != null) {
            ListNode tmp = second.next;
            pre.next = second;
            second.next = first;
            first.next = tmp;
            pre = first;
            first = tmp;
            second = tmp == null ? null : tmp.next;
        }
        return dump.next;
    }
}
