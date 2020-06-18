package com.wj.leetcode.Q1_100.Q61;

import com.wj.leetcode.util.ListNode;

/**
 * Created by white_wolf on 2020/6/15.
 *
 * @author thebestwj
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode newHead;
        ListNode cur = head;
        if(cur == null || cur.next == null) return head;
        int count = 1;
        while(cur.next!=null){
            count++;
            cur = cur.next;
        }
        cur = head;
        k = k % count;
        if(k==0) return head;
        for(int i = 1 ; i< count - k;i++){
            cur = cur.next;
        }
        newHead = cur.next;
        cur.next = null;
        cur = newHead;
        for(int i = 1 ; i< k;i++){
            cur = cur.next;
        }
        cur.next = head;
        return newHead;
    }
}
