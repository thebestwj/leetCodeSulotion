package com.wj.leetcode.Q201_300.Q242;

import java.util.ArrayList;

/**
 * Created by white_wolf on 2019/10/4.
 *
 * @author thebestwj
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        ArrayList arrayList=new ArrayList();
        for(int i = 0 ;i < s.length();i++){
            arrayList.add(s.charAt(i));
        }
        for(int i = 0 ;i < s.length();i++){
            if(arrayList.contains(t.charAt(i))){
                arrayList.remove((Object) t.charAt(i));
            }
            else return false;
        }
        return true;
    }
}