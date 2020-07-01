package com.wj.leetcode.Q101_200.Q139;

import java.util.List;

/**
 * Created by white_wolf on 2020/6/25.
 *
 * @author thebestwj
 */
//TLE
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length()<0) return true;
        if(wordDict.size()<1) return false;
        if(wordDict.contains(s)) return true;
        for(int i = s.length()-1;i>0;i--){
            if (wordDict.contains(s.substring(0,i))){
                boolean res = wordBreak(s.substring(i),wordDict);
                if(res) return true;
            }
        }
        return false;
    }
}

/*
 "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"
 ["a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"]
 **/