package com.wj.leetcode.Q1_100.Q69;

/**
 * Created by white_wolf on 2020/6/12.
 *
 * @author thebestwj
 */
//二分法
public class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int start = 0,end = x;
        while(end-start>1){
            int mid = (start+end)/2;
            if(x/mid<mid){
                end = mid;
            }else{
                start = mid;
            }
        }
        return start;
    }
}
