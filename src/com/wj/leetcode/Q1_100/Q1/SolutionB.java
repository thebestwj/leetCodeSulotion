package com.wj.leetcode.Q1_100.Q1;

import java.util.HashMap;

/**
 * Created by white_wolf on 2019/10/2.
 *
 * @author thebestwj
 */

//time O(n)
public class SolutionB {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 1) {
            return null;
        }
        HashMap hashMap=new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i])){
                return new int[]{(int) hashMap.get(target - nums[i]),i};
            }
            if(!hashMap.containsKey(nums[i]))hashMap.put(nums[i],i);
        }
        return null;
    }
}
