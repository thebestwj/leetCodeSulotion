package com.wj.leetcode.Q1_100.Q69;

/**
 * Created by white_wolf on 2020/6/12.
 *
 * @author thebestwj
 */
//牛顿法
public class SolutionB {
    public int mySqrt(int x) {
        long a = x;
        while (a * a > x) {
            a = (a + x / a) / 2;
        }
        return (int) a;
    }
}
