package com.wj.leetcode.Q836;

/**
 * Created by white_wolf on 2020/3/18.
 *
 * @author thebestwj
 */
public class Solution {
    //转化为区间重叠
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean x_overlap = !(rec1[2] <= rec2[0] || rec2[2] <= rec1[0]);
        boolean y_overlap = !(rec1[3] <= rec2[1] || rec2[3] <= rec1[1]);
        return x_overlap && y_overlap;
    }
// 原来思路：1.有一个点在另一个的内部，不包括边上
//          2. 一个包着另一个
    //      （未考虑一条边有重合的情况）
//    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
//        boolean case1 = (rec1[0] == rec2[0]) && (rec1[1] == rec2[1]) && (rec1[2] == rec2[2]) && (rec1[3] == rec2[3]);
//        boolean case2 = isInside(rec1,rec2[0],rec2[1]) || isInside(rec1,rec2[2],rec2[3]) || isInside(rec1,rec2[0],rec2[3]) || isInside(rec1,rec2[2],rec2[1]);
//        boolean case3 = (rec1[0] < rec2[0]) && (rec1[1] < rec2[1]) && (rec1[2] > rec2[2]) && (rec1[3] > rec2[3]);
//        return case1 || case2 || case3;
//    }
//
//    public boolean isInside(int[] rec,int x,int y){
//        return ( x > rec[0] && x < rec[2] ) && ( y > rec[1] && y < rec[3]);
//    }
}
