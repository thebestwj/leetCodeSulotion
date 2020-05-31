package com.wj.leetcode.Q1_100.Q9;

/**
 * Created by white_wolf on 2020/5/31.
 *
 * @author thebestwj
 */
//巧妙解法,翻转一半的位数
public class SolutionB {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
