package com.yang.practice.month202202;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/4
 */
public class MidNode {

    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }

}
