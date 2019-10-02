package com.wj.leetcode.Q1;

/**
 * Created by white_wolf on 2019/10/2.
 *
 * @author thebestwj
 */

//time O(n^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,1};
        if (nums == null || nums.length <= 1) {
            return result;
        }
        for(int i = 0; i < nums.length; i++){
            result[0] = i;
            for (int j = i + 1; j < nums.length; j++){
                if(nums[result[0]] + nums[j] == target){
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
