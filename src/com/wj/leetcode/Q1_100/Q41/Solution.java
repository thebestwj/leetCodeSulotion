package com.wj.leetcode.Q1_100.Q41;

/**
 * Created by white_wolf on 2020/6/27.
 *
 * @author thebestwj
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            while (0 < nums[i] && nums[i] <= n && nums[i] != i+1 &&  nums[i] != nums[nums[i]-1]) {
                swap(nums, i, nums[i]-1);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!= i+1)
                return i+1;
        }
        return n+1;
    }

    void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
//原地哈希
