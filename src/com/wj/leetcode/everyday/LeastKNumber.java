package com.wj.leetcode.everyday;

import java.util.Arrays;

/**
 * Created by white_wolf on 2020/3/20.
 *
 * @author thebestwj
 */
public class LeastKNumber {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr); //可以用快速排序
        return Arrays.copyOfRange(arr,0,k);
    }
}
