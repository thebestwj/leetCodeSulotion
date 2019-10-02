package com.wj.leetcode.Q217;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if ( null == nums || nums.length <= 1 ) return false;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
}
