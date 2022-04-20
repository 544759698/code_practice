package com.yang.practice.month202204;

/**
 * @Author: yangguojun01
 * @Date: 2022/4/20
 */
public class DeleteLastN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode slow = preHead;
        ListNode fast = head;
        int i = 0;
        while (i < n) {
            fast = fast.next;
            i++;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return preHead.next;
    }
}
