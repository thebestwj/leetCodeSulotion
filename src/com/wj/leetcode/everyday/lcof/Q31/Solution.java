package com.wj.leetcode.everyday.lcof.Q31;

import java.util.Stack;

/**
 * Created by white_wolf on 2020/6/10.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n1 = pushed.length;
        int n2 = popped.length;
        if(n1<3) return true;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int element:pushed){
            stack.push(element);
            while (!stack.isEmpty() && stack.peek() == popped[i] && i<n2){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
