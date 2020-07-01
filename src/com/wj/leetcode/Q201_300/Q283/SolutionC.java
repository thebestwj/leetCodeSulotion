package com.wj.leetcode.Q201_300.Q283;

/**
 * Created by white_wolf on 2019/10/2.
 *
 * @author thebestwj
 */
//time O(n)
//space O(1)
public class SolutionC {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
