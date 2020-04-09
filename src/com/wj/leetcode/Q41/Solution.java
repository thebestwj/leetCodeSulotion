package com.wj.leetcode.Q41;

/**
 * Created by white_wolf on 2020/4/4.
 *
 * @author thebestwj
 */
//O(n^2)
public class Solution {
    public int trap(int[] height) {  //暴力
        int result=0;
        if (height.length<=0) return 0;
        int start=0,end=height.length-1;
        while(start<end) {

            while (start<height.length && height[start] == 0) {
                start++;
            }
            while (end>=0 && height[end] == 0 ) {
                end--;
            }

            if (start+1>=end)break;
            int canHold = Math.min(height[start],height[end]);
            for (int i = start; i <=end; i++) {
                if (i!=start && i != end)result += Math.max(canHold-height[i],0);
                height[i] = Math.max(height[i] - canHold,0);
            }

        }
        return result;
    }
}
