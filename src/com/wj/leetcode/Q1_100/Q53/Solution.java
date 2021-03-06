package com.wj.leetcode.Q1_100.Q53;

/**
 * Created by white_wolf on 2020/3/25.
 *
 * @author thebestwj
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length < 1) return 0;
        int seenMax = nums[0];
        int counter = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > counter && counter < 0) {
                counter = nums[i];
            } else {
                counter += nums[i];
            }
            seenMax = Math.max(counter, seenMax);
        }
        return seenMax;
    }
}
