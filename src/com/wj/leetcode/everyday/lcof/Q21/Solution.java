package com.wj.leetcode.everyday.lcof.Q21;

/**
 * Created by white_wolf on 2020/6/10.
 *
 * @author thebestwj
 */
//space O(1) time O(n) in place
public class Solution {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length < 2) return nums;
        int n = nums.length;
        int a = 0;
        int b = n-1;
        while(true){
            while (a<b && nums[a]%2==1) a++;
            while (a<b && nums[b]%2==0) b--;
            if(a>=b) break;
            swap(nums,a,b);
        }
        return nums;
    }

    void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
