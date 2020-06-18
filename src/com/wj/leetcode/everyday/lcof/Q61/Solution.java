package com.wj.leetcode.everyday.lcof.Q61;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/6/12.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int joker=0;
        for(int i = 0; i < 4; i++) {
            if(nums[i] == 0) joker++; // 统计大小王数量
            else if(nums[i] == nums[i + 1]) return false; // 若有重复，提前返回 false
        }
        return nums[4]-nums[joker]<5;
    }
}
