package com.wj.leetcode.Q20;

import java.util.Stack;

/**
 * Created by white_wolf on 2020/3/26.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean isValid(String s) {  //O(n)最快 俩陷阱
        Stack<Character> save=new Stack<>();
        for(char i:s.toCharArray()) {
            if (i == '{' || i == '(' || i == '[') {
                save.push(i);
                continue;
            }
            if (save.size()==0) return false;  //陷阱1
            if (i == ')' && !save.pop().equals('(')) return false;
            if (i == '}' && !save.pop().equals('{')) return false;
            if (i == ']' && !save.pop().equals('[')) return false;
        }
        return save.size()==0; //陷阱2
    }
}
