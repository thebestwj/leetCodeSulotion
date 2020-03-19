package com.wj.leetcode.Q326;

/**
 * Created by white_wolf on 2020/3/17.
 *
 * @author thebestwj
 */
public class Solution {
    public static boolean isPowerOfThree(int n) {   //不使用循环和递归
        double result = Math.log(n) / Math.log(3);  //换底公式
        return Math.abs(Math.round(result)-result)<=1E-14; //该值试出来
    }
}
