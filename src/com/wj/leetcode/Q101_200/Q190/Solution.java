package com.wj.leetcode.Q101_200.Q190;

/**
 * Created by white_wolf on 2020/3/26.
 *
 * @author thebestwj
 */
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++) {
            res = res << 1 | (n >>> i & 0x00000001);
        }
        return res;
    }
}
