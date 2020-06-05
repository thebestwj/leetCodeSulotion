package com.wj.leetcode.Q1_100.Q35;

/**
 * Created by white_wolf on 2020/6/2.
 *
 * @author thebestwj
 */
//二分查找
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
