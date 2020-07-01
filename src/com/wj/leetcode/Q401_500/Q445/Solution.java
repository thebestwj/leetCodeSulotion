package com.wj.leetcode.Q401_500.Q445;

import com.wj.leetcode.util.ListNode;

import java.util.Stack;

/**
 * Created by white_wolf on 2020/4/14.
 *
 * @author thebestwj
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        Stack<Integer> c = new Stack<>();
        while (l1 != null) {
            a.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            b.push(l2.val);
            l2 = l2.next;
        }
        int j = 0;

        while (a.size()>0 && b.size()>0){
            c.push((j+a.peek()+b.peek())%10);
            j = (j+a.pop()+b.pop())/10;
        }

        if(a.size()<=0){
            while(b.size()>0){
                c.push((j+b.peek()) %10);
                j = (j + b.pop()) /10;
            }
        }

        if(b.size()<=0){
            while(a.size()>0){
                c.push((j+a.peek()) %10);
                j = (j + a.pop()) /10;
            }
        }

        if (j==1) c.push(1);
        ListNode head,now;
        if (c.size()<=0) return new ListNode(0);
        head = new ListNode(c.pop());
        now  = head;
        while (c.size()>0){
            now.next = new ListNode(c.pop());
            now = now.next;
        }
        return head;
    }
}