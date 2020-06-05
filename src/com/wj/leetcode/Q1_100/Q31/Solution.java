package com.wj.leetcode.Q1_100.Q31;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/6/5.
 *
 * @author thebestwj
 */
//要求原地 常数空间
//这种题一开始的数学分析比较重要，分析的对了代码就好写
//一开始的思路是对的，从后向前判断是否升序，直到遇到第一个比前一个数小的数，
//将该数与之前子序列中比他大的最小的数交换，升序排序该子序列
// 若整个序列降序则直接升序排序整个序列
//注意两个小bug点，边界条件
public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<=1) return;
        int before = nums[nums.length - 1];
        for (int i = nums.length-2; i >= 0 ; i--) {
            if(nums[i]>=before) {  //此处为>=
                before = nums[i];
                continue;
            }else{
                int j = nums.length-1;
                while (nums[j]<=nums[i] && j>0) j--; //此处为>0
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                Arrays.sort(nums,i+1,nums.length);
                return;
            }
        }
        Arrays.sort(nums);
        return;
    }
}
