package com.wj.leetcode.Q1_100.Q33;

/**
 * Created by white_wolf on 2020/4/27.
 *
 * @author thebestwj
 */
public class SolutionB {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length <1 ) return -1;
        int n = nums.length;
        return find(nums,0,n-1,target);
    }
    private int find(int nums[],int start,int end,int target){
        if (start > end) return -1;
        if (start==end && nums[start]!=target) return -1;
        int mid = (start+end)/2;
        if (target == nums[mid]) return mid;
        if (nums[mid]>nums[start]){
            if(target<nums[mid] && target>=nums[start]) return find(nums,start,mid-1,target);
            else return find(nums,mid+1,end,target);
        }else{
            if(target>nums[mid] && target<= nums[end])
                return find(nums,mid+1,end,target);
            else return find(nums,start,mid-1,target);
        }
    }
}
