package com.wj.leetcode.Q301_400.Q344;

/**
 * Created by white_wolf on 2019/10/3.
 *
 * @author thebestwj
 */
public class SolutionB {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; ++i) {
            int j = s.length - 1 - i;
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];
        }
    }
}
