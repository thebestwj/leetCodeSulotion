package com.wj.leetcode.Q155;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by white_wolf on 2020/3/23.
 *
 * @author thebestwj
 */
public class MinStack {
    List<Integer> stack = new ArrayList<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.add(x);
    }

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return stack.stream().min(Comparator.naturalOrder()).get(); //流太慢了
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
