package com.wj.leetcode.Q7;

/**
 * Created by white_wolf on 2019/10/3.
 *
 * @author thebestwj
 */
class Solution {
    public int reverse(int x) {
        long result = 0;
        boolean neg = false;
        if( x < 0) {
            neg = true;
            x = - x ;
        }
        while (x / 10 > 0) {
            result = result * 10 + (x % 10);
            x = x / 10;
        }
        result = result * 10 + x;
        if (neg){
            result = - result;
        }
        if (result <= Integer.MAX_VALUE && result >= - Integer.MAX_VALUE - 1) {
            return (int) result;
        }else{
            return 0;
        }
    }
}