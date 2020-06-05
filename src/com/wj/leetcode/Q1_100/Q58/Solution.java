package com.wj.leetcode.Q1_100.Q58;

/**
 * Created by white_wolf on 2020/6/2.
 *
 * @author thebestwj
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim(); //题意模糊
        for (int i = s.length() - 1; i >=0 ; i--) {
            if (s.charAt(i)==' ') return count;
            else count++;
        }
        return count;
    }
}
