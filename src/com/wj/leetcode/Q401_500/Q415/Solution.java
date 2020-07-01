package com.wj.leetcode.Q401_500.Q415;

/**
 * Created by white_wolf on 2020/6/7.
 *
 * @author thebestwj
 */
public class Solution {

    public String addStrings(String num1, String num2) {
        if(num1==null || num2==null || num1.length()<1 || num2.length()<1) return "0";
        if("0".equals(num1)) return num2;
        if("0".equals(num2)) return num1;
        int n1 = num1.length();
        int n2 = num2.length();
        int c1 = n1 - 1;
        int c2 = n2 - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (c1 >= 0 || c2 >= 0) {
            int d1 = c1 >= 0 ? num1.charAt(c1) - '0' : 0;
            int d2 = c2 >= 0 ? num2.charAt(c2) - '0' : 0;
            int sum = d1 + d2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            sb.append(sum);
            if (c1 >= 0) c1--;
            if (c2 >= 0) c2--;
        }
        if (carry == 1) sb.append(1);
        return sb.reverse().toString();
    }
}
