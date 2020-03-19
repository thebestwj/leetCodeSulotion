package com.wj.leetcode.Q1160;

/**
 * Created by white_wolf on 2020/3/17.
 *
 * @author thebestwj
 */
public class Solution {
    public int countCharacters(String[] words, String chars) {
        if (words.length<=0 || chars.length()<=0) return 0;
        int[] charCount=new int[26];
        int result=0;
        int[] wordCount=new int[26];
        for(char ichar:chars.toCharArray()){
            charCount[ichar-'a']++;
        }
        for(String word:words){
            for(char ichar:word.toCharArray()){
                wordCount[ichar-'a']++;
            }
            boolean flag = true;
            for (int i=0;i<charCount.length;i++){
                if (wordCount[i]>charCount[i]) flag=false;
                wordCount[i] = 0;
            }
            if(flag) result+=word.length();
        }
        return result;
    }
}
