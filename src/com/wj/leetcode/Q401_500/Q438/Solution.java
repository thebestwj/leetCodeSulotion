package com.wj.leetcode.Q401_500.Q438;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white_wolf on 2020/6/28.
 *
 * @author thebestwj
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(p.length()<1 || s.length()<1 || p.length()>s.length()) return res;
        int l = 0; int r = p.length()-1;
        int[] fre = new int[26],right = new int[26];
        for (int i = 0; i < p.length(); i++) {
            fre[s.charAt(i)-'a']++;
            right[p.charAt(i)-'a']++;
        }
        fre[s.charAt(r)-'a']--;
        while (r<s.length()){
            fre[s.charAt(r)-'a']++;
            int i = 0;
            for (; i < 26; i++) {
                if(fre[i]!=right[i]) break;
            }
            if(i==26) res.add(l);
            fre[s.charAt(l++)-'a']--;
            r++;
        }
        return  res;
    }
}
//滑动窗口，没什么说的
