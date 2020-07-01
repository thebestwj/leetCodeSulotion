package com.wj.leetcode.Q101_200.Q142;

import com.wj.leetcode.util.ListNode;

/**
 * Created by white_wolf on 2020/6/28.
 *
 * @author thebestwj
 */
//O(1)额外空间
public class SolutionB {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode p = head, p2 = head;
        boolean hasCycle = false;
        while (p2.next != null && p2.next.next != null) {
            p = p.next;
            p2 = p2.next.next;
            if (p == p2) {
                hasCycle = true;
                break;
            }
        }
        if (hasCycle) {
            ListNode q = head;
            while (p != q) {
                p = p.next;
                q = q.next;
            }
            return q;
        } else
            return null;
    }
}
