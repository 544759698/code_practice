package com.yang.practice.month202207;

/**
 * @Author: yangguojun01
 * @Date: 2022/7/30
 */
public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode dump = pre;
        while (head.val!=val){
            head = head.next;
            pre = pre.next;
        }
        pre.next = head.next;
        return dump.next;
    }
}
