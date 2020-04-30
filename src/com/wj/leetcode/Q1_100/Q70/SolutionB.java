package com.wj.leetcode.Q1_100.Q70;

/**
 * Created by white_wolf on 2020/3/24.
 *
 * @author thebestwj
 */
public class SolutionB {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
