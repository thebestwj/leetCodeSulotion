package com.wj.leetcode.Q1_100.Q13;

/**
 * Created by white_wolf on 2020/3/27.
 *
 * @author thebestwj
 */
public class Solution {
    public int romanToInt(String s) {
        int res=0;
        if(s.contains("CM")) {
            res+=900;
            s= s.replaceFirst("CM","");
        }
        while(s.contains("M")) {
            res+=1000;
            s= s.replaceFirst("M","");
        }

        if(s.contains("CD")) {
            res+=400;
            s= s.replaceFirst("CD","");
        }
        if(s.contains("D")) {
            res+=500;
            s= s.replaceFirst("D","");
        }

        if(s.contains("XC")) {
            res+=90;
            s= s.replaceFirst("XC","");
        }
        while(s.contains("C")) {
            res+=100;
            s= s.replaceFirst("C","");
        }

        if(s.contains("XL")) {
            res+=40;
            s= s.replaceFirst("XL","");
        }
        if(s.contains("L")) {
            res+=50;
            s= s.replaceFirst("L","");
        }

        if(s.contains("IX")) {
            res+=9;
            s= s.replaceFirst("IX","");
        }
        while(s.contains("X")) {
            res+=10;
            s= s.replaceFirst("X","");
        }

        if(s.contains("IV")) {
            res+=4;
            s= s.replaceFirst("IV","");
        }
        if(s.contains("V")) {
            res+=5;
            s= s.replaceFirst("V","");
        }

        while(s.contains("I")) {
            res+=1;
            s= s.replaceFirst("I","");
        }

        return res;


    }
}
