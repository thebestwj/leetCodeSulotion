package com.wj.leetcode.Q633;

/**
 * Created by white_wolf on 2020/4/7.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean judgeSquareSum(int c) {   //考虑0
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b)
                return true;
        }
        return false;
    }
}
