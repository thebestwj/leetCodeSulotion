package com.wj.leetcode.Q14;

/**
 * Created by white_wolf on 2019/10/13.
 *
 * @author thebestwj
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length< 1 ) return "";
        StringBuffer stringBuffer = new StringBuffer("");
            for(int j = 0 ; j <strs[0].length() ;j++) {
                for (int i = 1; i < strs.length; i++) {
                    if (j >= strs[i].length()) return stringBuffer.toString();
                    if (strs[i].charAt(j) != strs[0].charAt(j)) {
                        return stringBuffer.toString();
                    } else continue;

                }
                stringBuffer.append((char) strs[0].charAt(j));
            }
            return stringBuffer.toString();

    }
}