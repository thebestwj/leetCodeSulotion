package com.wj.leetcode.everyday.lcof.Q66;

/**
 * Created by white_wolf on 2020/6/12.
 *
 * @author thebestwj
 */
//对称遍历
public class Solution {
    public int[] constructArr(int[] a) {
        int n = a. length;
        int[] b = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            b[i] = product;
            product *=a[i];
        }
        product = 1;
        for(int i = n-1 ;i >= 0;i--)
        {
            b[i]=b[i]*product;
            product*=a[i];
        }
        return b;
    }
}
