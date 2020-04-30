package com.wj.leetcode.Q1_100.Q23;

import com.wj.leetcode.util.ListNode;

/**
 * Created by white_wolf on 2020/4/26.
 *
 * @author thebestwj
 */
public class Solution {  //O(KN) ，可以使用小根堆对 1 进行优化，每次 O(logK)O(logK) 比较 K个指针求 min
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<0) return null;
        if(lists.length==1) return lists[0];
        int alive = lists.length;
        ListNode head = new ListNode(0);
        ListNode now = head;
        while(alive>0){
            int min = Integer.MAX_VALUE;
            int minIndex = -1 ;
            for(int i =0;i<lists.length;i++){
                if (lists[i] == null) continue;
                if (lists[i].val<min){
                    min = lists[i].val;
                    minIndex = i;
                }
            }
            if (minIndex == -1) return  head.next; //坑 输入[[],[]]  这样的话其实没必要alive计数了
            now.next = new ListNode(lists[minIndex].val);
            now = now.next;
            lists[minIndex] = lists[minIndex].next;
            if (lists[minIndex] == null) alive--;
        }
        return head.next;
    }
}
