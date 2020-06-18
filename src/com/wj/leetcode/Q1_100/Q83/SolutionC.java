package com.wj.leetcode.Q1_100.Q83;

import com.wj.leetcode.util.ListNode;

/**
 * Created by white_wolf on 2020/6/12.
 *
 * @author thebestwj
 */
//递归
public class SolutionC {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if (head.val == head.next.val) {
            return head.next;
        }
        return head;
    }
}
