package com.wj.leetcode.Q1_100.Q15;

import java.util.*;

/**
 * Created by white_wolf on 2020/5/19.
 *
 * @author thebestwj
 */
public class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {  //超时了  可以用hashmap空间换时间，但是还是慢
//        Arrays.sort(nums);
//        Set<List<Integer>> res = new HashSet<>();
//        if (nums.length<=2) return new ArrayList<>(res);
//        for (int i = 0; i < nums.length-2; i++) {
//            if (nums[i]>0) break;  //剪枝1
//            for (int j = i+1; j < nums.length ; j++) {
//                if(nums[j]+nums[i]>0) break;   //剪枝2
//                for (int k = j+1; k < nums.length; k++) {
//                    if(nums[i] + nums[j] + nums[k] >0) break; //剪枝3
//                    if(nums[i] + nums[j] + nums[k] ==0){
//                        List<Integer> list = new ArrayList<>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//                        res.add(list);
//                    }
//                }
//            }
//        }
//        return  new ArrayList<>(res);
//    }

    public List<List<Integer>> threeSum(int[] nums) {   //还是双指针好使
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        int n = nums.length;
        if (n<=2) return new ArrayList<>(res);

        for (int i = 0; i < n-2; i++) {
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum<0){
                    l++;
                    continue;
                }
                if(sum>0){
                    r--;
                    continue;
                }
                if(sum==0){
                    List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        res.add(list);
                    l++;
                }
            }

            if(nums[i]>0) return new ArrayList<>(res);
        }
        return  new ArrayList<>(res);
    }
}
