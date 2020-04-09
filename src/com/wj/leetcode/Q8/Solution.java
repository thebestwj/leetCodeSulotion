package com.wj.leetcode.Q8;

/**
 * Created by white_wolf on 2019/10/4.
 *
 * @author thebestwj
 */
class Solution {
    public int myAtoi(String str) {
        if (null == str) return 0;
        str = str.trim();
        if (str.length()<1) return 0;
        boolean negative = false;
        int i = 0;
        int result=0;
        int limit = Integer.MAX_VALUE;
        int digit = 0;
        if (str.charAt(0)=='-'){
            negative = true;
            i=1;
        }
        if (str.charAt(0)=='+'){
            i=1;
        }
        while( i< str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
            digit = Character.digit(str.charAt(i),10);
            if((limit /10)>= result){
                result = result*10;
            }else{
                return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            if(limit-digit>=result){
                result += digit;
            }else{
                return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            i++;
        }
        return negative?-result:result;
    }
}