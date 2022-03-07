package com.yang.practice.month202203;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/7
 */
public class L06DeleteLastN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode preHead = pre;
        int i = 0;
        while (i < n) {
            head = head.next;
            i++;
        }
        while (head != null) {
            head = head.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return preHead.next;
    }
}
