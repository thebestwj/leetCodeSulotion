package com.wj.leetcode.Q201_300.Q300;

/**
 * Created by white_wolf on 2020/6/27.
 *
 * @author thebestwj
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n <1) return 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        int max = 1;
        for (int i = 0; i < n; i++) {
            max = Math.max(dp[i],max);
        }
        return  max;
    }
}
