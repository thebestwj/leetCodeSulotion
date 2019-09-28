package com.wj.leetcode.Q26;

public class SolutionB {
    public int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0 ) return 0;
        int j = 0;
        for (int i = 1 ; i < nums.length ; i++){
            if (nums[j] != nums[i] ){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j + 1;
    }
}
