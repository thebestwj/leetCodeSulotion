package com.wj.leetcode.Q151;

import java.util.Stack;

/**
 * Created by white_wolf on 2020/4/10.
 *
 * @author thebestwj
 */
public class Solution { //双指针
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        Stack<String> stack = new Stack<>();
        int start = 0;
        int end = 0;
        while (start < s.length()) {
            while (start < s.length() && s.charAt(start) == ' ') {
                start++;
                end++;
            }
            while (end < s.length() && s.charAt(end) != ' ') {
                end++;
            }
            stack.push(s.substring(start, end));
            start = end;
        }
        while (stack.size() > 0) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(stack.pop());
        }
        return sb.toString();
    }

}
