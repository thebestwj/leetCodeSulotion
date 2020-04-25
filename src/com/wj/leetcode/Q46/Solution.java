package com.wj.leetcode.Q46;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/4/25.
 *
 * @author thebestwj
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length<1) return res;
        List<Integer> start = new ArrayList<>();
        start.add(nums[0]);
        res.add(start);
        for (int i = 1; i < nums.length; i++) {
            res = helper(res,nums[i]);
        }
        return res;
    }

    List<List<Integer>> helper(List<List<Integer>> list ,int i){
        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> item:list) {
            for (int j = 0; j <= item.size(); j++) {
                List<Integer> temp = new ArrayList<>(item);
                temp.add(j,i);
                res.add(temp);
            }
        }
        return res;
    }
}
