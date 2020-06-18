package com.wj.basic.sort;

/**
 * Created by white_wolf on 2020/6/18.
 *
 * @author thebestwj
 */

/**
 * 选择排序
 * 将第i个元素与i+1~N中最小的元素交换
 * O(n^2)   N^2/2
 */
public class SelectSort implements SortAlgorithm {
    @Override
    public void sort(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (nums[j] < nums[min]) min = j;
            }
            swap(nums, i, min);
        }
    }
}
