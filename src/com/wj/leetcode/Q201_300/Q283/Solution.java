package com.wj.leetcode.Q201_300.Q283;

/**
 * Created by white_wolf on 2019/10/2.
 *
 * @author thebestwj
 */

//time O(n^2)
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return;
        }
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] == 0){
                for (int j = i;j < nums.length - 1; j++){
                    if(nums[j + 1] == 0) break;
                    swap(nums,j,j+1);
                }
            }
        }
    }

    private void swap(int[] nums,int firstIndex,int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}