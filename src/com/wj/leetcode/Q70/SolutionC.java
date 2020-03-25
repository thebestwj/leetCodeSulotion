package com.wj.leetcode.Q70;

/**
 * Created by white_wolf on 2020/3/24.
 *
 * @author thebestwj
 */
public class SolutionC { //math
    public int climbStairs(int n) {
        double sqrt5=Math.sqrt(5);
        double fibn=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(fibn/sqrt5);
    }
}
