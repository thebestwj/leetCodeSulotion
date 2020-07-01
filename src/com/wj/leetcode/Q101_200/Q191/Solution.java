package com.wj.leetcode.Q101_200.Q191;

/**
 * Created by white_wolf on 2020/3/21.
 *
 * @author thebestwj
 */
public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        return  Integer.bitCount(n);
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(-2));
    }
}
