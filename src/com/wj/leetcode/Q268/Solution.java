package com.wj.leetcode.Q268;

/**
 * Created by white_wolf on 2020/3/24.
 *
 * @author thebestwj
 */
public class Solution {
    public int missingNumber(int[] nums) {
        long count=0;
        for(int i:nums){
            count += i ;
        }
        return (int) ((1+nums.length)*nums.length/2 - count);
    }
}
