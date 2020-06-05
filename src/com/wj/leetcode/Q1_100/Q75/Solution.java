package com.wj.leetcode.Q1_100.Q75;

/**
 * Created by white_wolf on 2020/6/3.
 *
 * @author thebestwj
 */
//荷兰旗问题，一次遍历
public class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length<=1 ) return;
        int left = 0;
        int right = nums.length-1;
        int i = 0;
        while (i<=right){
            if(nums[i]==0){
                swap(nums,left,i);
                left++;
                i++;
                continue; //防止越界
            }
            if(nums[i]==2){
                swap(nums,right,i);
                right--;
            }
            if(nums[i]==1) i++;
        }
        return;
    }

    void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
