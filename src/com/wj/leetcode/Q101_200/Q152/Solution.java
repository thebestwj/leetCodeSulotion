package com.wj.leetcode.Q101_200.Q152;

/**
 * Created by white_wolf on 2020/6/25.
 *
 * @author thebestwj
 */

/**
 * 一开始想得太复杂，直接正着乘一遍反着乘一遍完事
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int a=1;
        int max=nums[0];

        for(int num:nums){
            a=a*num;
            if(max<a)max=a;
            if(num==0)a=1;

        }
        a=1;
        for(int i=nums.length-1;i>=0;i--){
            a=a*nums[i];
            if(max<a)max=a;
            if(nums[i]==0)a=1;
        }
        return max;
    }
}
