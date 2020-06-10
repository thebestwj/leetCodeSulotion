package com.wj.leetcode.everyday.lcof.Q16;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
//TLE
public class Solution {
    public double myPow(double x, int n) {
        double res = x;
        if(n==0) return 1;
        if(x==0) return 0;
        int cur =1;
        boolean neg = false;
        boolean min = false;
        if(n<0) {
            neg = true;
            if(n == Integer.MIN_VALUE){
                min = true;
                n = n+1;
            }
            n=-n;
        }
        while (cur*2<=n){
            res = res*res;
            cur = cur*2;
        }
        while (cur<n){
            res = res * x;
            cur++;
        }
        if (!neg) return res;
        else {
            if (min){
                return 1/res/n;
            }else{
                return 1/res;
            }
        }
    }
}
