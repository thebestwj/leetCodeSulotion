package com.wj.leetcode.Q1_100.Q76;

/**
 * Created by white_wolf on 2020/6/25.
 *
 * @author thebestwj
 */
public class Solution {
    public String minWindow(String s, String t) {
        int[] fre = new int[64];
        int[] now = new int[64];
        if (s.length() < t.length()) return "";
        for(char c:t.toCharArray()){  //1. 统计频率
            fre[c-'A']++;
        }
        int ansl = -1;
        int ansr = s.length();
        int l = 0;
        int r = -1; // 注意这样才会统计到第一个字符

        while (l <= s.length() - t.length()) {
            if (r - l + 1 < t.length()) {   //2. 小于pattern长度直接扩右边
                if (r + 1 < s.length()) {      // 这里注意到数组越界
                    now[s.charAt(++r) - 'A']++;
                    continue;
                }
                else break;
            }
            int i =0;
            while (i < 64) {  //3. 判断是否满足条件
                if (now[i] < fre[i]) break;
                i++;
            }
            if(i==64){  //4. 满足条件
                if (r - l + 1 == t.length()) return s.substring(l,r+1);
                else{
                    if(r - l < ansr-ansl){
                        ansl = l;
                        ansr = r;
                    }
                    now[s.charAt(l++) - 'A']--;  // 5. 缩小左边
                }
            }else{  //6. 不满足条件
                if (r + 1 < s.length()) now[s.charAt(++r) - 'A']++; // 7. 扩右边
                else break;//now[s.charAt(l++) - 'A']--;  //8. 剪枝
            }

        }
        return ansl==-1? "":s.substring(ansl,ansr+1);
    }
}
