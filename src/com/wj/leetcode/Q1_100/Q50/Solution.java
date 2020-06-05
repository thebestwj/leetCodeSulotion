package com.wj.leetcode.Q1_100.Q50;

/**
 * Created by white_wolf on 2020/6/2.
 *
 * @author thebestwj
 */
public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        double res = 1;
        boolean neg = false;
        boolean min = false;
        if (n == Integer.MIN_VALUE) {
            min = true;
            neg = true;
            n = Integer.MAX_VALUE;
        }
        if (n < 0) {
            neg = true;
            n = -n;
        }

        /**
         * 直接循环 OOT
         */
//        for (int i = 1; i <= n; i++) {
//            res = res * x;
//        }

        /**
         * 极端情况下也ooT
         */
//        int i = 1;
//        while (i<n){
//            if (i*2<=n){
//                res = res * res;
//                i = i * 2;
//            }else{
//                res = res * x;
//                i++;
//            }
//        }

        res = quickMul(x, n);

        if (neg) res = 1 / res;
        if (min) res = res / x;
        return res;
    }

    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

}
