package com.wj.leetcode.Q101_200.Q141;

/**
 * Created by white_wolf on 2020/3/23.
 *
 * @author thebestwj
 */
public class Solution {  //hash
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}


