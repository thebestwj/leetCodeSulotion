package com.wj.leetcode.Q14;

/**
 * Created by white_wolf on 2019/10/13.
 *
 * @author thebestwj
 */
public class SolutionB {
    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length< 1 || strs[0].length() < 1) return "";
        if (strs.length == 1) return strs[0];

        for(int j = 0 ; j < strs[0].length() ;j++) {
            for (int i = 1; i < strs.length; i++) {
                if(strs[i].indexOf(strs[0].substring(0,j+1)) != 0 ) return strs[0].substring(0,j);
            }
        }

        return strs[0];
    }
}
