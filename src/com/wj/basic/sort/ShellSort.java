package com.wj.basic.sort;

/**
 * Created by white_wolf on 2020/6/18.
 *
 * @author thebestwj
 */
/**
 * 希尔排序
 */
public class ShellSort implements SortAlgorithm {
    @Override
    public void sort(int[] nums) {
        int N = nums.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && nums[j] < nums[j - h]; j -= h) {
                    swap(nums, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
