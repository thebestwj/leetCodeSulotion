package com.wj.leetcode.Q820;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by white_wolf on 2020/3/28.
 *
 * @author thebestwj
 */
public class Solution {
    public int minimumLengthEncoding(String[] words) {
        if(words.length<=0) return 0;
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        StringBuffer sb = new StringBuffer();
        for(String s:words){
            s = s + "#";
            if(sb.indexOf(s)<0) {
                sb.append(s);
            }
        }
        return sb.length();
    }
}
