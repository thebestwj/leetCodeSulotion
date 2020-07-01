package com.wj.leetcode.Q301_400.Q387;

/**
 * Created by white_wolf on 2019/10/4.
 *
 * @author thebestwj
 */
// assume contain only lowercase letter
// time O(2n)
public class SolutionB {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
