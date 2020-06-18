package com.wj.leetcode.Q1_100.Q83;

import com.wj.leetcode.util.ListNode;

/**
 * Created by white_wolf on 2020/6/12.
 *
 * @author thebestwj
 */
//官方解法，更简洁一点
public class SolutionB {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
