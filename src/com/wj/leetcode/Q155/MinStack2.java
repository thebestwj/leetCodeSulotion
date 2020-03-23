package com.wj.leetcode.Q155;

import java.util.Stack;

/**
 * Created by white_wolf on 2020/3/23.
 *
 * @author thebestwj
 */
public class MinStack2 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    /** initialize your data structure here. */
    public MinStack2() {

    }

    public void push(int x) {
        stack.push(x);
        min.push(min.isEmpty() ? x : x < min.peek() ? x : min.peek());  //状态可定
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
