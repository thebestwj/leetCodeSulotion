package com.wj.leetcode.Q1_100.Q24;

import com.wj.leetcode.util.ListNode;

/**
 * Created by white_wolf on 2020/5/31.
 *
 * @author thebestwj
 */
//非递归
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null||head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode a = head;
        ListNode b = a.next;
        head = b;
        while(b!=null){
            dummy = b.next;
            b.next = a;
            if(dummy == null){
                a.next = null;
                return head;
            }
            if (dummy.next==null){
                a.next = dummy;
                return head;
            }else {
                a.next = dummy.next;
                a = dummy;
                b = dummy.next;
            }
        }
        return head;
    }
}
