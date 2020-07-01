package com.wj.leetcode.Q201_300.Q217;

import java.util.HashSet;
import java.util.Set;

public class SolutionC {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }
}
