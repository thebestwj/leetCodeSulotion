package com.wj.leetcode.Q1_100.Q2;

import com.wj.leetcode.util.ListNode;

/**
 * Created by white_wolf on 2020/5/2.
 *
 * @author thebestwj
 */
public class Solution {  //与445相同 此题为倒着来，比较简单
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode now = null;
        while (l1 != null || l2!=null || carry!=0) {
           int l1Val = l1 == null? 0:l1.val;
           int l2Val = l2 == null?0:l2.val;
           int sum = l1Val + l2Val +carry;
           carry = sum /10;
           sum = sum %10;

           if (head == null) {
               head = new ListNode(sum);
               now = head;
           }else{
               now.next = new ListNode(sum);
               now = now.next;
           }
           if(l1!=null)l1 = l1.next;
           if(l2!=null)l2 = l2.next;
        }

        return head;
    }
}
