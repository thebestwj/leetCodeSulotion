package com.wj.leetcode.Q1_100.Q26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0,j = nums.length;
        while ( i < j - 1 ){
            if(nums[i]==nums[i+1]){
                for(int k = i ;k < j - 1; k++){
                    nums[k] = nums[k+1];
                }
                j = j - 1;
            }else{
                i++;
            }
        }
        return j;
    }
}
