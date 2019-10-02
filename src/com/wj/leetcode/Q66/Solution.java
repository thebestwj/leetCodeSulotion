package com.wj.leetcode.Q66;

/**
 * Created by white_wolf on 2019/10/2.
 *
 * @author thebestwj
 */
class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1 ; i >= 0; i--) {
            if (digits[i] == 10) {
                    digits[i] = 0;
                    if (i != 0) digits[i - 1]++;
            }else {return digits;}
        }
        int [] result = new int[digits.length + 1];
        for (int j = digits.length; j > 0; j--) {
            result[j] = digits[j - 1];
        }
        result[0] = 1;
        return result;
    }
}

