package com.yang.practice.month202302;

/**
 * @Author: yangguojun01
 * @Date: 2023/2/7
 */
public class DeleteLastN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(-1);
        ListNode dumpy = pre;
        pre.next = head;
        int i = 0;
        while (head != null) {
            head = head.next;
            if (i < n) {
                i++;
            } else {
                pre = pre.next;
            }
        }
        pre.next = pre.next != null ? pre.next.next : null;
        return dumpy.next;
    }
}
