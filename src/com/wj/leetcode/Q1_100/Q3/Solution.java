package com.wj.leetcode.Q1_100.Q3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by white_wolf on 2020/5/2.
 *
 * @author thebestwj
 */
public class Solution { //滑动窗口 我的思路是对的，但是没处理好细节，time可以优化  注意审题
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
