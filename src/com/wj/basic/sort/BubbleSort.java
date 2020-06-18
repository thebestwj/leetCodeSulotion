package com.wj.basic.sort;

/**
 * Created by white_wolf on 2020/6/18.
 *
 * @author thebestwj
 */
/**
 * 冒泡排序
 * 两两交换
 * O(n^2)
 */
public class BubbleSort implements SortAlgorithm {
    @Override
    public void sort(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) { //注意 N-i-1
                if (nums[j + 1] < nums[j]) swap(nums, j, j + 1);
            }
        }
    }
}
