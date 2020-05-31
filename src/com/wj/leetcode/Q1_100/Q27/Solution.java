package com.wj.leetcode.Q1_100.Q27;

/**
 * Created by white_wolf on 2020/5/31.
 *
 * @author thebestwj
 */
public class Solution { //想到了最优解法
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int i =0;
        while (i < nums.length-count) {
            if(nums[i] == val){
                nums[i] = nums[nums.length-count-1];
                count++;
            }else {
                i++;
            }
        }
        return nums.length-count;
    }
}
