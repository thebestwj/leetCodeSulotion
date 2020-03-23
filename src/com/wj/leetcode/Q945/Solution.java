package com.wj.leetcode.Q945;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/3/22.
 *
 * @author thebestwj
 */
public class Solution {
    public int minIncrementForUnique(int[] A) {
        if (A.length <= 1) return 0;
        Arrays.sort(A);
        long counter = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i-1]) {
                counter = counter + A[i-1] + 1 - A[i];
                A[i] = A[i-1] + 1;
            }
        }
        return (int) counter;
    }
}
