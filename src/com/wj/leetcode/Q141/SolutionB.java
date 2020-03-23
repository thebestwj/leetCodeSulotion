package com.wj.leetcode.Q141;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by white_wolf on 2020/3/23.
 *
 * @author thebestwj
 */
public class SolutionB {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) {
                return true;
            } else {
                visited.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
