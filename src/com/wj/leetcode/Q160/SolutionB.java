package com.wj.leetcode.Q160;

import com.wj.leetcode.util.ListNode;


/**
 * Created by white_wolf on 2020/5/20.
 *
 * @author thebestwj
 */
public class SolutionB {
    //a+c+b b+c+a
    //space O(1)
    //time O(n+m)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        if (a == null || b== null) return null;
        while(a!=b){
            a =  a==null? headB : a.next;
            b =  b==null? headA : b.next;
        }
        return a;
    }
}
