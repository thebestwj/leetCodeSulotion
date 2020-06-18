package com.wj.basic.sort;

/**
 * Created by white_wolf on 2020/6/18.
 *
 * @author thebestwj
 */
/**
 * 插入排序
 * 将第i个元素插入到第0-i个元素中合适位置
 * O(N^2) 最差N^2/2
 */
public class InsertSort implements SortAlgorithm{
    @Override
    public void sort(int[] nums) {
        int N = nums.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && nums[j] < nums[j - 1]; j--) {
                swap(nums, j, j - 1);
            }
        }
    }
}
