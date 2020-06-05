package com.wj.leetcode.Q1_100.Q67;

/**
 * Created by white_wolf on 2020/6/2.
 *
 * @author thebestwj
 */
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int da = i>=0 ? a.charAt(i)-'0':0;
            int db = j>=0 ? b.charAt(j)-'0':0;
            int d = (da + db + carry) / 2;
            carry = (da + db + carry) % 2;
            sb.append(d);
            i--;
            j--;
        }
        if(carry==1) sb.append("1");
        return sb.reverse().toString();
    }
}
