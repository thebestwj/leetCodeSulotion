package com.wj.leetcode.Q365;

/**
 * Created by white_wolf on 2020/3/21.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) return false;
        if (x == 0 || y == 0) return (z == 0) || (x + y == z);
        return (z % gcd(x, y) == 0);
    }

    static int gcd(int x, int y) {
        if (y == 0) return x;
        int r = x % y;
        return gcd(y, r);
    }

}
