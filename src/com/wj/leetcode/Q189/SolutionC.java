package com.wj.leetcode.Q189;

//环状替换
public class SolutionC {
    public void rotate(int[] nums, int k) {
        //TODO
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
