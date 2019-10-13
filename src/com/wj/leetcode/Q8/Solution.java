package com.wj.leetcode.Q8;

/**
 * Created by white_wolf on 2019/10/4.
 *
 * @author thebestwj
 */
class Solution {
    public int myAtoi(String str) {
        boolean negitive = false;
        if (null == str) return 0;
        str = str.trim();
        if(str.length()<1) return 0;
        if (str.charAt(0)>'9' ||  str.charAt(0)<'0'){
            if(!(str.charAt(0)=='-'|| str.charAt(0)=='+')) return 0;
            if(str.charAt(0)=='-') negitive = true;
            str = str.substring(1);
            if (null == str || str.length()<1) return 0;
        }
        long result = 0;
        for (int i = 0;i<str.length();i++){
            if(str.charAt(i) < '0' || str.charAt(i)>'9') break;
            result = result * 10 + (int)(str.charAt(i) - '0');
            if (result>Integer.MAX_VALUE ) {
                if (negitive) return Integer.MIN_VALUE;
                else return Integer.MAX_VALUE;
            }
        }
        if (negitive) result = -result;
        if (result<Integer.MIN_VALUE ) return Integer.MIN_VALUE;
        return (int) result;
    }
}