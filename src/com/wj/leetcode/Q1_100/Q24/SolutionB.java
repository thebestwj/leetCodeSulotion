package com.wj.leetcode.Q1_100.Q24;

import com.wj.leetcode.util.ListNode;

/**
 * Created by white_wolf on 2020/5/31.
 *
 * @author thebestwj
 */
//递归
public class SolutionB {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
