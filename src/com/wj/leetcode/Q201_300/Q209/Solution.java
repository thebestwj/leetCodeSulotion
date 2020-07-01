package com.wj.leetcode.Q201_300.Q209;

/**
 * Created by white_wolf on 2020/7/1.
 *
 * @author thebestwj
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if(n<1) return 0;
        if(s<=0) return 0;
        int l = 0,r=0;
        int sum = nums[l];
        int min = Integer.MAX_VALUE;
        while(r<n){
            if(sum>=s){
                if(l==r) return 1;
                min = Math.min(min,r-l+1);
                sum-=nums[l++];
            }else{
                if(r<n-1)sum+=nums[++r];
                else break;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
//双指针
