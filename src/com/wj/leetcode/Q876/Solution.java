package com.wj.leetcode.Q876;

/**
 * Created by white_wolf on 2020/3/23.
 *
 * @author thebestwj
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next ==null) return  head;
        ListNode slow = new ListNode(0);
        slow.next = head;
        ListNode fast = new ListNode(0);
        fast.next = head;
        while(fast.next !=null){
            slow = slow.next;
            fast = fast.next;
            if(fast.next == null) return slow;
            fast = fast.next;
            if(fast.next == null) return slow.next;
        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}