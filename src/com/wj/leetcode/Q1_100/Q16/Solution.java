package com.wj.leetcode.Q1_100.Q16;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/5/31.
 *
 * @author thebestwj
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) return 0;
        Arrays.sort(nums);
        int i = 0;
        while (nums[i]<target){
            i++;
        }
        if(i==nums.length) return 0;
        return 0;
        //todo
    }
}
