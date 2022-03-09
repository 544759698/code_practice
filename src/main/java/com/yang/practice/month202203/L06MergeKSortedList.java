package com.yang.practice.month202203;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: yangguojun01
 * @Date: 2022/3/9
 */
public class L06MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode pre = new ListNode(-1);
        ListNode dummy = pre;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null) {
                continue;
            }
            queue.offer(lists[i]);
        }
        while (!queue.isEmpty()) {
            ListNode top = queue.poll();
            pre.next = top;
            pre = pre.next;
            if (top.next != null) {
                queue.offer(top.next);
            }
        }
        return dummy.next;
    }
}
