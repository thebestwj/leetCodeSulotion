package com.wj.leetcode.Q1_100.Q6;

/**
 * Created by white_wolf on 2020/5/31.
 *
 * @author thebestwj
 */
//暴力但简单的方法
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i * (numRows - 1) < chars.length; i += 2) {
            stringBuilder.append(chars[i * (numRows - 1)]);
        }

        for (int i = 1; i < numRows - 1; i++) {

            for (int j = 0; j * (numRows - 1) + i < chars.length; j += 2) {
                stringBuilder.append(chars[j * (numRows - 1) + i]);
                if ((j + 2) * (numRows - 1) - i < chars.length)
                    stringBuilder.append(chars[(j + 2) * (numRows - 1) - i]);
            }
        }

        for (int i = 1; i * (numRows - 1) < chars.length; i += 2) {
            stringBuilder.append(chars[i * (numRows - 1)]);
        }

        return stringBuilder.toString();
    }
}
