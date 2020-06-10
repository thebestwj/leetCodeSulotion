package com.wj.leetcode.everyday.lcof.Q20;


/**
 * Created by white_wolf on 2020/6/10.
 *
 * @author thebestwj
 */
//正则
public class Solution {
    public boolean isNumber(String s) {
        return s.trim().matches("^[-+]?(\\d+\\.?(\\d+)?|\\.\\d+)(e[+-]?\\d+)?$");
    }
}
