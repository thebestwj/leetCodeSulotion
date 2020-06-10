package com.wj.leetcode.everyday.lcof.Q5;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
//要怀疑输入可能不安全
public class Solution {
    public String replaceSpace(String s) {
        if(s == null || s.length() == 0) return s;
        return s.replaceAll(" ", "%20");
    }
}
