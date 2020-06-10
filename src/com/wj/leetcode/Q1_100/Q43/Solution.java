package com.wj.leetcode.Q1_100.Q43;

/**
 * Created by white_wolf on 2020/6/7.
 *
 * @author thebestwj
 */
//普通竖式
public class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null || num1.length() < 1 || num2.length() < 1) return "0";
        if ("0".equals(num1) || "0".equals(num2)) return "0";  //坑
        String res = "0";
        String[] mem = new String[10];
        for (int i = 0; i <= 9; i++) {
            String s = "0";
            for (int j = 0; j < i; j++) {
                s = add(num2, s);
            }
            mem[i] = s;
        }
        for (int i = num1.length() - 1; i >= 0; i--) {
            int d = num1.charAt(i) - '0';
            String s = mem[d];
            for (int j = 0; j < num1.length() - 1 - i; j++) {
                s = s + "0";
            }
            res = add(res, s);
            System.out.println(res);
        }
        return res;
    }

    public String add(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int c1 = n1 - 1;
        int c2 = n2 - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (c1 >= 0 || c2 >= 0) {
            int d1 = c1 >= 0 ? s1.charAt(c1) - '0' : 0;
            int d2 = c2 >= 0 ? s2.charAt(c2) - '0' : 0;
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
