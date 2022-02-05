package com.yang.practice.month202202;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: yangguojun01
 * @Date: 2022/2/5
 */
public class MergeKSortedLinkedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }
        ListNode head = queue.peek();
        ListNode pre = new ListNode(-1);
        while (!queue.isEmpty()) {
            ListNode curr = queue.poll();
            pre.next = curr;
            if (curr.next != null) {
                curr = curr.next;
                queue.offer(curr);
            }
            pre = pre.next;
        }
        return head;
    }
}
