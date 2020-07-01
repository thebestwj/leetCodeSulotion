package com.wj.leetcode.Q301_400.Q371;

/**
 * Created by white_wolf on 2020/5/19.
 *
 * @author thebestwj
 */
public class Solution {

    public int getSum(int a, int b) {  //异或相加 与进位
        int sum=0,carry=0;
        if(b==0) return a;
        sum = a^b;
        carry =(a&b)<<1;
        return getSum(sum,carry);
    }

}
