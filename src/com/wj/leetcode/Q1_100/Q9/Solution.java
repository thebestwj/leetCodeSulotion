package com.wj.leetcode.Q1_100.Q9;

/**
 * Created by white_wolf on 2020/5/31.
 *
 * @author thebestwj
 */
//可以转换成字符串比较
// 按要求不转变成字符串
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int[] digits = new int[10];
        int i = 0;
        while (x >= 10){
            digits[i] = x % 10;
            x = x / 10;
            i++;
        }
        digits[i] = x;
        int j =0;
        while (j<i){
            if (digits[j]!=digits[i]) return false;
            j++;
            i--;
        }
        return true;
    }
}
