package com.wj.leetcode.Q237;

/**
 * Created by white_wolf on 2020/3/16.
 *
 * @author thebestwj
 */

//Definition for singly-linked list.

public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        return;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
