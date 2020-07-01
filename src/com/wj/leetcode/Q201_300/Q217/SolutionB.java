package com.wj.leetcode.Q201_300.Q217;

import java.util.Arrays;

public class SolutionB {
    public boolean containsDuplicate(int[] nums) {
        if ( null == nums || nums.length <= 1 ) return false;
        return Arrays.stream(nums).distinct().count() != nums.length;
    }
}
