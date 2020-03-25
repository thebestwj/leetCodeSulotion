package com.wj.leetcode.Q70;

/**
 * Created by white_wolf on 2020/3/24.
 *
 * @author thebestwj
 */
public class Solution {
    public int climbStairs(int n) {  //动态规划
        int[] history = new int[n+1];
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        history[0] = 0;
        history[1] = 1;
        history[2] = 2;
        for (int i = 3; i <= n; i++) {
            history[i] = history[i-1]+ history[i-2];
        }
        return history[n];
    }
}
