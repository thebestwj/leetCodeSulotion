package com.wj.leetcode.everyday.lcof.Q14_2;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
public class Solution {
    public int cuttingRope(int n) {
        if(n <= 2) {
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int mod = (int)1e9 + 7;
        long res = 1;
        while(n > 4) {
            res *= 3;
            res %= mod;
            n -= 3;
        }
        return (int)(res * n % mod);
    }
}
