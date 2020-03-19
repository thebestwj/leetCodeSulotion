package com.wj.leetcode.Q409;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by white_wolf on 2020/3/19.
 *
 * @author thebestwj
 */
public class Solution {
    public int longestPalindrome(String s) {
        int[] map = new int[26 + 26 + 6];  //A-Z [ \ ] ^_`  a-z 中间不相邻
        for (char i : s.toCharArray()) {
            map[i - 'A']++;
        }
        int counter = 0;
        for (int i : map) {
            counter = counter + i / 2;
        }
        return s.length()>counter*2?counter*2+1:counter*2;
    }
}
