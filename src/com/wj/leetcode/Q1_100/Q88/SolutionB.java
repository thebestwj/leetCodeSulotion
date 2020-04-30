package com.wj.leetcode.Q1_100.Q88;

/**
 * Created by white_wolf on 2020/3/20.
 *
 * @author thebestwj
 */
//因为是有序数组
public class SolutionB {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-- + --n;
        while(n>=0) {
            nums1[i--] = m>=0 && nums1[m]>nums2[n] ? nums1[m--] : nums2[n--];  //倒叙插入
        }
    }
}
