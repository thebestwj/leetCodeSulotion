package com.wj.leetcode.Q101_200.Q169;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/5/19.
 *
 * @author thebestwj
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
