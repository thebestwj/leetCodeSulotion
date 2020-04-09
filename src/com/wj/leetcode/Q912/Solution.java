package com.wj.leetcode.Q912;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/3/31.
 *
 * @author thebestwj
 */
public class Solution {

    public int[] sortArray(int[] nums) {    //冒泡排序 OT
        for (int i = 0; i < nums.length; i++) {
            boolean flag =false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    flag =true;
                }
            }
            if (!flag) break;
        }
        return nums;
    }


    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}