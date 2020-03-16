package com.wj.leetcode.Q19;

/**
 * Created by white_wolf on 2020/3/16.
 *
 * @author thebestwj
 */

//Definition for singly-linked list.


public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;  //特殊情况
        ListNode pivot = head;
        ListNode pivot1 = head;
        for (int i = 0; i < n; i++) {
            if (pivot1.next == null) return head.next;
            pivot1 = pivot1.next;
        }
        while (pivot1.next != null) {
            pivot = pivot.next;
            pivot1 = pivot1.next;
        }
        pivot.next = pivot.next.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}