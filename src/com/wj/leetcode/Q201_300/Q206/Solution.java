package com.wj.leetcode.Q201_300.Q206;

/**
 * Created by white_wolf on 2020/3/17.
 *
 * @author thebestwj
 */
public class Solution {  //双指针迭代

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur.next !=null){
            ListNode t = cur.next;
            cur.next = pre;
            pre = cur;
            cur = t;
        }
        cur.next = pre;
        return cur;
    }
}


