package com.wj.leetcode.Q55;

/**
 * Created by white_wolf on 2020/4/17.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1) return true;
       return canJump(nums,nums.length-1);
    }

    boolean canJump(int[] nums,int end){
        if (end==0) return true;
        for (int i = end - 1; i>=0; i--) {
            if(nums[i]>= end - i) return canJump(nums,i);
        }
        return false;
    }
}
