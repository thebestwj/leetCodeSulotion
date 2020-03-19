package com.wj.leetcode.Q234;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/3/19.
 *
 * @author thebestwj
 */

//space O(n) time O(n)
public class Solution {
    public boolean isPalindrome(ListNode head) {
        List store = new ArrayList<>();
        if (head==null) return true; //!!!!
        while(head.next!=null) {
            store.add(head.val);
            head = head.next;
        }
        store.add(head.val);
        int i =0;
        int j = store.size()-1;
        while(i<=j){
            if (!store.get(i).equals(store.get(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
