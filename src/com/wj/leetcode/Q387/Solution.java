package com.wj.leetcode.Q387;

/**
 * Created by white_wolf on 2019/10/4.
 *
 * @author thebestwj
 */
class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0;i < s.length();i++) {
            if(s.lastIndexOf(s.charAt(i))==i && s.indexOf(s.charAt(i))==i){
                return i;
            }
        }
        return -1;
    }
}