package com.wj.leetcode.Q836;

/**
 * Created by white_wolf on 2020/3/18.
 *
 * @author thebestwj
 */
public class SolutionB {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] ||   // left
                rec1[3] <= rec2[1] ||   // bottom
                rec1[0] >= rec2[2] ||   // right
                rec1[1] >= rec2[3]);    // top
    }
}
