package com.wj.leetcode.Q206;

/**
 * Created by white_wolf on 2020/3/23.
 *
 * @author thebestwj
 */
public class SolutionB {  //迭代
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
