package com.wj.leetcode.Q1_100.Q33;

/**
 * Created by white_wolf on 2020/4/27.
 *
 * @author thebestwj
 */
public class Solution {  //想得太复杂了 可能太晚了吧 可以直接缩小区间
    public int search(int[] nums, int target) {
        if(nums == null || nums.length <1 ) return -1;
        int n = nums.length;
        return find(nums,0,n-1,target);
    }
    private int find(int nums[],int start,int end,int target){
        if (start > end) return -1;
        if (start==end && nums[start]!=target) return -1;
        if (target == nums[(start+end)/2]) return (start+end)/2;
        if (target>nums[(start+end)/2]){
            if(nums[(start+end)/2]<nums[end]) return Math.max(simpleFind(nums,(start+end)/2+1,end,target),find(nums,0,(start+end)/2-1,target));
            else return find(nums,(start+end)/2+1,end,target);
        }else{
            if(nums[(start+end)/2]>nums[end])
                return Math.max(simpleFind(nums,0,(start+end)/2-1,target),find(nums,(start+end)/2+1,end,target));
            else return find(nums,0,(start+end)/2-1,target);
        }
    }

    private int simpleFind(int nums[],int start,int end,int target){
        if (start > end) return -1;
        if (start==end && nums[start]!=target) return -1;
        if (target == nums[(start+end)/2]) return (start+end)/2;
        if (target>nums[(start+end)/2]){
            return simpleFind(nums,(start+end)/2+1,end,target);
        }else{
            return simpleFind(nums,start,(start+end)/2-1,target);
        }
    }
}
