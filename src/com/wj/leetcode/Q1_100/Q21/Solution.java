package com.wj.leetcode.Q1_100.Q21;

/**
 * Created by white_wolf on 2020/3/19.
 *
 * @author thebestwj
 */

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultHead;
        //三种特殊情况
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) {
            resultHead = l1;
            if (l1.next == null) {
                resultHead.next = l2;
                return resultHead;
            }
            l1 = l1.next;
        } else {
            resultHead = l2;
            if (l2.next == null) {
                resultHead.next = l1;
                return resultHead;
            }
            l2 = l2.next;
        }

        ListNode resultTail = resultHead;

        while (true) {
            if (l1.val <= l2.val) {
                resultTail.next = l1;
                resultTail = l1;
                if (l1.next == null) {
                    resultTail.next = l2;
                    return resultHead;
                }
                l1 = l1.next;
            } else {
                resultTail.next = l2;
                resultTail = l2;
                if (l2.next == null) {
                    resultTail.next = l1;
                    return resultHead;
                }
                l2 = l2.next;
            }

        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}