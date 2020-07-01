package com.wj.leetcode.Q101_200.Q142;

import com.wj.leetcode.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by white_wolf on 2020/6/28.
 *
 * @author thebestwj
 */
//space O(n)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        if(a==null) return null;
        while(a.next!=null && null!=b.next && null!=b.next.next){  //要注意 因为 b.next.next 要确保 null!=b.next
            // 其实 a.next!=null 可以不加 因为 b 一定比 a 快
            a = a.next;
            b = b.next.next;
            if(a==b) {
                Set<ListNode> his = new HashSet<>();
                his.add(a);
                while(!his.contains(a.next)){
                    a = a.next;
                    his.add(a);
                }
                b = head;
                while(!his.contains(b)) b=b.next;
                return b;
            }
        }
        return null;
    }
}
