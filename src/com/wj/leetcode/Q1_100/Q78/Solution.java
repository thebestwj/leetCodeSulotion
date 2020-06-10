package com.wj.leetcode.Q1_100.Q78;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by white_wolf on 2020/6/5.
 *
 * @author thebestwj
 */
//回溯
public class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> path = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            path.addLast(nums[i]);
            res.add(new ArrayList<>(path));
            backtrack(nums,i,path);
            path.removeLast();
        }
        res.add(new ArrayList<>());
        return res;
    }

    void backtrack(int[] nums,int start,LinkedList<Integer> path){
        for (int i = start + 1; i < nums.length ; i++) {
            path.addLast(nums[i]);
            res.add(new ArrayList<>(path));
            backtrack(nums,i,path);
            path.removeLast();
        }
    }
}
