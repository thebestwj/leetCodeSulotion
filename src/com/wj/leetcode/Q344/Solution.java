package com.wj.leetcode.Q344;

/**
 * Created by white_wolf on 2019/10/3.
 *
 * @author thebestwj
 */
class Solution {
    public void reverseString(char[] s) {
        for (int i = 0;i < s.length / 2; i++ ){
            swap(s,i,s.length- 1-i);
        }
    }

    private void swap(char[]a,int x,int y){
        char temp=a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}