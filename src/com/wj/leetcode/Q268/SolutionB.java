package com.wj.leetcode.Q268;

/**
 * Created by white_wolf on 2020/3/24.
 *
 * @author thebestwj
 */
public class SolutionB { //位运算
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
