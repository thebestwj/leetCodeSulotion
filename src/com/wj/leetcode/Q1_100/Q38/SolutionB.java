package com.wj.leetcode.Q1_100.Q38;

/**
 * Created by white_wolf on 2019/10/11.
 *
 * @author thebestwj
 */
public class SolutionB {
    public String countAndSay(int n) {
        if (n==1) return "1";
        if (n==2) return "11";
        StringBuilder stringBuilder=new StringBuilder();
        String up = countAndSay(n-1);
        char now = up.charAt(0);
        for (int i=0;i<up.length();i++){
            int count = 0;
            while(up.charAt(i) == now){
                count ++;
                i++;
                if (i == up.length()){
                    break;
                }
            }
            stringBuilder.append(count);
            stringBuilder.append(now);
            if (i == up.length()) break;
            now = up.charAt(i);
            i--;
        }
        return stringBuilder.toString();
    }
}
