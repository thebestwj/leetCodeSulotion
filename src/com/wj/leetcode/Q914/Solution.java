package com.wj.leetcode.Q914;

/**
 * Created by white_wolf on 2020/3/27.
 *
 * @author thebestwj
 */
public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count=new int[10000];
        int min=-1;
        if(deck.length<=1) return false;
        for(int i:deck){
            count[i]++;
        }
        for(int i:count){
            if(i==0)continue;
            if(i<min) min = i;
        }
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0) {
                if (min == -1)
                    min = count[i];
                else
                    min = gcd(min, count[i]);
            }
        return min >= 2;
    }
    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y%x, x);
    }
}
