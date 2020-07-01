package com.wj.leetcode.Q101_200.Q118;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/3/26.
 *
 * @author thebestwj
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows >= 1) {
            List<Integer> l = new ArrayList<>();
            l.add(1);
            res.add(l);
        }
        for (int i = 2; i <= numRows; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for (int j = 2; j <= i - 1; j++) {
                l.add(res.get(i - 2).get(j - 2) + res.get(i - 2).get(j - 1));
            }
            l.add(1);
            res.add(l);
        }
        return res;
    }
}
