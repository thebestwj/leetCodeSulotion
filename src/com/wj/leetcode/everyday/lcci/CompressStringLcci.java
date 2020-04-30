package com.wj.leetcode.everyday.lcci;

/**
 * Created by white_wolf on 2020/3/16.
 *
 * @author thebestwj
 */
public class CompressStringLcci {

    public static void main(String[] args) {
        System.out.println(compressString("aaaabbbbdddvvffdeffgg"));
    }

    public static String compressString(String S) {  //Passed
        if(S.length()<=2) return S;
        char previousChar = S.charAt(0);
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for(char i: S.toCharArray()){
            if (i==previousChar) count++;
            else{
                sb.append(previousChar);
                sb.append(count);
                count =1;
                previousChar = i;
            }
        }
        sb.append(previousChar);
        sb.append(count);
        if (sb.length()<S.length() )return sb.toString(); else return S ;
    }
}
