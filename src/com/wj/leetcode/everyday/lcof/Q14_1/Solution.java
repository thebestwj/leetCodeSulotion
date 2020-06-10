package com.wj.leetcode.everyday.lcof.Q14_1;

import java.util.Stack;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
public class Solution {
    public int cuttingRope(int n) {
        int[] dp= new int[n+1];
        dp[1] = 1;
        int i;
        for (i = 2; i <= n; i++) {
            for (int j = 1; j < i ; j++) {
                dp[i] = Math.max(dp[i], j*Math.max(dp[i-j],i-j));
            }
        }
        return dp[i];
    }
}
