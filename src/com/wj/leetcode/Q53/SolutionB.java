package com.wj.leetcode.Q53;

/**
 * Created by white_wolf on 2020/3/25.
 *
 * @author thebestwj
 */
public class SolutionB {
    public int maxSubArray(int[] nums) {
        if (nums.length < 1) return 0;
        int seenMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0) nums[i] +=nums[i-1];
            seenMax = Math.max(nums[i], seenMax);
        }
        return seenMax;
    }
}
