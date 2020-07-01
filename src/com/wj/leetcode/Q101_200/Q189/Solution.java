package com.wj.leetcode.Q101_200.Q189;

class Solution {
    /*
    Time:O(kn)
    Space:O(1)
     */
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        for(int i = 1;i <= k; i++ ){
            int last = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j-- ){
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }
}