package com.wj.leetcode.Q1_100.Q83;

import com.wj.leetcode.util.ListNode;

/**
 * Created by white_wolf on 2020/6/12.
 *
 * @author thebestwj
 */
//这个非常直接
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            while (next!=null && next.val==cur.val ) next = next.next;
            cur.next = next;
            if(next==null) return head;
            cur = next;
        }
        return head;
    }
}
