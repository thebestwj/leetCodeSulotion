package com.wj.leetcode.Q160;

import com.wj.leetcode.util.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by white_wolf on 2020/5/20.
 *
 * @author thebestwj
 */
public class Solution {
    // space O(n)
    // time O(n)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet();
        ListNode a = headA;
        while (a != null){
            set.add(a);
            a = a.next;
        }
        ListNode b = headB;
        while (b !=null){
            if (set.contains(b)) return  b;
            b = b.next;
        }
        return null;
    }
}
