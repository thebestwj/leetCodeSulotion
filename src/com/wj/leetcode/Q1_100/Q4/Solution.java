package com.wj.leetcode.Q1_100.Q4;

/**
 * Created by white_wolf on 2020/3/27.
 *
 * @author thebestwj
 */
//O(min(m,n)/2)
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int max = Math.max(nums1.length, nums2.length);
        int min = Math.min(nums1.length, nums2.length);
        int mid = (max - min) / 2 + min;
        int last = 0;
        int j1 = 0, j2 = 0;

        for (int i = 0; i < mid; i++) {
            if (j1 >= nums1.length) {
                last = nums2[j2];
                j2++;
                continue;
            }
            if (j2 >= nums2.length) {
                last = nums1[j1];
                j1++;
                continue;
            }
            if (nums1[j1] > nums2[j2]) {
                last = nums2[j2];
                j2++;
            } else {
                last = nums1[j1];
                j1++;
            }
        }
        int now;
        if (j1 >= nums1.length) {
            now = nums2[j2];
        } else {
            if (j2 >= nums2.length) {
                now = nums1[j1];
            } else {
                now = Math.min(nums1[j1], nums2[j2]);
            }
        }
        if ((long) (max + min) % 2 == 0) {

            return (double) (last + now) / 2;
        } else {
            return now;
        }
    }
}
