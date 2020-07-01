package com.wj.leetcode.Q301_400.Q328;

import com.wj.leetcode.util.ListNode;

/**
 * Created by white_wolf on 2020/5/19.
 *
 * @author thebestwj
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {  //感觉比题解思路更清晰点
        if (head==null) return null;
        ListNode even = head.next;
        ListNode evenHead = even;
        ListNode odd = head;
        if (even==null) return head;

        while (true) {
            odd.next = even.next;
            if (odd.next == null) {
                odd.next = evenHead;
                return head;
            }
            odd = odd.next;
            even.next = odd.next;
            if (even.next == null) {
                odd.next = evenHead;
                return head;
            }
            even = even.next;
        }

    }
}
