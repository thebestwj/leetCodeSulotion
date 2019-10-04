package com.wj.leetcode.Q125;

/**
 * Created by white_wolf on 2019/10/4.
 *
 * @author thebestwj
 */
class Solution {
    public boolean isPalindrome(String s) {
        if (null == s || s.length()<0) return false;
        if (s.length()<=1) return true;
        s = s.toLowerCase();
        int j = 0;
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length();i++){
            if (isVaildChar(s.charAt(i))) {
                c[j++] = s.charAt(i);
                j++;
            }
        }
        for (int i = 0;i<j/2;i++){
         if (c[i] != c[j-i-1]) return false;
        }
        return true;
    }

    private boolean isVaildChar(char c){
        if ( (c>='0' && c<='9')|| (c>='a' && c<='z') ) return  true;
        return false;
    }
}