package com.wj.leetcode.Q461;

/**
 * Created by white_wolf on 2020/3/16.
 *
 * @author thebestwj
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        return Integer.bitCount(z);
    }
}
