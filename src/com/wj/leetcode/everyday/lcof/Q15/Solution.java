package com.wj.leetcode.everyday.lcof.Q15;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
public class Solution {
    public int hammingWeight(int n) {
        // 每两位一组，计算几个1  01 或 10
        n = n - ((n >>> 1) & 0x55555555);
        // 0011 把相邻两组加起来，计算每四位有几个一 0-4 最大为0100
        n = (n & 0x33333333) + ((n >>> 2) & 0x33333333);
        // 计算每8位有几个1，最大 1000
        n = (n + (n >>> 4)) & 0x0f0f0f0f;
        n = n + (n >>> 8);
        n = n + (n >>> 16);
        //最多32
        return n & 0x3f;
    }
}
