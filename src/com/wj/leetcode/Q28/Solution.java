package com.wj.leetcode.Q28;

/**
 * Created by white_wolf on 2019/10/13.
 *
 * @author thebestwj
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() < 1) return 0;
        if (needle.length()>haystack.length()) return -1;

        if (needle.length() == 1){
            for (int i = 0 ;i < haystack.length();i++){
                if(haystack.charAt(i) == needle.charAt(0)) return i;
            }
            return -1;
        }

        for (int i = 0 ;i < haystack.length() - needle.length() + 1;i++){
            if (haystack.charAt(i) != needle.charAt(0)) continue;
            boolean flag = true;
            for (int j = 0;j< needle.length();j++){
                if (haystack.charAt(i + j) == needle.charAt(j)) continue;
                flag = false;
            }
            if (flag) return i;
        }

        return -1;
    }
}