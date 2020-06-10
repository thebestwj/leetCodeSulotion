package com.wj.leetcode.everyday.lcof;

import java.util.Stack;

/**
 * Created by white_wolf on 2020/6/9.
 *
 * @author thebestwj
 */
//https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
public class CQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public CQueue() {

    }

    //O(1)
    public void appendTail(int value) {
        s1.push(value);
    }

    //worst O(n)
    public int deleteHead() {
        if(!s2.isEmpty()) return s2.pop();
        if(s1.isEmpty()) return -1;
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}
