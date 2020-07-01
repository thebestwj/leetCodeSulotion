package com.wj.leetcode.Q101_200.Q136;

/**
 * Created by white_wolf on 2019/10/1.
 * @author thebestwj
 */
class Solution {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length == 1) return ans;
        for (int i = 1; i < nums.length; i++) {
            ans = nums[i] ^ ans;
        }
        return ans;
    }
}