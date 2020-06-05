package com.wj.leetcode.Q1_100.Q39;

import java.util.*;

/**
 * Created by white_wolf on 2020/6/5.
 *
 * @author thebestwj
 */
//回溯
//这个写的有点太复杂了
public class Solution {

    Set<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] > target) break;

            int newTarget = target - candidates[i];

            List<Integer> list = new ArrayList<>();
            list.add(candidates[i]);

            if (newTarget == 0) res.add(list);
            if (newTarget > 0) {
                List<List<Integer>> temp = new ArrayList<>();
                temp.add(list);
                search(temp, candidates, i, newTarget);
            }

        }
        return new ArrayList<>(res);
    }

    void search(List<List<Integer>> medres, int[] candidates, int start, int target) {

        for (int i = start; i < candidates.length; i++) {
            int newTarget = target - candidates[i];
            if (newTarget < 0) {
                return;
            }

            List<List<Integer>> temp = new ArrayList<>();

            for (List<Integer> lists : medres) {   //deep copy
                temp.add(new ArrayList<>(lists));
            }

            for (List<Integer> l : temp) {
                l.add(candidates[i]);
            }

            if (newTarget > 0) {
                search(temp, candidates, i, newTarget);
            }

            if (newTarget == 0) {
                res.addAll(temp);
            }

        }
    }
}
